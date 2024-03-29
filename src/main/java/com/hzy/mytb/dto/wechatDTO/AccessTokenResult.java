package com.hzy.mytb.dto.wechatDTO;

import lombok.Data;

@Data
public class AccessTokenResult {
    private String access_token;
    private String expires_in;
    private String refresh_token;
    private String openid;
    private String scope;
}
