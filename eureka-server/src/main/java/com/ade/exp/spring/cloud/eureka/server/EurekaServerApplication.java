package com.ade.exp.spring.cloud.eureka.server;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    //public static Integer port;
    //
    //@Value("${server.port}")
    //public void setPort(Integer port) {
    //    EurekaServerApplication.port = port;
    //}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
        //System.out.println(EurekaServerApplication.port);
    }
}
