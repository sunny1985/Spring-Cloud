package com.intelligencesoft.springcloud.system.service.impl;

import com.intelligencesoft.springcloud.system.service.ConsumerClientService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ConsumerClientServiceHystrix implements ConsumerClientService {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
