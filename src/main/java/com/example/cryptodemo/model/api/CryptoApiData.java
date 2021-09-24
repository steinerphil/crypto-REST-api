package com.example.cryptodemo.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoApiData {

    @JsonProperty
    private String ada;

    @JsonProperty
    private String btc;

    @JsonProperty
    private String doge;
}
