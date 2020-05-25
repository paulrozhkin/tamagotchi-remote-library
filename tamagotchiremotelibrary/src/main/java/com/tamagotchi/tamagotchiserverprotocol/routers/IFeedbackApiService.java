package com.tamagotchi.tamagotchiserverprotocol.routers;

import com.tamagotchi.tamagotchiserverprotocol.models.FeedbackCreateModel;
import com.tamagotchi.tamagotchiserverprotocol.models.FeedbackModel;
import com.tamagotchi.tamagotchiserverprotocol.models.MenuItem;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IFeedbackApiService {
    /**
     * Get feedback. Only staff can get feedback.
     * @return feedback.
     */
    @GET("feedback")
    Single<List<FeedbackModel>> getFeedback();

    /**
     * Create new feedback.
     * @return new feedback.
     */
    @POST("feedback")
    Single<FeedbackModel> addFeedback(@Body FeedbackCreateModel feedback);
}
