package cn.rejoicy.dubbodemo.demoprovider.service;

import cn.rejoicy.dubbodemo.demoprovider.dao.CardDao;
import cn.rejoicy.dubbodemo.demoprovider.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qxl
 * @date 2019/5/7 11:22
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDao cardDao;

    @Override
    public Card findByCardNumber(String cardNumber) {
        return cardDao.findByCardNumber(cardNumber);
    }
}
