package com.ffzhello.mix.api;

import com.ffzhello.mix.api.contract.userApi.GetUserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ffzhello
 * @description 用户服务对外接口
 * @since 2020/6/13
 **/
@RestController
public class UserApi {

    /**
     * 获取用信息
     *
     * // TODO 1、切面不起作用  2、方法调用统计  3、缓存切面统一处理
     **/
    @RequestMapping("/userApi/getUserInfo")
    public GetUserInfo.GetUserInfoResponse getUserInfo(@RequestParam String uid) {
        GetUserInfo.GetUserInfoResponse response = new GetUserInfo.GetUserInfoResponse();
        response.setUId(uid);
        response.setNickName(uid + "你好!");
        return response;
    }
}
