package io.sprucehill.facebook.service;

import com.fasterxml.jackson.core.type.TypeReference;
import io.sprucehill.facebook.data.IdBase;
import io.sprucehill.facebook.exceptions.GenericFacebookGraphAPIException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class FacebookGraphFeedService extends AbstractFacebookGraphService implements IFacebookGraphFeedService {

    @PostConstruct
    public void postConstruct() {
        super.postConstruct();
    }

    @Override
    public String publish(String message, String accessToken) throws GenericFacebookGraphAPIException {
        return publish("me",message,accessToken);
    }

    @Override
    public String publish(String message, String link, String picture, String name, String caption, String description, String accessToken) throws GenericFacebookGraphAPIException {
        return publish("me",message,link,picture,name,caption,description,accessToken);
    }

    @Override
    public String publish(String userId, String message, String accessToken) throws GenericFacebookGraphAPIException {
        return publish(userId,message,null,null,null,null,null,accessToken);
    }

    @Override
    public String publish(String userId, String message, String link, String picture, String name, String caption, String description, String accessToken) throws GenericFacebookGraphAPIException {
        HttpPost request = null;
        try {
            request = new HttpPost(buildRequestUrl(new String[] {userId,"feed"},null));
            List<NameValuePair> data = new ArrayList<NameValuePair>();
            data.add(new BasicNameValuePair("access_token",accessToken));
            if (null != message) {
                data.add(new BasicNameValuePair("message",message));
            }
            if (null != link) {
                data.add(new BasicNameValuePair("link",link));
                if (null != picture) {
                    data.add(new BasicNameValuePair("picture",picture));
                }
                if (null != name) {
                    data.add(new BasicNameValuePair("name",name));
                }
                if (null != caption) {
                    data.add(new BasicNameValuePair("caption",caption));
                }
                if (null != description) {
                    data.add(new BasicNameValuePair("description",description));
                }
            }
            if (null == message && null == link) {
                throw new GenericFacebookGraphAPIException("Either 'message' or 'link' must be set!");
            }
            HttpEntity entity = new UrlEncodedFormEntity(data,"UTF-8");
            request.setEntity(entity);
            HttpResponse response = httpClient.execute(request);
            if (200 == response.getStatusLine().getStatusCode()) {
                return ((IdBase)objectMapper.readValue(response.getEntity().getContent(), new TypeReference<IdBase>() {})).getId();
            }
            else {
                logger.warn("Got status code {} when trying to posting to Feed of  User  with ID {} with status line {} and content {}",new Object[] {response.getStatusLine().getStatusCode(),userId,response.getStatusLine(), EntityUtils.toString(response.getEntity())});
                throw new GenericFacebookGraphAPIException("Got unexpected response code ("+response.getStatusLine().getStatusCode()+") while posting to Feed of User for ID "+userId);
            }
        }
        catch (Throwable t) {
            logger.error("Got {} while trying to read user for UserID {} from Facebook",new Object[] {t.getClass().getSimpleName(),userId},t);
            throw new GenericFacebookGraphAPIException("While posting to Feed of  User for ID "+userId,t);
        }
        finally {
            if (null != request && !request.isAborted()) {
                request.abort();
            }
        }
    }
}
