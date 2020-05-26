package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class DishModel {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("photos")
    @Expose
    private List<Integer> photos;

    public DishModel(int id, String name, String description, List<Integer> photos) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getPhotos() {
        return photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishModel dishModel = (DishModel) o;
        return id == dishModel.id &&
                Objects.equals(name, dishModel.name) &&
                Objects.equals(description, dishModel.description) &&
                Objects.equals(photos, dishModel.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, photos);
    }
}
