package io.sprucehill.facebook.data;

import java.util.*;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public abstract class AbstractOpenGraphObject {

    public final class UserGeneratedPhoto {

        protected String url;

        private boolean userGenerated = false;

        public UserGeneratedPhoto(String url) {
            this.url = url;
        }

        public UserGeneratedPhoto(String url, boolean userGenerated) {
            this.url = url;
            this.userGenerated = userGenerated;
        }

        public String url() {
            return url;
        }

        public boolean userGenerated() {
            return userGenerated;
        }
    }

    public abstract String namespace();

    public abstract String name();

    public Map<String,String> getPostParameters() {
        // We return an empty Map in the default implementation
        return new HashMap<String, String>();
    }

    public String message() {
        // We don't include a message by default
        return null;
    }

    public boolean explicitlyShared() {
        // We don't use explicit share by default
        return false;
    }

    public String[] tags() {

        return new String[0];
    }

    public UserGeneratedPhoto[] images() {
        return new UserGeneratedPhoto[0];
    }

    public String ref() {
        // We don't include a ref parameter by default
        return null;
    }
}