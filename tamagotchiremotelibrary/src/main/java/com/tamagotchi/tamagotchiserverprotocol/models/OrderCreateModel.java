package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class OrderCreateModel {
    @SerializedName("restaurant")
    @Expose
    private Integer restaurant;
    @SerializedName("client")
    @Expose
    private Integer client;
    @SerializedName("menu")
    @Expose
    private List<Integer> menu = new ArrayList<Integer>();
    @SerializedName("numberOfPersons")
    @Expose
    private Integer numberOfPersons;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("paymentToken")
    @Expose
    private String paymentToken;
    @SerializedName("visitTime")
    @Expose
    private String visitTime;

    /**
     * No args constructor for use in serialization
     *
     */
    public OrderCreateModel() {
    }

    /**
     *
     * @param paymentToken
     * @param visitTime
     * @param numberOfPersons
     * @param restaurant
     * @param client
     * @param comment
     * @param menu
     */
    public OrderCreateModel(Integer restaurant, Integer client, @NotNull List<Integer> menu, Integer numberOfPersons, String comment, String paymentToken, String visitTime) {
        super();
        this.restaurant = restaurant;
        this.client = client;
        this.menu = menu;
        this.numberOfPersons = numberOfPersons;
        this.comment = comment;
        this.paymentToken = paymentToken;
        this.visitTime = visitTime;
    }

    public Integer getRestaurant() {
        return restaurant;
    }

    public Integer getClient() {
        return client;
    }

    public List<Integer> getMenu() {
        return menu;
    }


    public Integer getNumberOfPersons() {
        return numberOfPersons;
    }


    public String getComment() {
        return comment;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public String getVisitTime() {
        return visitTime;
    }
}
