package com.twitter.api.tests;

import com.twitter.api.helpers.RestHelper;
import org.testng.annotations.BeforeClass;

/**
 * Created by Alexander on 06.10.2016.
 */
public class TestBase {

    @BeforeClass(alwaysRun = true)
    public void setupRestClient(){
        RestHelper.setupClient();
    }

    @BeforeClass(alwaysRun = true)
    public void resetRestClient(){
        RestHelper.resetClient();
    }
}
