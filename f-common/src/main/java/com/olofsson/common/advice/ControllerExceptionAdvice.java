package com.olofsson.common.advice;

import com.olofsson.common.exception.FException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//相当于给对应的controller加了try
@ControllerAdvice
@Slf4j
public class ControllerExceptionAdvice {

//一个的情况下 class可写可不写
    @ExceptionHandler(FException.class)
    public ResponseEntity<String> handleException(FException ex) {

        return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {

        return ResponseEntity.status(500).body(ex.getMessage());
    }
}
