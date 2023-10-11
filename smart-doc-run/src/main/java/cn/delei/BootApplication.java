package cn.delei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application 入口
 *
 * @author deleiguo
 */
@SpringBootApplication
public class BootApplication {

    /**
     * Main方式启动方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // Spring Boot 启动入口
        SpringApplication.run(BootApplication.class, args);
    }
}