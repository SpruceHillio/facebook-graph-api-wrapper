package com.pocketsunited.facebook.protocol.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pocketsunited.facebook.data.Base;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class DataResponse<T> extends Base {

    @JsonProperty(
            value = "data")
    private T data;

    public T getData() {
        return data;
    }
}
