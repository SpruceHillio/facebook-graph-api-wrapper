package com.pocketsunited.facebook.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pocketsunited.facebook.data.RealtimeUpdateContainer;
import com.pocketsunited.facebook.exceptions.GenericFacebookException;

import java.io.InputStream;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public interface IFacebookRealtimeUpdatesService {

    <T extends RealtimeUpdateContainer> T handleRealtimeUpdate(InputStream inputStream, TypeReference<T> typeReference) throws GenericFacebookException;
}
