package com.test.vincent.dubbo.order;

import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements IDoOrderServices  {

    @Override
    public DoOrderResponse doOrder( DoOrderRequest doOrderRequest ) {
        System.out.println("正在下单");
        System.out.println(doOrderRequest);

        DoOrderResponse response = new DoOrderResponse();

        response.setCode(2);
        response.setMemo("HALO,this is the second");

        System.out.println("下单完成");

        return response;

    }
}
