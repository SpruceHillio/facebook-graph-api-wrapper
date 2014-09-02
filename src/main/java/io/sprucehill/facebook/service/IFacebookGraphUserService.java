package io.sprucehill.facebook.service;

import io.sprucehill.facebook.data.AccessToken;
import io.sprucehill.facebook.data.AppRequest;
import io.sprucehill.facebook.data.User;
import io.sprucehill.facebook.exceptions.GenericFacebookGraphAPIException;

import java.util.List;

/**
 * @author Michael Duergner <michael@sprucehill.io>
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

    AccessToken exchangeAccessToken(String userAccessToken) throws GenericFacebookGraphAPIException;

    AccessToken exchangeAccessToken(String userAccessToken, String appId, String applicationSecret) throws GenericFacebookGraphAPIException;
}