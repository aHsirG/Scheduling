package io.github.ahsirg.scheduling;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SchedulingCoreMain {
    public static void main(String[] args) {
        SpringApplication.run(SchedulingLibMain.class, args);
    }
}
