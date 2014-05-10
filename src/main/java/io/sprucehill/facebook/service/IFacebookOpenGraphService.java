package io.sprucehill.facebook.service;

import io.sprucehill.facebook.data.AbstractOpenGraphObject;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public interface IFacebookOpenGraphService {

    String publish(String accessToken, AbstractOpenGraphObject openGraphObject);
}
