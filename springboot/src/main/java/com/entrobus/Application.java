package com.entrobus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    /**
     * <p>
     * 1、启动执行<br>
     * 2、访问 http://localhost:8080/token 提示登录<br>
     * 3、登录 访问 http://localhost:8080/login 成功再去 2 步骤查看<br>
     * </p>
     * <p>
     * 退出登录：http://localhost:8080/logout
     * </p>
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
//        while (true){
//            System.out.println(System.currentTimeMillis());
//            try{
//                Thread.sleep(3000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
    }

}
