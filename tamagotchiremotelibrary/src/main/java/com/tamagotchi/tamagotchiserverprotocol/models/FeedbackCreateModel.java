package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedbackCreateModel that = (FeedbackCreateModel) o;
        return Objects.equals(feedback, that.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedback);
    }
}
