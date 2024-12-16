package top.zjp.medicine.online.datav;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author krislorem
 */
@SpringBootApplication(scanBasePackages = "top.zjp.medicine.online.datav")
@MapperScan("top.zjp.medicine.online.datav.mapper")
public class MedicineOnlineDataViewScreen0Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MedicineOnlineDataViewScreen0Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MedicineOnlineDataViewScreen0Application.class);
    }
}
