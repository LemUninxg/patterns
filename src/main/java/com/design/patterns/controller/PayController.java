package com.design.patterns.controller;

import com.design.patterns.strategy.PayChannel;
import com.design.patterns.strategy.StrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private StrategyFactory strategyFactory;

    @GetMapping(value = "/wxPay")
    public String wxPay(HttpServletRequest request) {
        return strategyFactory.getPayServiceImpl(PayChannel.WX_PAY.getCode()).getPayUrl();
    }

    @GetMapping(value = "/aliPay")
    public String aliPay(HttpServletRequest request) {
        return strategyFactory.getPayServiceImpl(PayChannel.ALI_PAY.getCode()).getPayUrl();
    }

}
