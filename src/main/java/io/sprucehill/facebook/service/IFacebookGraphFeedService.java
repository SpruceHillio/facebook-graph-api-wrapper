package io.sprucehill.facebook.service;

import io.sprucehill.facebook.exceptions.GenericFacebookGraphAPIException;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public interface IFacebookGraphFeedService {

    String publish(String message, String accessToken) throws GenericFacebookGraphAPIException;

    String publish(String message, String link, String picture, String name, String caption, String description, String accessToken) throws GenericFacebookGraphAPIException;

    String publish(String userId, String message, String accessToken) throws GenericFacebookGraphAPIException;

    String publish(String userId, String message, String link, String picture, String name, String caption, String description, String accessToken) throws GenericFacebookGraphAPIException;
}
