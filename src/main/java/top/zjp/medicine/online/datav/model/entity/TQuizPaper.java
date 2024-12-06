package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.entity
 * @Project: medicine-online-data-view-screen0
 * @name: tQuizPaper
 * @Date: 2024/12/5 19:27
 * @FileName: tQuizPaper
 * @description:
 */
@Data
@Schema(description = "TQuizPaper")
@TableName("t_quiz_paper")
public class TQuizPaper {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;

    @Schema(description = "是同一考核id的个数即为分配试卷数")
    private Integer quizExamId;

    @Schema(description = "分卷标题")
    private String title;

    @Schema(description = "单选题数")
    private Integer simpleScore;

    @Schema(description = "多选题数")
    private Integer multipleScore;

    @Schema(description = "填空题数")
    private Integer blankScore;

    @Schema(description = "每题分值(上三种题型数相加即为总题数，对应乘分值相加即为总分值)")
    private Integer score;

    @Schema(description = "0:未删除  1:已删除")
    @TableField("delete_flag")
    @TableLogic
    @JsonIgnore
    private Integer deleteFlag;
}
