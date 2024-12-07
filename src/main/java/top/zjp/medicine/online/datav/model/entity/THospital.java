package top.zjp.medicine.online.datav.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.model.entity
 * @Project: medicine-online-data-view-screen0
 * @name: THospital
 * @Date: 2024/12/7 12:54
 * @FileName: THospital
 * @description:
 */
@Data
@Schema(description = "THospital 市区编码表")
@TableName("t_hospital")
public class THospital {
    @Schema(description = "主键唯一字段")
    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer pkId;
    @Schema(description = "市区名称")
    private String name;
    @Schema(description = "地区编码 对应考生所在地区编码")
    private String code;
    @Schema(description = "地区所属市区编码")
    private String parentCode;
}
