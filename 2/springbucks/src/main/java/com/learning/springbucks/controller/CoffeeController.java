package com.learning.springbucks.controller;

import com.learning.springbucks.model.Coffee;
import com.learning.springbucks.model.CoffeeList;
import com.learning.springbucks.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping(value = "/menu1", produces = "application/json")
    public List<Coffee> showCoffeeMenuJson() {
        return coffeeService.retrieveCoffeeList();
    }

    @PostMapping(value = "/menu2", produces = "application/xml")
    public CoffeeList showCoffeeMenuXML() {
        CoffeeList coffeeList = new CoffeeList();
        coffeeList.setCoffee(coffeeService.retrieveCoffeeList());
        return coffeeList;
    }

}
