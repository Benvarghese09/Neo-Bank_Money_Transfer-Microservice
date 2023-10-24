package com.arabbank.neobank.transfer.service.model.dto;

import lombok.Data;

@Data
public class ErrorDto {
    private String message;
    private String errorCode;

}
