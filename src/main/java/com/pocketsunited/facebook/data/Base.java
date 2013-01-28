package com.pocketsunited.facebook.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
@JsonAutoDetect(
        creatorVisibility = JsonAutoDetect.Visibility.DEFAULT,
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(
        value = JsonInclude.Include.NON_EMPTY)
public abstract class Base {
}