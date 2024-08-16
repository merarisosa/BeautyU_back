package com.beautyU.BeautyU.infra;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.json.simple.JSONObject;

@Converter(autoApply = true)
public class JSONObjectConverter implements AttributeConverter<JSONObject, String> {

    @Override
    public String convertToDatabaseColumn(JSONObject attribute) {
        return attribute != null ? attribute.toString() : null;
    }

    @Override
    public JSONObject convertToEntityAttribute(String dbData) {
        return dbData != null ? new JSONObject() : null;
    }
}
