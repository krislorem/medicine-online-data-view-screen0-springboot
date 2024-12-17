package top.zjp.medicine.online.datav.common.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.common.result
 * @Project: medicine-online-data-view-screen0
 * @name: Result
 * @Date: 2024/12/6 15:41
 * @FileName: Result
 * @description: 响应体包装
 */
@Data
@Schema(description = "响应数据")
@SuppressWarnings("unused")
public class Result<T> {
    @Schema(description = "编码 0表示成功，其他值表示失败")
    private int code = 0;

    @Schema(description = "消息内容")
    private String msg = "success";

    @Schema(description = "响应数据")
    private T data;

    public static <T> Result<T> ok() {
        return ok(null);
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(int code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}

