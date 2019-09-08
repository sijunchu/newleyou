package com.leyou.common.advice;

import com.leyou.common.exceptions.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Date:2019/9/8 description:
 */
@ControllerAdvice
@Slf4j
public class ExceptionAdvice {
    @ExceptionHandler(LyException.class)
    public ResponseEntity<String> handleException(LyException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
