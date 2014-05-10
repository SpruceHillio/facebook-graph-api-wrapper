package io.sprucehill.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class IdBase extends Base {

    @JsonProperty(
            value = "id")
    private String id;

    public String getId() {
        return id;
    }
}
