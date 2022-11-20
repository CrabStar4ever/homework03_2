package com.learning.springbucks.mapper;

import com.learning.springbucks.model.Coffee;
import com.learning.springbucks.model.CoffeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeMapper {
    long countByExample(CoffeeExample example);

    int deleteByExample(CoffeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Coffee row);

    int insertSelective(Coffee row);

    List<Coffee> selectByExample(CoffeeExample example);

    Coffee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("row") Coffee row, @Param("example") CoffeeExample example);

    int updateByExample(@Param("row") Coffee row, @Param("example") CoffeeExample example);

    int updateByPrimaryKeySelective(Coffee row);

    int updateByPrimaryKey(Coffee row);

    List<Coffee> selectAll();
}