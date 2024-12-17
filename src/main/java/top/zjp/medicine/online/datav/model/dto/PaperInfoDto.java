package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: PaperInfoDto
 * @Date: 2024/12/16 14:01
 * @FileName: PaperInfoDto
 * @description: PaperInfo
 */
@Data
@Schema(description = "PaperInfoDto")
@NoArgsConstructor
@AllArgsConstructor
public class PaperInfoDto {
    @Schema(description = "考卷名")
    private String paper;
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
}
