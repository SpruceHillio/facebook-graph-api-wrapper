package com.pocketsunited.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 *
 *
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class AppRequest extends IdBase {

    public class Application extends IdBase {

        @JsonProperty(
                value = "name")
        private String name;

        @JsonProperty(
                value = "canvas_name")
        private String canvasName;

        @JsonProperty(
                value = "namespace")
        private String namespace;

        public String getName() {
            return name;
        }

        public String getCanvasName() {
            return canvasName;
        }

        public String getNamespace() {
            return namespace;
        }
    }

    @JsonProperty(
            value = "application")
    private Application application;

    @JsonProperty(
            value = "to")
    private User to;

    @JsonProperty(
            value = "from")
    private User from;

    @JsonProperty(
            value = "message")
    private String message;

    @JsonProperty(
            value = "created_time")
    private Date createdTime;

    @JsonProperty(
            value = "type")
    private String type;

    private String requestId = null;

    public Application getApplication() {
        return application;
    }

    public String getRequestId() {
        if (null == requestId) {
            if (getId().contains("_")) {
                requestId = getId().split("_")[0];
            }
            else {
                requestId = getId();
            }
        }
        return requestId;
    }

    public User getTo() {
        return to;
    }

    public User getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getType() {
        return type;
    }
}
