package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeedbackCreateModel {
    @SerializedName("feedback")
    @Expose
    private String feedback;

    /**
     * No args constructor for use in serialization
     *
     */
    public FeedbackCreateModel() {
    }

    /**
     *
     * @param feedback
     */
    public FeedbackCreateModel(String feedback) {
        super();
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }

}
