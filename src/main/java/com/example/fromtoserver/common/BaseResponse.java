package com.example.fromtoserver.common;

import lombok.Getter;

@Getter
public class BaseResponse<T> {
    private final Boolean success;
    private final T result;
    private final BaseException error;

    public BaseResponse(T result) {
        this.success = true;
        this.result = result;
        this.error = null;
    }

}
