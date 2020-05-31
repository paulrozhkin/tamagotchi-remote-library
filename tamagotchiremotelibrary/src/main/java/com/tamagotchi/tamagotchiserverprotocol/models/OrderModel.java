package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.OrderStatus;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.StaffStatus;

import java.util.List;
import java.util.Objects;

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
    private OrderStatus orderStatus;
    @SerializedName("orderCooksStatus")
    @Expose
    private StaffStatus orderCooksStatus;
    @SerializedName("orderWaitersStatus")
    @Expose
    private StaffStatus orderWaitersStatus;
    @SerializedName("reservedTable")
    @Expose
    private List<Integer> reservedTable = null;
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
     * @param reservedTable
     * @param visitTime
     * @param waiters
     * @param client
     * @param comment
     * @param timeCreated
     * @param id
     */
    public OrderModel(Integer restaurant,
                      Integer client,
                      List<Integer> menu,
                      Integer numberOfPersons,
                      String comment,
                      OrderStatus orderStatus,
                      StaffStatus orderCooksStatus,
                      StaffStatus orderWaitersStatus,
                      List<Integer> reservedTable,
                      List<Integer> cooks,
                      List<Integer> waiters,
                      Integer totalAmount,
                      Integer id,
                      VisitTime visitTime,
                      String timeCreated) {
        super();
        this.restaurant = restaurant;
        this.client = client;
        this.menu = menu;
        this.numberOfPersons = numberOfPersons;
        this.comment = comment;
        this.orderStatus = orderStatus;
        this.orderCooksStatus = orderCooksStatus;
        this.orderWaitersStatus = orderWaitersStatus;
        this.reservedTable = reservedTable;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<Integer> getReservedTable() {
        return reservedTable;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderModel that = (OrderModel) o;
        return Objects.equals(restaurant, that.restaurant) &&
                Objects.equals(client, that.client) &&
                Objects.equals(menu, that.menu) &&
                Objects.equals(numberOfPersons, that.numberOfPersons) &&
                Objects.equals(comment, that.comment) &&
                orderStatus == that.orderStatus &&
                orderCooksStatus == that.orderCooksStatus &&
                orderWaitersStatus == that.orderWaitersStatus &&
                Objects.equals(reservedTable, that.reservedTable) &&
                Objects.equals(cooks, that.cooks) &&
                Objects.equals(waiters, that.waiters) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(id, that.id) &&
                Objects.equals(visitTime, that.visitTime) &&
                Objects.equals(timeCreated, that.timeCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurant, client, menu, numberOfPersons, comment, orderStatus, orderCooksStatus, orderWaitersStatus, reservedTable, cooks, waiters, totalAmount, id, visitTime, timeCreated);
    }
}
