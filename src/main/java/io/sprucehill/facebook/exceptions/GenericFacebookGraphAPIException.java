package io.sprucehill.facebook.exceptions;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class GenericFacebookGraphAPIException extends GenericFacebookException {

    public GenericFacebookGraphAPIException() {
    }

    public GenericFacebookGraphAPIException(String s) {
        super(s);
    }

    public GenericFacebookGraphAPIException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public GenericFacebookGraphAPIException(Throwable throwable) {
        super(throwable);
    }
}
