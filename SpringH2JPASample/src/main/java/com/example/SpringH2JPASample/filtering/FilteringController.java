package com.example.SpringH2JPASample.filtering;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public MappingJacksonValue retriveSomeBean(){
        SomeBean someBean = new SomeBean("Value1", "value2","value3");
        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
        FilterProvider filters= new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mapping.setFilters(filters);
        return  mapping;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue retriveSomeBeanList(){
        List<SomeBean> list = Arrays.asList(new SomeBean("valu1", "Value2", "Value3"),new SomeBean("valu11", "Value21", "Value31"));
        MappingJacksonValue mapping = new MappingJacksonValue(list);
        SimpleBeanPropertyFilter filter =  SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
        mapping.setFilters(filters);

        return mapping;

    }
}
