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
 * @description:
 */
@Data
@Schema(description = "PaperInfoDto")
@NoArgsConstructor
@AllArgsConstructor
public class PaperInfoDto {
    private String paper; // 考卷名
    private Integer sin; // 单选分值
    private Integer mul; // 多选分值
    private Integer blank; // 填空分值
    private Integer sinN; // 单选数
    private Integer mulN; // 多选数
    private Integer blankN; // 填空数
    private Integer totalS; // 总分
    private Integer totalN; // 总题数
}
