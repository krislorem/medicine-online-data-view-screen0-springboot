package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.entity
 * @Project: medicine-online-data-view-screen0
 * @name: tQuizExamStudent
 * @Date: 2024/12/6 16:30
 * @FileName: tQuizExamStudent
 * @description:
 */
@Data
@Schema(description = "TQuizItemExamStudent")
@TableName("t_quiz_item_exam_student")
public class TQuizItemExamStudent {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;

    @Schema(description = "去重后即为应考人数")
    private Integer studentId;
}
