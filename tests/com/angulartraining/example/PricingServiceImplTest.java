package com.angulartraining.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PricingServiceImplTest {

    PricingServiceImpl service;

    @BeforeEach
    public void setUp() {
        this.service = new PricingServiceImpl();
        this.service.setDataAccess(new LocalDataAccess());
    }

    @Test
    public void setDataAccess() {
        assertTrue(this.service.isDataAccessSetup());
    }

    @Test
    public void getPrice() throws SkuNotFoundException {
        assertEquals(450,  this.service.getPrice("21"));
    }

    @Test
    public void isDataAccessSetup() {
        PricingServiceImpl service = new PricingServiceImpl();
        assertFalse(service.isDataAccessSetup());
    }
}