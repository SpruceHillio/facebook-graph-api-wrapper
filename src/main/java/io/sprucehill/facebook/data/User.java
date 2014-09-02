package io.sprucehill.facebook.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.sprucehill.facebook.util.DateDeserializer;
import io.sprucehill.facebook.util.DateSerializer;

import java.util.Date;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class User extends IdBase {

    public enum Gender {
        male,female;
    }

    @JsonProperty(
            value = "name")
    private String name;

    @JsonProperty(
            value = "first_name")
    private String firstName;

    @JsonProperty(
            value = "middle_name")
    private String middleName;

    @JsonProperty(
            value = "last_name")
    private String lastName;

    @JsonProperty(
            value = "gender")
    private Gender gender;

    @JsonProperty(
            value = "locale")
    private String locale;

    @JsonProperty(
            value = "username")
    private String username;

    @JsonProperty(
            value = "verified")
    private boolean verified = Boolean.FALSE;

    @JsonProperty(
            value = "birthday")
    @JsonSerialize(
            using = DateSerializer.class)
    @JsonDeserialize(
            using = DateDeserializer.class)
    private Date birthday;

    @JsonProperty(
            value = "email")
    private String email;

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLocale() {
        return locale;
    }

    public String getUsername() {
        return username;
    }

    public boolean isVerified() {
        return verified;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }
}
