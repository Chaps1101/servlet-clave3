package com.ubam.servletclave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import jakarta.servlet.http.HttpServlet;

@SpringBootApplication
public class ServletClaveApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServletClaveApplication.class, args);
  }

  @Bean
  public ServletRegistrationBean<HttpServlet> registroMiServlet() {
    return new ServletRegistrationBean<>(new MiServlet(), "/generar");
  }
}
