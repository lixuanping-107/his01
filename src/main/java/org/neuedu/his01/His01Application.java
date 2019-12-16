package org.neuedu.his01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="org.neuedu.his01.mapper")
public class His01Application {

    public static void main(String[] args) {
        SpringApplication.run(His01Application.class, args);
    }

}
