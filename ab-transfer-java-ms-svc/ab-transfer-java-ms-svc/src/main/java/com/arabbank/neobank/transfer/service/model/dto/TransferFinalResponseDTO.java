package com.arabbank.neobank.transfer.service.model.dto;

import com.arabbank.neobank.transfer.service.model.entity.Currency;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class TransferFinalResponseDTO {
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private BigDecimal amount;
    private String transferID;
}
