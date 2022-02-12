package com.jamlee.ipadtracker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class Scheduler {

    @Value("${BASE_URL}")
    private String BASE_URL;

    // 5초마다 실행
    @Scheduled(cron = "*/30 * * * * *")
    public void text() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/json, text/plain, */*");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Response> responseEntity = restTemplate.getForEntity(BASE_URL, Response.class);
        log.info("statusCode : {}" , responseEntity.getStatusCode());
        log.info("body : {}" , responseEntity.getBody());

    }
}
