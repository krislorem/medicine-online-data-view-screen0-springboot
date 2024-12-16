package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: ExamGroupDto
 * @Date: 2024/12/16 13:59
 * @FileName: ExamGroupDto
 * @description:
 */
@Data
@Schema(description = "ExamGroupDto")
@NoArgsConstructor
@AllArgsConstructor
public class ExamGroupDto {
    private String name; // 考试标题
    private LocalDateTime end; // 结束时间
    private Integer start; // 是否开始
    private List<RegionInfoDto> regionInfoList; // 地区信息列表
    private List<PaperInfoDto> paperInfoList; // 考卷信息列表
    private StudentInfoDto studentInfo; // 学员信息
}
