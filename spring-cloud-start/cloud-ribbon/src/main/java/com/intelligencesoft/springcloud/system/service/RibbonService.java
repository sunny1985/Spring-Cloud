package com.intelligencesoft.springcloud.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String addService(){
        return restTemplate.getForEntity("http://cloud-consumer/add?a=10&b=20",String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }
}
