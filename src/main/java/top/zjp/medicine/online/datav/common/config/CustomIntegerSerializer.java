package top.zjp.medicine.online.datav.common.config;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.common.config
 * @Project: medicine-online-data-view-screen0
 * @name: JacksonConfig
 * @Date: 2024/12/16 14:28
 * @FileName: JacksonConfig
 * @description:
 */
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Objects;

// 自定义序列化器
public class CustomIntegerSerializer extends StdSerializer<Integer> {

    // 构造函数，需要传递一个JavaType参数
    protected CustomIntegerSerializer() {
        super(Integer.class, false);
    }

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        // 将null值序列化为0
        gen.writeNumber(Objects.requireNonNullElse(value, 0));
    }
}
