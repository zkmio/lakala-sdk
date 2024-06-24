package com.lkl.laop.sdk.utils;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author nxj
 * @date 2023/7/18 14:42
 * @description
 */
public class JsonUtils {
    public JsonUtils() {
    }

    public static String toJSONString(Object o) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException var3) {
            return null;
        }
    }
    @SuppressWarnings("all")
    public static <T> T parse(String text, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(text, clazz);
        } catch (JsonParseException var4) {
        } catch (JsonMappingException var5) {
        } catch (IOException var6) {
        }

        return null;
    }

    @SuppressWarnings("all")
    public static <T> List<T> parseToList(String text, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, new Class[]{clazz});
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return (List) mapper.readValue(text, javaType);
        } catch (JsonParseException var4) {
        } catch (JsonMappingException var5) {
        } catch (IOException var6) {
        }

        return (List) null;
    }
}
