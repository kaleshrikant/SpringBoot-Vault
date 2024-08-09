package com.shrikant.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties("external-api")
public class ExternalApiConfig {
    private String uri;
    private String apiKey;
}
