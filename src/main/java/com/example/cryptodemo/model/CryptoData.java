package com.example.cryptodemo.model;

import com.example.cryptodemo.model.api.CryptoApiData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoData {

    private String date;
    private CryptoApiData quotes;

}
