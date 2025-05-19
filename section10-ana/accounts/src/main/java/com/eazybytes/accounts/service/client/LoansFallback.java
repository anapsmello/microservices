package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.dto.LoansDto;
import com.eazybytes.accounts.service.LoansFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient {
    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
