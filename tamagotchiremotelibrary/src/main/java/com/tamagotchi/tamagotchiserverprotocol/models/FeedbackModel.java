package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedbackModel that = (FeedbackModel) o;
        return Objects.equals(feedback, that.feedback) &&
                Objects.equals(id, that.id) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedback, id, createdTime, user);
    }
}
