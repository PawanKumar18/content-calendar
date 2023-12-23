package com.example.contentcalendar;

import com.example.contentcalendar.config.ContentCalendarProperties;
import com.example.contentcalendar.model.Content;
import com.example.contentcalendar.model.Status;
import com.example.contentcalendar.model.Type;
import com.example.contentcalendar.repository.ContentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository contentRepository) {
		return args -> {
			Content content = new Content(
							null,
							"Hello chat gpt",
							"All about chat gpt",
							Status.IDEA,
							Type.VIDEO,
							LocalDateTime.now(),
							null,
							"");

							contentRepository.save(content);
		};
	}

}
