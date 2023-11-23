package com.makson.mvcleaf.service;

import com.makson.mvcleaf.service.client.FactClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactServiceTest {


    @Test
    void getFact() {
        FactService factService = new FactService();
        factService.factClient = new FactClient();
        Assertions.assertFalse(factService.getFact("year").isEmpty());
    }
}