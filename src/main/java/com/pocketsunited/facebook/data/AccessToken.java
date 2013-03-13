package com.pocketsunited.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class AccessToken extends Base {

    @JsonProperty(
            value = "access_token")
    private String accessToken;

    @JsonProperty(
            value = "expires")
    private Date expiresAt;

    public AccessToken() { }

    public AccessToken(String accessToken, Date expiresAt) {
        this.accessToken = accessToken;
        this.expiresAt = expiresAt;
    }

    public AccessToken(String accessToken, Integer expiresIn) {
        this.accessToken = accessToken;
        this.expiresAt = new Date(System.currentTimeMillis() + (expiresIn * 1000l));
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }
}
