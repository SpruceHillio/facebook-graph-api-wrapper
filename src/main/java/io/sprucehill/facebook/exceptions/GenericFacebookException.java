package io.sprucehill.facebook.exceptions;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public class GenericFacebookException extends Exception {

    public GenericFacebookException() {
    }

    public GenericFacebookException(String s) {
        super(s);
    }

    public GenericFacebookException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public GenericFacebookException(Throwable throwable) {
        super(throwable);
    }
}
