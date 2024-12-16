package top.zjp.medicine.online.datav.common.config;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.common.config
 * @Project: medicine-online-data-view-screen0
 * @name: JacksonConfig
 * @Date: 2024/12/16 14:35
 * @FileName: JacksonConfig
 * @description:
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        // 注册自定义序列化器
        module.addSerializer(Integer.class, new CustomIntegerSerializer());
        mapper.registerModule(module);
        // 注册JavaTimeModule
        mapper.registerModule(new JavaTimeModule());
        return mapper;
    }
}
