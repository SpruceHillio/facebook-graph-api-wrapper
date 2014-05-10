package io.sprucehill.facebook.service;

import com.fasterxml.jackson.core.type.TypeReference;
import io.sprucehill.facebook.data.RealtimeUpdateContainer;
import io.sprucehill.facebook.exceptions.GenericFacebookException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class FacebookRealtimeUpdateService extends AbstractFacebookService implements IFacebookRealtimeUpdatesService {

    @Override
    public <T extends RealtimeUpdateContainer> T handleRealtimeUpdate(InputStream inputStream, TypeReference<T> typeReference) throws GenericFacebookException{
        try {
            return objectMapper.readValue(inputStream,typeReference);
        }
        catch (IOException e) {
            logger.error(e.getMessage(),e);
            throw  new GenericFacebookException(e);
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException e) {}
        }
    }
}
