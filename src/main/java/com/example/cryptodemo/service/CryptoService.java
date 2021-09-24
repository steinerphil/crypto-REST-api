package com.example.cryptodemo.service;

import com.example.cryptodemo.api.CryptoApiService;
import com.example.cryptodemo.model.CryptoData;
import com.example.cryptodemo.model.api.OuterApiData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptoService {

    public final CryptoApiService cryptoApiService;
    public final CryptoServiceMapper cryptoServiceMapper;

    @Autowired
    public CryptoService(CryptoApiService cryptoApiService, CryptoServiceMapper cryptoServiceMapper) {
        this.cryptoApiService = cryptoApiService;
        this.cryptoServiceMapper = cryptoServiceMapper;
    }

    public CryptoData getCryptoData(){
        OuterApiData outerApiData = cryptoApiService.getApiData();
        return cryptoServiceMapper.mapToLocalData(outerApiData);
    }

}
