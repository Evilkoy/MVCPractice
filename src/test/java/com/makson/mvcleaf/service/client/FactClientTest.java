package com.makson.mvcleaf.service.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactClientTest {
    private final FactClient factClient = new FactClient();

    @Test
    void getDto() {
        Assertions.assertTrue(factClient.getDto("http://numbersapi.com/random/year?json").isPresent());
    }
}