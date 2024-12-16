package top.zjp.medicine.online.datav.service.impl;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.service.impl
 * @Project: medicine-online-data-view-screen0
 * @name: ExamServiceImplTest
 * @Date: 2024/12/12 16:42
 * @FileName: ExamServiceImplTest
 * @description:
 */
@SpringBootTest
@Slf4j
class ExamServiceImplTest {
@Resource
private ExamServiceImpl examService;
    @Test
    void getExamDetailDtoList() {
        examService.getExamDetailDtoList().forEach(item -> log.info(item.toString()));
    }
}
