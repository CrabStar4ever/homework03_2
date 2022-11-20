package com.learning.springbucks.service;

import com.learning.springbucks.mapper.CoffeeMapper;
import com.learning.springbucks.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeMapper coffeeMapper;

    public List<Coffee> retrieveCoffeeList() {
        return coffeeMapper.selectAll();
    }

}
