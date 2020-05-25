package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class OrderPathModel {
    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("orderCooksStatus")
    @Expose
    private String orderCooksStatus;
    @SerializedName("orderWaitersStatus")
    @Expose
    private String orderWaitersStatus;
    @SerializedName("cooks")
    @Expose
    private List<Integer> cooks = new ArrayList<Integer>();
    @SerializedName("waiters")
    @Expose
    private List<Integer> waiters = new ArrayList<Integer>();

    /**
     * No args constructor for use in serialization
     */
    public OrderPathModel() {
    }

    /**
     * @param orderWaitersStatus
     * @param waiters
     * @param orderStatus
     * @param cooks
     * @param orderCooksStatus
     */
    public OrderPathModel(String orderStatus,
                          String orderCooksStatus,
                          String orderWaitersStatus,
                          List<Integer> cooks,
                          List<Integer> waiters) {
        super();
        this.orderStatus = orderStatus;
        this.orderCooksStatus = orderCooksStatus;
        this.orderWaitersStatus = orderWaitersStatus;
        this.cooks = cooks;
        this.waiters = waiters;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getOrderCooksStatus() {
        return orderCooksStatus;
    }


    public String getOrderWaitersStatus() {
        return orderWaitersStatus;
    }


    public List<Integer> getCooks() {
        return cooks;
    }


    public List<Integer> getWaiters() {
        return waiters;
    }

}
