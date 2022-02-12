package com.jamlee.ipadtracker;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Slf4j
@AutoConfigureMockMvc
class IpadTrackerApplicationTests {

    private static final String BASE_URL = "https://v2api.lglifecare.com/svc/svcOrder/listShoppingTracker?siteID=LGCNS&deviceType=pc&orderNo=2312936";

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    void doGet_예제() throws Exception {
//
//        mockMvc.perform(
//                    post(BASE_URL) //.header(HttpHeaders.ACCEPT, "application/json, text/plain, */*")
//                            .accept(MediaType.ALL_VALUE)
//                )
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//        ;
//    }

    @Test
    void doGet_예제2() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/json, text/plain, */*");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(BASE_URL, String.class);
        log.info("statusCode : {}" , responseEntity.getStatusCode());
        log.info("body : {}" , responseEntity.getBody());
    }

}
