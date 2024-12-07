package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model
 * @Project: medicine-online-data-view-screen0
 * @name: QuizDataDTO
 * @Date: 2024/12/7 13:20
 * @FileName: QuizDataDTO
 * @description:
 */
@Data
@Schema(description = "总考核大屏数据集合")
@AllArgsConstructor
public class QuizDataDTO {
    @Schema(description = "考核名称")
    private List<String> titles;
    @Schema(description = "地区考核信息结果集")
    private List<QuizCityDTO> quizCity;
    @Schema(description = "考核信息结果集")
    private List<QuizItemDTO> quizItem;
    @Schema(description = "学员信息结果集")
    private List<QuizStudentDTO> quizStudent;
}
