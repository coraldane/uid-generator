package com.sankuai.inf.leaf.segment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sankuai.inf.leaf.segment.model.LeafAlloc;

public interface IDAllocDao {
	
     List<LeafAlloc> getAllLeafAllocs();

     LeafAlloc getLeafAlloc(@Param("tag") String tag);

     void updateMaxId(@Param("tag") String tag);

     void updateMaxIdByCustomStep(LeafAlloc leafAlloc);
     
     List<String> getAllTags();
}
