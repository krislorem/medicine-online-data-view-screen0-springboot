package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.entity
 * @Project: medicine-online-data-view-screen0
 * @name: TStudent
 * @Date: 2024/12/5 19:24
 * @FileName: tStudent
 * @description:
 */
@Data
@Schema(description = "TStudent")
@TableName("t_student")
public class TStudent {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;

    @Schema(description = "市区")
    private String cityCode;

}
