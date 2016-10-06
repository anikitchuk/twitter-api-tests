package com.twitter.api.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Alexander on 06.10.2016.
 */
public class PropertyLoader {

    private static Logger LOG = LoggerFactory.getLogger(PropertyLoader.class);
    private final String propertyFile;

    public PropertyLoader(String p_pathToFile) {
        propertyFile = p_pathToFile;
    }

    public String load(String name) {
        Properties props = new Properties();
        String value = "";

        try {
            props.load(new FileInputStream(propertyFile));
        } catch (IOException ex) {
            LOG.error("Property file path is not specified");
        }

        if (name != null) {
            value = props.getProperty(name);
        }
        return value;
    }
}