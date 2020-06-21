package com.liutian.tools.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.uid.UidGenerator;
import com.sankuai.inf.leaf.Result;
import com.sankuai.inf.leaf.segment.SegmentIDGenImpl;

@RestController
@RequestMapping(value="/uid")
public class UidController {
	
	@Resource(name = "cachedUidGenerator")
    private UidGenerator cachedUidGenerator;
	
	@Autowired
	private SegmentIDGenImpl idGen;
	
    @GetMapping("/snowflake")
    public String snowflake() {
        return String.valueOf(this.cachedUidGenerator.getUID());
    }
    
    @GetMapping(value = "/segment/{key}")
    public Result<Long> getSegment(@PathVariable("key") String key) throws Exception {
    	return this.idGen.get(key);
    }
    
}
