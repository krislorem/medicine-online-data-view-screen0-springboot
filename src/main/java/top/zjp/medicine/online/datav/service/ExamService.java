package top.zjp.medicine.online.datav.service;

import top.zjp.medicine.online.datav.model.dto.ExamDetailDto;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.service
 * @Project: medicine-online-data-view-screen0
 * @name: ExamService
 * @Date: 2024/12/12 16:38
 * @FileName: ExamService
 * @description:
 */
public interface ExamService {
    List<ExamDetailDto> getExamDetailDtoList();
}
