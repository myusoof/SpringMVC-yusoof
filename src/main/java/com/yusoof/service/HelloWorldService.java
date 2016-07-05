package com.yusoof.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by yusoof on 3/7/16.
 */
@Service
public class HelloWorldService {

    public String getDesc() {
        return "Yusoof";
    }

    public String getTitle(String name) {
        if(StringUtils.isEmpty(name)){
            return "Hello World";
        }else{
            return "Hello " + name;
        }

    }
}
