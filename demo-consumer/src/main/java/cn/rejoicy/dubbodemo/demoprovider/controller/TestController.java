package cn.rejoicy.dubbodemo.demoprovider.controller;

import cn.rejoicy.dubbodemo.demoprovider.service.CardService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author qxl
 * @date 2019/5/7 15:07
 */

@Component
public class TestController {


    @Reference
    private CardService api;


    @Scheduled(fixedDelay = 1000L)
    public void consumer() {
        System.out.println(api.findByCardNumber("123"));
    }
}
