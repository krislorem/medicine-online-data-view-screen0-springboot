package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: QuizItemDTO
 * @Date: 2024/12/7 14:16
 * @FileName: QuizItemDTO
 * @description:
 */
@Data
@Schema(description = "考核信息结果集")
@AllArgsConstructor
public class QuizItemDTO {
    @Schema(description = "是否结束")
    private Integer isOver;
    @Schema(description = "结束日期")
    private String endTime;
    @Schema(description = "考卷信息结果集")
    private List<QuizPaperDTO> quizPaper;
}
