package cn.rejoicy.dubbodemo.demoproviderapi.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author qxl
 * @date 2019/5/9 14:58
 */
public interface CardControllerApi {
    @GetMapping("/api/card/findByCardNumber")
    @ApiOperation("根据卡号查询卡信息")
    Map<String, Object> findByCardNumber(@ApiParam("卡号") @RequestParam String cardNumber);
}
