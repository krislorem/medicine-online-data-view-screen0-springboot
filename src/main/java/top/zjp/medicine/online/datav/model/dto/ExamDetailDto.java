package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: ExamDetailDto
 * @Date: 2024/12/12 16:33
 * @FileName: ExamDetailDto
 * @description: ExamDetail
 */
@Data
@Schema(description = "Columns: 考试标题, 考卷名, 结束时间, 是否开始, 学员名, 地区名称, 单选分值, 多选分值, 填空分值, 单选数, 多选数, 填空数, 总题数, 总分, 成绩, 是否完成")
@NoArgsConstructor
@AllArgsConstructor
public class ExamDetailDto {
    @Schema(description = "考试标题")
    private String name;
    @Schema(description = "考卷名")
    private String paper;
    @Schema(description = "结束时间")
    private LocalDateTime end;
    @Schema(description = "是否开始")
    private Integer start;
    @Schema(description = "学员名")
    private String student;
    @Schema(description = "地区名称")
    private String city;
    @Schema(description = "单选分值")
    private Integer sin;
    @Schema(description = "多选分值")
    private Integer mul;
    @Schema(description = "填空分值")
    private Integer blank;
    @Schema(description = "单选数")
    private Integer sinN;
    @Schema(description = "多选数")
    private Integer mulN;
    @Schema(description = "填空数")
    private Integer blankN;
    @Schema(description = "总题数")
    private Integer totalN;
    @Schema(description = "总分")
    private Integer totalS;
    @Schema(description = "成绩")
    private Integer grade;
    @Schema(description = "是否完成")
    private Integer finish;
}
