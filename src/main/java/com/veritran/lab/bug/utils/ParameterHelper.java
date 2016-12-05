package com.veritran.lab.bugz.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by Bruce A. Grobler on 10/23/14.
 */
public class ParameterHelper {

    public static String toJson(Object object) {
        Writer writer = new StringWriter();
        Gson gson = new GsonBuilder().create();
        gson.toJson(object, writer);
        return writer.toString();
    }

    public static Object fromJson(String json, Object objectType) {
        Gson gson = new GsonBuilder().create();
        Object object = gson.fromJson(json, (Class<Object>) objectType);
        return object;
    }


}
