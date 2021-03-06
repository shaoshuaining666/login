package com.hotlel.demo.service.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Create By LB on 2020/6/3.
 */
@Slf4j
@Service
public class CommonTemplateService {

    @Resource
    private RestTemplate restTemplate;

    public ResponseEntity<String> getForEntity(String url) {
        return restTemplate.getForEntity(url, String.class);
    }
}
