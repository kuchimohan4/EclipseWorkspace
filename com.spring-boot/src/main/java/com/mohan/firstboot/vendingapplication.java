package com.mohan.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//for springfox-swagger-ui it just listuns to /api
public class vendingapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(vendingapplication.class, args);

	}
	
	@Bean
	public Docket swaggerConfiguration() {
	
		//it will create an instance of docket and spring will hold o to it
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
//				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.mohan"))
				.build()
				.apiInfo(apiInf());
	}
	
	private ApiInfo apiInf() {
		return new ApiInfo("address student api", "sample api for spring boot","1.0", "free to use","kuchi mohan", "api license", "https://google.com");
	}
	
	

}
