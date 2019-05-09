package cn.rejoicy.dubbodemo.demoprovider.service;

import cn.rejoicy.dubbodemo.demoprovider.entity.Card;

public interface CardService {

    Card findByCardNumber(String cardNumber);
//    Map<String, Object> findByCardNumber(String cardNumber);
}
