package top.zjp.medicine.online.datav.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zjp.medicine.online.datav.common.result.Result;
import top.zjp.medicine.online.datav.service.*;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.controller
 * @Project: medicine-online-data-view-screen0
 * @name: quizDataController
 * @Date: 2024/12/6 16:44
 * @FileName: quizDataController
 * @description:
 */
@Tag(name = "考核数据")
@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class quizDataController {
    private final TQuizItemExamService tQuizItemExamService;
    private final TQuizItemExamStudentService tQuizItemExamStudentService;
    private final TQuizPaperService tQuizPaperService;
    private final TQuizPaperStudentService tQuizPaperStudentService;
    private final TStudentService tStudentService;

    @PostMapping("data")
    @Operation(summary = "数据")
    public Result data() {
        return Result.ok();
    }
}
