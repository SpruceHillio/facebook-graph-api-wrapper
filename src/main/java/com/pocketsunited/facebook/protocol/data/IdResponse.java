package com.pocketsunited.facebook.protocol.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pocketsunited.facebook.data.Base;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class IdResponse extends Base {

    @JsonProperty
    private String id;

    public String getId() {
        return id;
    }
}
