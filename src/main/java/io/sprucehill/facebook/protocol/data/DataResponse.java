package io.sprucehill.facebook.protocol.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sprucehill.facebook.data.Base;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class DataResponse<T> extends Base {

    @JsonProperty(
            value = "data")
    private T data;

    public T getData() {
        return data;
    }
}
