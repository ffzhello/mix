package com.ffzhello.mix.api;

import com.ffzhello.mix.api.contract.userApi.GetUserInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ffzhello
 * @description 用户服务对外接口
 * @since 2020/6/13
 **/
@RestController("userApi/")
public class UserApi {

    /**
     * 获取用信息
     **/
    @RequestMapping("getUserInfo")
    public String getUserInfo(Long uid) {
        GetUserInfo.GetUserInfoResponse response = new GetUserInfo.GetUserInfoResponse();
        response.setUId(uid);
        response.setNickName(uid + "_hahaha");
        return JSONO;
    }
}
