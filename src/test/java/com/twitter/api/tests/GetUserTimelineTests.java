package com.twitter.api.tests;

import com.jayway.restassured.internal.mapper.ObjectMapperType;
import com.twitter.api.helpers.RandomizeHelper;
import com.twitter.api.models.Tweet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by Alexander on 05.10.2016.
 */
public class GetUserTimelineTests extends TestBase {
    private final String USER_TIMELINE_PATH = "statuses/user_timeline.json";


    @Test
    public void testUserTimeLineSuccessRequest() {
        get(USER_TIMELINE_PATH).
                then().statusCode(200);
    }

    @DataProvider
    public Object[][] initRandomIntModel() {
        String screen_name = "google";
        return new Object[][]{{RandomizeHelper.getRandomInt(0, 50), screen_name}};
    }

    @Test(dataProvider = "initRandomIntModel")
    public void testTweetCountLimit(int limit, String screen_name) {

        Tweet[] tweets = given().
                param("screen_name", screen_name).
                param("count", limit).
                param("include_rts", 1).
                when().
                get(USER_TIMELINE_PATH).
                as(Tweet[].class, ObjectMapperType.GSON);
        assertThat("Tweets count is not the same as limit", tweets.length, is(limit));
    }
}
