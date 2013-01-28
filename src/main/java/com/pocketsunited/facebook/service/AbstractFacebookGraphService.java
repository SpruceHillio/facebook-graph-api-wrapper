package com.pocketsunited.facebook.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public abstract class AbstractFacebookGraphService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected HttpClient httpClient;

    protected ObjectMapper objectMapper;

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void postConstruct() {
        if (null == httpClient) {
            httpClient = new DefaultHttpClient(new PoolingClientConnectionManager());
        }
        if (null == objectMapper) {
            objectMapper = new ObjectMapper();
        }
    }

    protected URI buildRequestUrl(String[] parts, String accessToken) throws URISyntaxException {
        StringBuilder builder = new StringBuilder("https://graph.facebook.com");
        for (String part : parts) {
            builder.append("/");
            builder.append(part);
        }
        URIBuilder uriBuilder = new URIBuilder(builder.toString());
        if (null != accessToken) {
            uriBuilder.addParameter("access_token",accessToken);
        }
        return uriBuilder.build();
    }
}
