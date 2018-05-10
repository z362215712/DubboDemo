package com.test.vincent.dubbo.order;

import com.test.vincent.dubbo.user.IUserService;
import com.test.vincent.dubbo.user.dto.UserLoginRequest;
import com.test.vincent.dubbo.user.dto.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements IDoOrderServices  {

    @Autowired
    private IUserService iUserService;

    @Override
    public DoOrderResponse doOrder( DoOrderRequest doOrderRequest ) {
//        //先校验用户状态
        UserLoginRequest request = new UserLoginRequest();
        request.setName("yoga");
        request.setPassword("yoga");
        UserLoginResponse userLoginResponse = iUserService.login(request);
        if(!"0000".equals(userLoginResponse.getCode())){
            System.out.println("验证失败");
        }

        System.out.println(userLoginResponse);

        //准备下单
        System.out.println("正在下单");
        System.out.println(doOrderRequest);

        DoOrderResponse response = new DoOrderResponse();

        response.setCode(1);
        response.setMemo("HALO,this is the first");

        System.out.println("下单完成");

        return response;

    }
}
