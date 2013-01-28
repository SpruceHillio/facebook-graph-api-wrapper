package com.pocketsunited.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class IdBase extends Base {

    @JsonProperty(
            value = "id")
    private String id;

    public String getId() {
        return id;
    }
}
