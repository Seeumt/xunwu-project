package com.imooc.Enum;

import lombok.Getter;
import org.hibernate.hql.internal.ast.ErrorReporter;

@Getter
public enum Status {
    SUCCESS(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    INTERNAL_SERVER_ERROR(500, "Unknown Internal  Error"),
    NOT_VALID_PARAM(40005, "Not valid Params"),
    NOT_SUPPORTED_OPERATION(40006,"Operation not supported"),
    NOT_LOGIN(50000, "Not Login"),
    ;
    private int code;
    private String standardMessage;

    Status(int code, String standardMessage) {
        this.code = code;
        this.standardMessage = standardMessage;
    }
}
