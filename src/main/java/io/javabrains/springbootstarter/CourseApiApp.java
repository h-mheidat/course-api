package io.javabrains.springbootstarter;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CourseApiApp {
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

	@Bean
	public static Docket swaggerConfiguration() {
		// Return a prepared Docket instance 
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("io.javabrains"))
				.build()
				.apiInfo(apiDetalils());
	}

	private static ApiInfo apiDetalils() {
		return new ApiInfo("Course API App", "A java spring boot restful API for course", "1.0.0", "free to use", new springfox.documentation.service.Contact("hamzah", "https://github.com/h-mheidat", "hamzahheidat96@gmil.com"), "API course", "https://github.com/h-mheidat", Collections.emptyList());
	}
}
