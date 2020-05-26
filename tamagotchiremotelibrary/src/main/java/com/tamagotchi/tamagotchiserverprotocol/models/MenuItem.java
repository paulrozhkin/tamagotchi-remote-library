package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class MenuItem {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("price")
    @Expose
    private int price;

    @SerializedName("dish")
    @Expose
    private int dishId;

    @SerializedName("isDeleted")
    @Expose
    private boolean isDeleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id &&
                price == menuItem.price &&
                dishId == menuItem.dishId &&
                isDeleted == menuItem.isDeleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, dishId, isDeleted);
    }

    public MenuItem(int id, int price, int dishId, boolean isDeleted) {
        this.id = id;
        this.price = price;
        this.dishId = dishId;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getDishId() {
        return dishId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
