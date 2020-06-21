package com.liutian.tools.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.uid.UidGenerator;

@RestController
@RequestMapping(value="/uid")
public class UidController {
	
	@Resource(name = "defaultUidGenerator")
    private UidGenerator defaultUidGenerator;
	
    @GetMapping("/generate")
    public String generate() {
        return String.valueOf(this.defaultUidGenerator.getUID());
    }
    
}
