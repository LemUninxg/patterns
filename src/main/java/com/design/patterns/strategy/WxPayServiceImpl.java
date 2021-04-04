package com.design.patterns.strategy;

import org.springframework.stereotype.Service;

@Service
public class WxPayServiceImpl implements PayService {

    @Override
    public String getPayUrl() {
        return "进入 微信 支付方法";
    }

    @Override
    public String withdraw() {
        return "进入 微信 提现方法";
    }

    @Override
    public String getPlatform() {
        return PayChannel.WX_PAY.getCode();
    }

}
