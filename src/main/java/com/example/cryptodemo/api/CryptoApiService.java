package com.example.cryptodemo.api;

import com.example.cryptodemo.model.CryptoData;
import com.example.cryptodemo.model.api.OuterApiData;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoApiService {

    private final String BASE_URL = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/eur.json";
    private final RestTemplate restTemplate = new RestTemplate();

    public OuterApiData getApiData(){
        ResponseEntity<OuterApiData> response = restTemplate.getForEntity(BASE_URL, OuterApiData.class);
        return response.getBody();
    }
}
