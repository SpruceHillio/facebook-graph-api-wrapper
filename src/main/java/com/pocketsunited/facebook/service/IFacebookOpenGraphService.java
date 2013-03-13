package com.pocketsunited.facebook.service;

import com.pocketsunited.facebook.data.AbstractOpenGraphObject;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public interface IFacebookOpenGraphService {

    String publish(String accessToken, AbstractOpenGraphObject openGraphObject);
}
