package com.makson.mvcleaf.service;

import com.makson.mvcleaf.model.FactDto;
import com.makson.mvcleaf.service.client.FactClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactService {
    @Autowired
    FactClient factClient;

    public String getFact(String option) {
        return factClient
                .getDto("http://numbersapi.com/random/" + option + "?json")
                .map(FactDto::getText)
                .orElse("Try Again, Please");
    }
}
