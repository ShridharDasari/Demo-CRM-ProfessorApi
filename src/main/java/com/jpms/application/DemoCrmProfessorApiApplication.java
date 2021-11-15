package com.jpms.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableAutoConfiguration
@Configuration
@EnableWebMvc
@ComponentScan({"com.jpms.*"})
@EnableSwagger2
public class DemoCrmProfessorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCrmProfessorApiApplication.class, args);
    }


    @Autowired
    private JdbcTemplate jdbcTemplate;



    public void run(String... args) throws Exception {
        String sql = "INSERT INTO user (userId,Name,Role) VALUES (?,?,?)";
        int result = jdbcTemplate.update(sql, 120, "Ravi", "Student");
        if (result > 0) {
            System.out.println("A new record inserted");
        }
    }



    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }

}
