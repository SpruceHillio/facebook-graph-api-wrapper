package com.pocketsunited.facebook.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Michael Duergner <michael@pocketsunited.com>
 */
public class DateDeserializer extends JsonDeserializer<Date> {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            return DATE_FORMAT.parse(jp.getText());
        } catch (ParseException e) {
            throw new JsonDateProcessingException(e.getMessage(),e);
        }
    }
}
