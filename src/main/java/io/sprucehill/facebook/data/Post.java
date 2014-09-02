package io.sprucehill.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class Post extends IdBase {

    @JsonProperty(
            value = "caption")
    String caption;

    @JsonProperty(
            value = "description")
    String description;

    @JsonProperty(
            value = "link")
    String link;

    @JsonProperty(
            value = "message")
    String message;

    @JsonProperty(
            value = "name")
    String name;

    @JsonProperty(
            value = "picture")
    String picture;

    public Post() {}

    public Post(String message) {
        this.message = message;
    }

    public Post(String message, String link, String picture, String name, String caption, String description) {
        this.message = message;
        this.link = link;
        this.picture = picture;
        this.name = name;
        this.caption = caption;
        this.description = description;
    }

    public String getCaption() {
        return caption;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }
}
