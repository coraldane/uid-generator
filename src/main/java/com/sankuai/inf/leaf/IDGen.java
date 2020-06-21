package com.sankuai.inf.leaf;

public interface IDGen {
    Result<Long> get(String key);
    boolean init();
}
