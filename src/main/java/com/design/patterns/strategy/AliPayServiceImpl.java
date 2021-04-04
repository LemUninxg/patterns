package com.design.patterns.strategy;

import org.springframework.stereotype.Service;

@Service
public class AliPayServiceImpl implements PayService {

    @Override
    public String getPayUrl() {
        return "进入 aliPay 支付方法";
    }

    @Override
    public String withdraw() {
        return "进入 aliPay 提现方法";
    }

    @Override
    public String getPlatform() {
        return PayChannel.ALI_PAY.getCode();
    }
}
