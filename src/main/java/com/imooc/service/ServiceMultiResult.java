package com.imooc.service;

import lombok.Data;

import java.util.List;
@Data
public class ServiceMultiResult<T> {
    private long total;
    private List<T> result;

    public int getResultSize() {
        if (this.result == null) {
            return 0;
        }
        return this.result.size();
    }
}
