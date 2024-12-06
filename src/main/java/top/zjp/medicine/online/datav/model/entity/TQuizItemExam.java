package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.entity
 * @Project: medicine-online-data-view-screen0
 * @name: tQuizItemExam
 * @Date: 2024/12/5 18:23
 * @FileName: tQuizItemExam
 * @description:
 */
@Data
@Schema(description = "tQuizItemExam")
@TableName("t_quiz_item_exam")
public class TQuizItemExam {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;

    @Schema(description = "考试标题")
    private String title;

    @Schema(description = "结束时间")
    private LocalDateTime endTime;

    @Schema(description = "是否开启:0关闭(已结束) 1开启(倒计时)")
    @TableField("is_start")
    private Integer isStart;

    @TableField("delete_flag")
    @TableLogic
    @JsonIgnore
    private Integer deleteFlag;
}
