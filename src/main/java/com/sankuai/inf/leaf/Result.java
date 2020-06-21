package com.sankuai.inf.leaf;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    /**
     * default ok code
     */
    public static final int DEFAULT_OK = 0;

    /**
     * default ok message
     */
    public static final String DEFAULT_OK_MESSAGE = "success";

    /**
     * default failed code
     */
    public static final int DEFAULT_FAILED = 1;

    /**
     * response data
     */
    private T data;

    /**
     * error code
     */
    private int code;

    /**
     * error message
     */
    private String message;


    public static <T> Result success(T data) {
        return Result.builder()
                .data(data)
                .code(DEFAULT_OK)
                .message(DEFAULT_OK_MESSAGE)
                .build();
    }

    public static Result failed(String message) {
        return Result.builder()
                .code(ErrorCode.FAIL.code)
                .message(message)
                .build();
    }

    public static Result failed(int code) {
        return Result.builder()
                .code(code)
                .build();
    }

    public static Result failed(ErrorCode errorCode) {
        return Result.builder()
                .code(errorCode.code)
                .message(errorCode.desc)
                .build();
    }

    public static Result failed(int code, String message) {
        return Result.builder()
                .code(code)
                .message(message)
                .build();
    }

    public static Result newBizErr(String message) {
        return Result.builder()
                .code(ErrorCode.FAIL.code)
                .message(message)
                .build();
    }

    @JsonIgnore
    public boolean isSuccess() {
        return ErrorCode.SUCCESS.code == this.code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
