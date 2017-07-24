package com.shrreya.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

public class EndpointAsyncTaskTest extends ApplicationTestCase<Application> {

    public EndpointAsyncTaskTest() {
        super(Application.class);
    }

    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointAsyncTask testJoke = new EndpointAsyncTask(new EndpointAsyncTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        testJoke.execute();
        String joke = testJoke.get();
        assertNotNull(joke);
    }
}