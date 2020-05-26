package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class VisitTime {
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;

    /**
     * No args constructor for use in serialization
     */
    public VisitTime() {
    }

    /**
     * @param start
     * @param end
     */
    public VisitTime(String start, String end) {
        super();
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitTime visitTime = (VisitTime) o;
        return Objects.equals(start, visitTime.start) &&
                Objects.equals(end, visitTime.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
