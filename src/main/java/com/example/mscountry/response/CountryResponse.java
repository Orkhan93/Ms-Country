package com.example.mscountry.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryResponse {

    private String name;
    private BigDecimal remainingLimit;

}