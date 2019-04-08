package com.techstack.helloworld.runner;

import com.techstack.helloworld.api.MetaDataService;
import com.techstack.helloworld.runner.config.MetadataProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.ServiceLoader;

@SpringBootApplication
@EnableConfigurationProperties(MetadataProperties.class)
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@Bean
	public MetaDataService metaDataService(MetadataProperties metadataProperties) {
		MetaDataService service = ServiceLoader.load(MetaDataService.class).findFirst().orElseThrow(() -> new RuntimeException("No Metadata service found!"));
		metadataProperties.getMetadata().entrySet().forEach(entry -> service.add(entry.getKey(), entry.getValue()));
		return service;
	}
}
