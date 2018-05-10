package com.test.vincent.dubbo.pay;

import org.springframework.stereotype.Service;

@Service("payService")
public class PayImpl implements IPayService{
    @Override
    public String checkOrder() {
        return "pay center2";
    }

}
