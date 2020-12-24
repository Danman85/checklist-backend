package nl.danman85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ChecklistApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ChecklistApplication.class, args);
	}

	// Add resource handler to serve static content from another location
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	}
}
