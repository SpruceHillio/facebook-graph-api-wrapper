package com.pocketsunited.facebook.service;

import com.pocketsunited.facebook.data.AppRequest;
import com.pocketsunited.facebook.data.User;
import com.pocketsunited.facebook.exceptions.GenericFacebookGraphAPIException;

import java.util.List;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public interface IFacebookGraphUserService {

    User me() throws GenericFacebookGraphAPIException;

    User me(String userAccessToken) throws GenericFacebookGraphAPIException;

    User read(String userId) throws GenericFacebookGraphAPIException;

    User read(String userId, String userAccessToken) throws GenericFacebookGraphAPIException;

    List<User> friends(String userAccessToken) throws GenericFacebookGraphAPIException;

    List<User> friends(String userId, String userAccessToken) throws GenericFacebookGraphAPIException;

    List<AppRequest> readAppRequests(String userId, String userAccessToken) throws GenericFacebookGraphAPIException;

    boolean deleteAppRequest(String requestId, String userId, String accessToken) throws GenericFacebookGraphAPIException;
}