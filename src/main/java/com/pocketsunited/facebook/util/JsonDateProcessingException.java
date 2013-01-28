package com.pocketsunited.facebook.util;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class JsonDateProcessingException extends JsonProcessingException {

    protected JsonDateProcessingException(String msg, JsonLocation loc, Throwable rootCause) {
        super(msg, loc, rootCause);
    }

    protected JsonDateProcessingException(String msg) {
        super(msg);
    }

    protected JsonDateProcessingException(String msg, JsonLocation loc) {
        super(msg, loc);
    }

    protected JsonDateProcessingException(String msg, Throwable rootCause) {
        super(msg, rootCause);
    }

    protected JsonDateProcessingException(Throwable rootCause) {
        super(rootCause);
    }
}
