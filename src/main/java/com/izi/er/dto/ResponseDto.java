package com.izi.er.dto;

import org.springframework.http.HttpStatus;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class ResponseDto<T> {
    private T massage;
    private HttpStatus status;
}
