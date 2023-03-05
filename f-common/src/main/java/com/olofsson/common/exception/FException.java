package com.olofsson.common.exception;

import lombok.Getter;

@Getter
public class FException extends RuntimeException {
    /**
     * 异常状态码信息
     */
    private int status;

    public FException(int status) {
        this.status = status;
    }

    public FException(int status, String message) {
        super(message);
        this.status = status;
    }

    public FException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public FException(int status, Throwable cause) {
        super(cause);
        this.status = status;
    }
}
