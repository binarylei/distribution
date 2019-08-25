package com.binarylei.dubbosentinel.consumer;

import com.binarylei.dubbosentinel.api.SentinelService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Controller;

@Service
public class SentinelServiceImpl implements SentinelService {


    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
