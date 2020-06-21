package com.sankuai.inf.leaf;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ErrorCode {
    /**
     * 默认的请求成功错误码
     */
    SUCCESS(0, "success"),
    /**
     * 默认的请求失败错误码
     */
    FAIL(-99, "fail"),
    IDCACHE_INIT_FALSE(-1, "InitFailure"),  //IDCache未初始化成功时的异常码
    KEY_NOT_EXISTS(-2, "KeyNotExists"),  //key不存在时的异常码
    TWO_SEGMENTS_ARE_NULL(-3, "SegmentsAreEmpty"), //SegmentBuffer中的两个Segment均未从DB中装载时的异常码
    ;

    public Integer code;
    public String desc;

}