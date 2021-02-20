package com.example.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal qunaity;
    private BigDecimal totalCalculatedAmount;
    private BigDecimal conversionMultiple;
    private String Environment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQunaity() {
        return qunaity;
    }

    public void setQunaity(BigDecimal qunaity) {
        this.qunaity = qunaity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return Environment;
    }

    public void setEnvironment(String environment) {
        Environment = environment;
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal qunaity, BigDecimal totalCalculatedAmount, BigDecimal conversionMultiple, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.qunaity = qunaity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.conversionMultiple = conversionMultiple;
        Environment = environment;
    }
}
