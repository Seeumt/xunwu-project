package com.imooc.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.Enum.Status;
import lombok.Data;

@Data
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ApiResponse {

    private int code;
    private String message;
    private Object data;
    private boolean more;

    public static ApiResponse ofMessage(int code,String message) {
//        return new ApiResponse(code, message, new ApiResponse(666,"嘿嘿嘿"));
        return new ApiResponse(code, message,null);
    }

    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(Status.SUCCESS.getCode(),Status.SUCCESS.getStandardMessage(), data);
    }

    public static ApiResponse ofSuccess(Status status) {
        return new ApiResponse(status.getCode(),status.getStandardMessage(),null);
    }

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse() {
        this.code = Status.SUCCESS.getCode();
        this.message = Status.SUCCESS.getStandardMessage();
    }

    public ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
