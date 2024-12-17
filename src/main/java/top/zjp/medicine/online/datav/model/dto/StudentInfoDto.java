package top.zjp.medicine.online.datav.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.dto
 * @Project: medicine-online-data-view-screen0
 * @name: StudentInfoDto
 * @Date: 2024/12/16 14:05
 * @FileName: StudentInfoDto
 * @description: StudentInfo
 */
@Data
@Schema(description = "StudentInfoDto")
@AllArgsConstructor
public class StudentInfoDto {
    @Schema(description = "学员数量")
    private int studentCount;
    @Schema(description = "考卷数量")
    private int paperCount;
    @Schema(description = "是否完成数量映射")
    private Map<Integer, Integer> finishCountMap;
    @Schema(description = "学员成绩数量映射")
    private Map<Integer, Integer> gradeCountMap;

    public StudentInfoDto() {
        this.studentCount = 0;
        this.gradeCountMap = new HashMap<>();
        this.finishCountMap = new HashMap<>();
        this.paperCount = 0;

        // 初始化成绩和完成状态的映射
        for (int i = 0; i < 4; i++) {
            this.gradeCountMap.put(i, 0);
        }
        for (int i = 0; i < 2; i++) {
            this.finishCountMap.put(i, 0);
        }
    }
}
