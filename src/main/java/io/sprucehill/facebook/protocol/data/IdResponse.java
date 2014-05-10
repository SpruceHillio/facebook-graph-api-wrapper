package io.sprucehill.facebook.protocol.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sprucehill.facebook.data.Base;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class IdResponse extends Base {

    @JsonProperty
    private String id;

    public String getId() {
        return id;
    }
}
