package io.sprucehill.facebook.service;

import com.fasterxml.jackson.core.type.TypeReference;
import io.sprucehill.facebook.data.RealtimeUpdateContainer;
import io.sprucehill.facebook.exceptions.GenericFacebookException;

import java.io.InputStream;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public interface IFacebookRealtimeUpdatesService {

    <T extends RealtimeUpdateContainer> T handleRealtimeUpdate(InputStream inputStream, TypeReference<T> typeReference) throws GenericFacebookException;
}
