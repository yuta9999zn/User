package com.zosh.exception;

import com.zosh.payload.response.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> ExceptionHanderler(Exception ex,  WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(
                ex.getMessage(),
                request.getDescription(false), LocalDateTime.now()
        );
        return ResponseEntity.ok(response);
    }
}
