package com.twitter.api.core;

/**
 * Created by Alexander on 06.10.2016.
 */
public class Config {
    private static final PropertyLoader PROPS = new PropertyLoader(System.getProperty("user.dir") + "/src/test/resources/config.properties");
    public static final String BASE_URL = PROPS.load("baseUrl");
    public static final String CONSUMER_KEY = PROPS.load("consumerKey");
    public static final String CONSUMER_SECRET = PROPS.load("consumerSecret");
    public static final String ACCESS_TOKEN = PROPS.load("accessToken");
    public static final String SECRET_TOKEN = PROPS.load("secretToken");
}
