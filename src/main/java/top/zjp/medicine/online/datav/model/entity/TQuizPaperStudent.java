package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.entity
 * @Project: medicine-online-data-view-screen0
 * @name: TQuizPaperStudent
 * @Date: 2024/12/5 19:27
 * @FileName: tQuizPaperStudent
 * @description:
 */
@Data
@Schema(description = "TQuizPaperStudent")
@TableName("t_quiz_paper_students")
public class TQuizPaperStudent {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;
    @Schema(description = "去重后即为签到人数,应考-签到=未签到")
    private Integer studentId;
    @Schema(description = "0未完成 1已完成(签到-已完成=实考人数)")
    private Integer isFinish;
    @Schema(description = "0暂无(未考核) 1判定中(答题中) 2不合格 3合格")
    private Integer grade;
}

