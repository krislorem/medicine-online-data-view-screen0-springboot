package top.zjp.medicine.online.datav.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.zjp.medicine.online.datav.mapper.ExamMapper;
import top.zjp.medicine.online.datav.model.dto.ExamDetailDto;
import top.zjp.medicine.online.datav.service.ExamService;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.service.impl
 * @Project: medicine-online-data-view-screen0
 * @name: ExamServiceImpl
 * @Date: 2024/12/12 16:39
 * @FileName: ExamServiceImpl
 * @description:
 */
@Service
@AllArgsConstructor
public class ExamServiceImpl extends ServiceImpl<ExamMapper, ExamDetailDto> implements ExamService {
    private final ExamMapper examMapper;
    @Override
    public List<ExamDetailDto> getExamDetailDtoList() {
        return examMapper.selectExamDetails();
    }
}
