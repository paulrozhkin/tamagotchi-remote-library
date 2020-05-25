package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeedbackModel {
    @SerializedName("feedback")
    @Expose
    private String feedback;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("createdTime")
    @Expose
    private String createdTime;
    @SerializedName("user")
    @Expose
    private Integer user;

    /**
     * No args constructor for use in serialization
     *
     */
    public FeedbackModel() {
    }

    /**
     *
     * @param createdTime
     * @param feedback
     * @param id
     * @param user
     */
    public FeedbackModel(String feedback, Integer id, String createdTime, Integer user) {
        super();
        this.feedback = feedback;
        this.id = id;
        this.createdTime = createdTime;
        this.user = user;
    }

    public String getFeedback() {
        return feedback;
    }

    public Integer getId() {
        return id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public Integer getUser() {
        return user;
    }
}
