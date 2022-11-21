package com.learning.springbucksclient;

import com.learning.springbucksclient.config.RestTemplateConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;

@Slf4j
@SpringBootApplication
public class SpringbucksClientApplication {

	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbucksClientApplication.class, args);

	}

	@PostConstruct
	public void callMenu() {
		String url1 = "http://localhost:8080/springbucks/menu1";
		String url2 = "http://localhost:8080/springbucks/menu2";

		ResponseEntity<String> response1 = restTemplate.postForEntity(url1, null, String.class);
		ResponseEntity<String> response2 = restTemplate.postForEntity(url2, null, String.class);

		String xml = new String(response2.getBody().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

		log.info("Response of json is: {}", response1.getBody());

		log.info("Response of xml is: {}", xml);
	}

}
