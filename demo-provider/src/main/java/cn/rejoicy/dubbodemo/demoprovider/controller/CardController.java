package cn.rejoicy.dubbodemo.demoprovider.controller;

import cn.rejoicy.dubbodemo.demoprovider.entity.Card;
import cn.rejoicy.dubbodemo.demoprovider.service.CardServiceImpl;
import cn.rejoicy.dubbodemo.demoproviderapi.controller.CardControllerApi;
import com.alibaba.dubbo.config.annotation.Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author glacier
 */
@RestController
@Api(value = "测试接口", tags = {"card"})
@Service(interfaceClass = CardControllerApi.class)
public class CardController implements CardControllerApi {

    @Resource
    private CardServiceImpl cardService;

    @Override
    @GetMapping("/api/card/findByCardNumber")
    @ApiOperation("根据卡号查询卡信息")
    public Map<String, Object> findByCardNumber(@ApiParam("卡号") @RequestParam String cardNumber) {
        Map<String, Object> result = new LinkedHashMap<>();

        try {
            Card card = cardService.findByCardNumber(cardNumber);
            result.put("status", "0");
            result.put("message", "OK");
            result.put("card", card);
        } catch (Exception e) {
            result.put("status", "100001");
            result.put("message", e.getMessage());
        }

        return result;
    }
}
