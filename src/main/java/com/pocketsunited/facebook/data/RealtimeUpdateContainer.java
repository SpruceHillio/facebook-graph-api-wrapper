package com.pocketsunited.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class RealtimeUpdateContainer<T extends RealtimeUpdateContainer.RealtimeUpdate> extends Base {

    public abstract static class RealtimeUpdate extends IdBase {

        @JsonProperty(
                value = "time")
        private Integer time;

        public Integer getTime() {
            return time;
        }
    }

    public static class UserRealtimeUpdate extends RealtimeUpdate {

        @JsonProperty(
                value = "uid")
        private String uid;

        @JsonProperty(
                value = "changed_fields")
        private List<String> changedFields = new ArrayList<String>();

        public String getUid() {
            return uid;
        }

        public List<String> getChangedFields() {
            return changedFields;
        }
    }

    @JsonProperty(
            value = "object")
    private String object;

    @JsonProperty(
            value = "entry")
    private List<T> entry = new ArrayList<T>();

    public String getObject() {
        return object;
    }

    public List<T> getEntry() {
        return entry;
    }
}