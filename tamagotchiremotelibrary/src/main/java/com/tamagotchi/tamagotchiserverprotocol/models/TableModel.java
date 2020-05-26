package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TableModel {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("numberOfPlaces")
    @Expose
    private Integer numberOfPlaces;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("photos")
    @Expose
    private List<Integer> photos = new ArrayList<Integer>();
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * No args constructor for use in serialization
     *
     */
    public TableModel() {
    }

    /**
     *
     * @param numberOfPlaces
     * @param isDeleted
     * @param name
     * @param description
     * @param id
     * @param photos
     */
    public TableModel(String name, Integer numberOfPlaces, String description, List<Integer> photos, Boolean isDeleted, Integer id) {
        super();
        this.name = name;
        this.numberOfPlaces = numberOfPlaces;
        this.description = description;
        this.photos = photos;
        this.isDeleted = isDeleted;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getPhotos() {
        return photos;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableModel that = (TableModel) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(numberOfPlaces, that.numberOfPlaces) &&
                Objects.equals(description, that.description) &&
                Objects.equals(photos, that.photos) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPlaces, description, photos, isDeleted, id);
    }
}
