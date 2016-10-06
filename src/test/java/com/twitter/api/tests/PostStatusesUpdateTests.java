package com.twitter.api.tests;

import com.twitter.api.helpers.RandomizeHelper;
import com.twitter.api.models.Tweet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.post;


/**
 * Created by Alexander on 05.10.2016.
 */
public class PostStatusesUpdateTests extends TestBase {

    private final String STATUSES_UPDATE_PATH = "statuses/update.json";


    @Test
    public void testStatusesUpdateEmptyRequest() {
        get(STATUSES_UPDATE_PATH).
                then().statusCode(400);
    }

    @DataProvider
    public Object[][] initTweetModel() {
        Tweet tweet = new Tweet.Builder()
                .setText("Test Twitt for API" + RandomizeHelper.getRandomInt(1, 1000))
                .build();
        return new Object[][]{{tweet}};
    }

    @Test(dataProvider = "initTweetModel", groups = "count")
    public void testDuplicateTweet(Tweet tweet) {
                post(STATUSES_UPDATE_PATH+"?status=" + tweet.getText()).
                then().statusCode(200);

        post(STATUSES_UPDATE_PATH+"?status=" + tweet.getText()).
                then().statusCode(403);


    }
}
