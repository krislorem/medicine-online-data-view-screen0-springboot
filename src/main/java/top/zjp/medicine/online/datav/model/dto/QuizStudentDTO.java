package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: QuizStudentDTO
 * @Date: 2024/12/7 14:17
 * @FileName: QuizStudentDTO
 * @description:
 */
@Data
@Schema(description = "学员信息结果集")
@AllArgsConstructor
public class QuizStudentDTO {
    @Schema(description = "总应考人数")
    private Integer ought;
    @Schema(description = "分配试卷")
    private Integer alloc;
    @Schema(description = "未签到")
    private Integer nin;
    @Schema(description = "签到人数")
    private Integer in;
    @Schema(description = "答题中")
    private Integer answering;
    @Schema(description = "未考核")
    private Integer absent;
    @Schema(description = "实考人数")
    private Integer actual;
    @Schema(description = "总完成考试")
    private Integer finished;
    @Schema(description = "总合格人数")
    private Integer passed;
}
