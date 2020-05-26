package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.OrderStatus;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.StaffStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderPathModel {
    @SerializedName("orderStatus")
    @Expose
    private OrderStatus orderStatus;
    @SerializedName("orderCooksStatus")
    @Expose
    private StaffStatus orderCooksStatus;
    @SerializedName("orderWaitersStatus")
    @Expose
    private StaffStatus orderWaitersStatus;
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
    public OrderPathModel(OrderStatus orderStatus,
                          StaffStatus orderCooksStatus,
                          StaffStatus orderWaitersStatus,
                          List<Integer> cooks,
                          List<Integer> waiters) {
        super();
        this.orderStatus = orderStatus;
        this.orderCooksStatus = orderCooksStatus;
        this.orderWaitersStatus = orderWaitersStatus;
        this.cooks = cooks;
        this.waiters = waiters;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public StaffStatus getOrderCooksStatus() {
        return orderCooksStatus;
    }


    public StaffStatus getOrderWaitersStatus() {
        return orderWaitersStatus;
    }


    public List<Integer> getCooks() {
        return cooks;
    }


    public List<Integer> getWaiters() {
        return waiters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPathModel that = (OrderPathModel) o;
        return Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(orderCooksStatus, that.orderCooksStatus) &&
                Objects.equals(orderWaitersStatus, that.orderWaitersStatus) &&
                Objects.equals(cooks, that.cooks) &&
                Objects.equals(waiters, that.waiters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatus, orderCooksStatus, orderWaitersStatus, cooks, waiters);
    }
}
