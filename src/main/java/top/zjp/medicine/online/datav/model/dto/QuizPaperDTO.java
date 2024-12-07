package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: TQuizPaperDTO
 * @Date: 2024/12/7 14:33
 * @FileName: TQuizPaperDTO
 * @description:
 */
@Data
@Schema(description = "考卷信息结果集")
@AllArgsConstructor
public class QuizPaperDTO {
    @Schema(description = "考卷名称")
    private String title;
    @Schema(description = "单选题数")
    private Integer simpleScore;
    @Schema(description = "多选题数")
    private Integer multipleScore;
    @Schema(description = "填空题数")
    private Integer blankScore;
    @Schema(description = "每题分值(上三种题型数相加即为总题数，对应乘分值相加即为总分值)")
    private Integer singleScore;
    @Schema(description = "总提数")
    private Integer totalQuestion;
    @Schema(description = "总分")
    private Integer totalScore;
}
