package org.example.universitystarter;

import org.example.universitystarter.config.UniversityStarterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(UniversityStarterConfiguration.class)
public class UniversityStarterApplicationConfig {


}
