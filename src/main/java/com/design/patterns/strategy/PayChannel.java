package com.design.patterns.strategy;

public enum PayChannel {

    WX_PAY("微信支付", "wxPay"),
    ALI_PAY("支付宝支付", "aliPay"),
    ;

    private String name;

    private String code;

    PayChannel(String name, String code){
        this.name = name;
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
