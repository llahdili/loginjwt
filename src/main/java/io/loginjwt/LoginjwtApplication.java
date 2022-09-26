package io.loginjwt;

import io.loginjwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class LoginjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginjwtApplication.class, args);
	}

}
