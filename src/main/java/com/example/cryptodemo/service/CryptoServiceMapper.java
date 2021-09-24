package com.example.cryptodemo.service;

import com.example.cryptodemo.model.CryptoData;
import com.example.cryptodemo.model.api.OuterApiData;
import org.springframework.stereotype.Service;

@Service
public class CryptoServiceMapper {

    public CryptoData mapToLocalData(OuterApiData apiData){
        return new CryptoData(apiData.getDate(), apiData.getQuotes());
    }

}
