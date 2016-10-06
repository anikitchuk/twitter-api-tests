package com.twitter.api.helpers;

import com.twitter.api.core.Config;

import static com.jayway.restassured.RestAssured.*;

/**
 * Created by Alexander on 06.10.2016.
 */
public class RestHelper {

    public static void setupClient() {
        baseURI = Config.BASE_URL;
        authentication = oauth(Config.CONSUMER_KEY, Config.CONSUMER_SECRET, Config.ACCESS_TOKEN, Config.SECRET_TOKEN);
    }

    public static void resetClient() {
        reset();
    }
}
