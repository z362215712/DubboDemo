package com.test.vincent.dubbo.user;

import com.test.vincent.dubbo.user.dto.UserLoginRequest;
import com.test.vincent.dubbo.user.dto.UserLoginResponse;

public interface IUserService {
    public UserLoginResponse login( UserLoginRequest request);

}
