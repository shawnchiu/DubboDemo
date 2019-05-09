package cn.rejoicy.dubbodemo.demoprovider.dao;

import cn.rejoicy.dubbodemo.demoprovider.entity.Card;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qxl
 * @date 2019/5/7 11:14
 */
@Mapper
public interface CardDao {
    Card findByCardNumber(String cardNumber);
}
