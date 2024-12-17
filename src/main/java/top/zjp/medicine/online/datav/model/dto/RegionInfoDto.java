package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: RegionInfoDto
 * @Date: 2024/12/16 14:00
 * @FileName: RegionInfoDto
 * @description: RegionInfo
 */
@Data
@Schema(description = "RegionInfoDto")
@NoArgsConstructor
@AllArgsConstructor
public class RegionInfoDto {
    @Schema(description = "地区名称")
    private String city;
    @Schema(description = "学员数量")
    private int studentCount;
    @Schema(description = "是否完成数量映射")
    private Map<Integer, Integer> finishCountMap;
    @Schema(description = "学员成绩数量映射")
    private Map<Integer, Integer> gradeCountMap;
}
