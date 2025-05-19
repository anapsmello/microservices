package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.service.CardsFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient {
    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
