package com.example.cryptodemo.model.api;

import com.example.cryptodemo.model.CryptoData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OuterApiData {

    @JsonProperty
    private String date;
    @JsonProperty("eur")
    private CryptoApiData quotes;

}