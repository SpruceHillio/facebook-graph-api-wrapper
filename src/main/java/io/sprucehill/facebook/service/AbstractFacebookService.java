package io.sprucehill.facebook.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class AbstractFacebookService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected ObjectMapper objectMapper;

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void postConstruct() {
        if (null == objectMapper) {
            objectMapper = new ObjectMapper();
        }
    }
}
