package com.test.vincent.dubbo.user;


import com.test.vincent.dubbo.user.dto.UserLoginRequest;
import com.test.vincent.dubbo.user.dto.UserLoginResponse;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService{

    @Override
    public UserLoginResponse login( UserLoginRequest request ) {
        System.out.println(request);
        UserLoginResponse response  = new UserLoginResponse();
        response.setCode("0000");
        response.setMemo("success");

        return response;

    }
}
