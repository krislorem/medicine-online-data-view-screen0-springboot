package top.zjp.medicine.online.datav.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zjp.medicine.online.datav.common.result.Result;
import top.zjp.medicine.online.datav.model.dto.*;
import top.zjp.medicine.online.datav.service.impl.ExamServiceImpl;

import java.util.*;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.controller
 * @Project: medicine-online-data-view-screen0
 * @name: quizDataController
 * @Date: 2024/12/6 16:44
 * @FileName: QuizDataController
 * @description: 接口
 */
@Tag(name = "考核数据")
@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class QuizDataController {
    private final ExamServiceImpl examService;
    @GetMapping("data")
    @Operation(summary = "数据")
    public Result<List<ExamGroupDto>> data() {
        List<ExamDetailDto> examDetail = examService.getExamDetailDtoList();
        return Result.ok(aggregateExamData(examDetail));
    }
    public List<ExamGroupDto> aggregateExamData(List<ExamDetailDto> examDetails) {
        Map<String, ExamGroupDto> examGroups = new LinkedHashMap<>();
        examDetails.forEach(detail -> {
            // 考试标题分组
            ExamGroupDto examGroup = examGroups.computeIfAbsent(detail.getName(), k -> {
                ExamGroupDto newGroup = new ExamGroupDto();
                newGroup.setName(k);
                newGroup.setEnd(detail.getEnd());
                newGroup.setStart(detail.getStart());
                newGroup.setRegionInfoList(new ArrayList<>());
                newGroup.setPaperInfoList(new ArrayList<>());
                newGroup.setStudentInfo(new StudentInfoDto());
                return newGroup;
            });

            // 更新学员信息
            StudentInfoDto studentInfo = examGroup.getStudentInfo();
            studentInfo.setStudentCount(studentInfo.getStudentCount() + 1);
            studentInfo.getGradeCountMap().merge(detail.getGrade(), 1, Integer::sum);
            studentInfo.getFinishCountMap().merge(detail.getFinish(), 1, Integer::sum);
            studentInfo.setPaperCount(studentInfo.getPaperCount() + 1);

            // 地区信息分组
            RegionInfoDto regionInfo = examGroup.getRegionInfoList().stream()
                    .filter(r -> r.getCity().equals(detail.getCity()))
                    .findFirst()
                    .orElseGet(() -> {
                        RegionInfoDto newRegion = new RegionInfoDto();
                        newRegion.setCity(detail.getCity());
                        newRegion.setStudentCount(1);
                        newRegion.setGradeCountMap(new HashMap<>());
                        newRegion.setFinishCountMap(new HashMap<>());
                        examGroup.getRegionInfoList().add(newRegion);
                        return newRegion;
                    });

            // 更新地区信息
            regionInfo.setStudentCount(regionInfo.getStudentCount() + 1);
            regionInfo.getGradeCountMap().merge(detail.getGrade(), 1, Integer::sum);
            regionInfo.getFinishCountMap().merge(detail.getFinish(), 1, Integer::sum);

            // 考卷信息分组
            examGroup.getPaperInfoList().stream()
                    .filter(p -> p.getPaper().equals(detail.getPaper()))
                    .findFirst()
                    .orElseGet(() -> {
                        PaperInfoDto newPaper = new PaperInfoDto();
                        newPaper.setPaper(detail.getPaper());
                        newPaper.setSin(detail.getSin());
                        newPaper.setMul(detail.getMul());
                        newPaper.setBlank(detail.getBlank());
                        newPaper.setSinN(detail.getSinN());
                        newPaper.setMulN(detail.getMulN());
                        newPaper.setBlankN(detail.getBlankN());
                        newPaper.setTotalS(detail.getTotalS());
                        newPaper.setTotalN(detail.getTotalN());
                        examGroup.getPaperInfoList().add(newPaper);
                        return newPaper;
                    });
            // 更新考卷信息
            // 这里不需要更新数量，因为我们只需要去重后的考卷数量
        });
        // 计算考卷数量
        examGroups.values().forEach(examGroup -> {
            Set<String> uniquePapers = new HashSet<>();
            examGroup.getPaperInfoList().forEach(paperInfo -> uniquePapers.add(paperInfo.getPaper()));
            // 设置去重后的考卷数量
            examGroup.getStudentInfo().setPaperCount(uniquePapers.size());
            // 确保成绩和完成状态的映射中包含所有必要的键
            initMapIfAbsent(examGroup.getStudentInfo().getGradeCountMap(), 4);
            initMapIfAbsent(examGroup.getStudentInfo().getFinishCountMap(), 2);

            examGroup.getRegionInfoList().forEach(regionInfo -> {
                initMapIfAbsent(regionInfo.getGradeCountMap(), 4);
                initMapIfAbsent(regionInfo.getFinishCountMap(), 2);
            });
        });
        return new ArrayList<>(examGroups.values());
    }
    private void initMapIfAbsent(Map<Integer, Integer> map, int end) {
        for (int i = 0; i < end; i++) {
            map.putIfAbsent(i, 0);
        }
    }
}
