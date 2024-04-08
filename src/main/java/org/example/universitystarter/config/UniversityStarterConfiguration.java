package org.example.universitystarter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class UniversityStarterConfiguration {

    private final String result = "University Starter is up";

    @Bean
    @ConditionalOnProperty(value = "university-starter.enable", havingValue = "true")
    public String initialized() {
        log.info("University Starter is up");
        return result;
    }
}
