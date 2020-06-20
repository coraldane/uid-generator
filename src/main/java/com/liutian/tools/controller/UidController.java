package com.liutian.tools.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.uid.UidGenerator;

@RestController
public class UidController {
	
	@Resource(name = "defaultUidGenerator")
    private UidGenerator uidGenerator;
	
    @GetMapping("/uidGenerator")
    public String UidGenerator() {
        return String.valueOf(this.uidGenerator.getUID());
    }
    
}
