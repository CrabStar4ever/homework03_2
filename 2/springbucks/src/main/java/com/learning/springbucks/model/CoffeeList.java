package com.learning.springbucks.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement
public class CoffeeList {

    private List<Coffee> coffee;

}
