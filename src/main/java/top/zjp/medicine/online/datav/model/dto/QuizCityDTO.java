package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: QuizCityDTO
 * @Date: 2024/12/7 14:17
 * @FileName: QuizCityDTO
 * @description:
 */
@Data
@Schema(description = "地区考核信息结果集")
@AllArgsConstructor
public class QuizCityDTO {
    @Schema(description = "城市名称")
    private List<String> cities;
    @Schema(description = "应考人数")
    private List<Integer> ought;
    @Schema(description = "实考人数")
    private List<Integer> actual;
    @Schema(description = "完成考核")
    private List<Integer> finished;
    @Schema(description = "合格人数")
    private List<Integer> passed;
    @Schema(description = "不合格人数")
    private List<Integer> failed;
    @Schema(description = "未考人数")
    private List<Integer> absent;
}
