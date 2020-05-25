package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderModel {

    @SerializedName("restaurant")
    @Expose
    private Integer restaurant;
    @SerializedName("client")
    @Expose
    private Integer client;
    @SerializedName("menu")
    @Expose
    private List<Integer> menu = null;
    @SerializedName("numberOfPersons")
    @Expose
    private Integer numberOfPersons;
    @SerializedName("comment")
    @Expose
    private String comment;
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
    private List<Integer> cooks = null;
    @SerializedName("waiters")
    @Expose
    private List<Integer> waiters = null;
    @SerializedName("totalAmount")
    @Expose
    private Integer totalAmount;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("visitTime")
    @Expose
    private VisitTime visitTime;
    @SerializedName("timeCreated")
    @Expose
    private String timeCreated;

    /**
     * No args constructor for use in serialization
     */
    public OrderModel() {
    }

    /**
     * @param numberOfPersons
     * @param restaurant
     * @param orderStatus
     * @param menu
     * @param cooks
     * @param orderCooksStatus
     * @param orderWaitersStatus
     * @param totalAmount
     * @param visitTime
     * @param waiters
     * @param client
     * @param comment
     * @param timeCreated
     * @param id
     */
    public OrderModel(Integer restaurant, Integer client, List<Integer> menu, Integer numberOfPersons, String comment, String orderStatus, String orderCooksStatus, String orderWaitersStatus, List<Integer> cooks, List<Integer> waiters, Integer totalAmount, Integer id, VisitTime visitTime, String timeCreated) {
        super();
        this.restaurant = restaurant;
        this.client = client;
        this.menu = menu;
        this.numberOfPersons = numberOfPersons;
        this.comment = comment;
        this.orderStatus = orderStatus;
        this.orderCooksStatus = orderCooksStatus;
        this.orderWaitersStatus = orderWaitersStatus;
        this.cooks = cooks;
        this.waiters = waiters;
        this.totalAmount = totalAmount;
        this.id = id;
        this.visitTime = visitTime;
        this.timeCreated = timeCreated;
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

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public VisitTime getVisitTime() {
        return visitTime;
    }

    public String getTimeCreated() {
        return timeCreated;
    }
}
