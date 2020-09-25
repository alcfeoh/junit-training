package com.angulartraining.example;

import org.jmock.Expectations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jmock.Mockery;

import static org.junit.jupiter.api.Assertions.*;

public class PricingServiceImplMockTest {

    PricingServiceImpl service;
    Mockery context = new Mockery();
    DataAccess dataAccessMock;

    @BeforeEach
    public void setUp() {
        this.service = new PricingServiceImpl();
        this.dataAccessMock = context.mock(DataAccess.class);
        this.service.setDataAccess(this.dataAccessMock);
    }

    @Test
    public void setDataAccess() {
        assertTrue(this.service.isDataAccessSetup());
    }

    @Test
    public void getPrice() throws SkuNotFoundException {
        context.checking(new Expectations() {{
            oneOf(dataAccessMock).getPriceBySku("21");
            will(returnValue(450));
        }});
        assertEquals(450,  this.service.getPrice("21"));
    }

    @Test
    public void isDataAccessSetup() {
        PricingServiceImpl service = new PricingServiceImpl();
        assertFalse(service.isDataAccessSetup());
    }
}