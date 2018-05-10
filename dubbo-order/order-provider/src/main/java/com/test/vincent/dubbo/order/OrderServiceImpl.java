package com.test.vincent.dubbo.order;

import com.test.vincent.dubbo.pay.IPayService;
import com.test.vincent.dubbo.user.IUserService;
import com.test.vincent.dubbo.user.dto.UserLoginRequest;
import com.test.vincent.dubbo.user.dto.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service(value = "orderService")
public class OrderServiceImpl implements IDoOrderServices  {

    @Autowired
    private IUserService iUserService;


    @Autowired
    IPayService payService;

    @Override
    public DoOrderResponse doOrder( DoOrderRequest doOrderRequest )  {

        for (int i=0;i<5;i++){
            String result = payService.checkOrder();
            System.out.println(result);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

//
//        //先校验用户状态
//        UserLoginRequest request = new UserLoginRequest();
//        request.setName("yoga");
//        request.setPassword("yoga");
//        UserLoginResponse userLoginResponse = iUserService.login(request);
//        if(!"0000".equals(userLoginResponse.getCode())){
//            System.out.println("验证失败");
//        }
//
//        System.out.println(userLoginResponse);
//
//        //准备下单
//        System.out.println("正在下单");
//        System.out.println(doOrderRequest);
//
        DoOrderResponse response = new DoOrderResponse();

        response.setCode(1);
        response.setMemo("HALO,this is the first");

        System.out.println("下单完成");

        return response;

    }
}
