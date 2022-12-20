package dev.be; //package root 주의! 하위 목록들이 호환될 수 있도록 @ComponentScan 개념을 명시할 것!

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
