package com.ffzhello.mix.api.contract.userApi;

import lombok.Data;

/**
 * @author ffzhello
 * @description 获取用户信息请求/响应
 * @since 2020/6/13
 **/
public class GetUserInfo {

    /**
     * 请求
     **/
    @Data
    public static class GetUserInfoRequest {
        /**
         * 用户uid
         * 用户唯一标志符，手机号等
         **/
        private Long uId;
    }

    /**
     * 响应
     **/
    @Data
    public static class GetUserInfoResponse {
        private Long uId;

        /**
         * 用户昵称
         **/
        private String nickName;

        private String email;

        private String phone;
    }
}
