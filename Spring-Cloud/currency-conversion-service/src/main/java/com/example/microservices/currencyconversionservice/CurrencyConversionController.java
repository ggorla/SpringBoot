package com.example.microservices.currencyconversionservice;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
        HashMap<String, String> uriVaraibles = new HashMap<>();
        uriVaraibles.put("from",from);
        uriVaraibles.put("to",to);
        ResponseEntity<CurrencyConversion> responseEntity= new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversion.class, uriVaraibles);

        CurrencyConversion currencyConversion= responseEntity.getBody();
        return new CurrencyConversion(currencyConversion.getId(), from,to,quantity,currencyConversion.getConversionMultiple(), currencyConversion.getTotalCalculatedAmount(), currencyConversion.getEnvironment());
    }

}
