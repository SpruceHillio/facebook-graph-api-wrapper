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
public abstract class AbstractFacebookGraphService extends AbstractFacebookService {

    protected HttpClient httpClient;

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @PostConstruct
    public void postConstruct() {
        super.postConstruct();
        if (null == httpClient) {
            httpClient = new DefaultHttpClient(new PoolingClientConnectionManager());
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
