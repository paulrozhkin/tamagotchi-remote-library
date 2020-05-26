package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class RestaurantModel {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("positionLatitude")
    @Expose
    private Double positionLatitude;

    @SerializedName("photos")
    @Expose
    private List<Integer>  photos;

    @SerializedName("positionLongitude")
    @Expose
    private Double positionLongitude;

    @SerializedName("isParkingPresent")
    @Expose
    private Boolean isParkingPresent;

    @SerializedName("isCardPaymentPresent")
    @Expose
    private Boolean isCardPaymentPresent;

    @SerializedName("isWifiPresent")
    @Expose
    private Boolean isWifiPresent;

    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPositionLatitude() {
        return positionLatitude;
    }

    public void setPositionLatitude(double positionLatitude) {
        this.positionLatitude = positionLatitude;
    }

    public List<Integer> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Integer> photos) {
        this.photos = photos;
    }

    public Double getPositionLongitude() {
        return positionLongitude;
    }

    public void setPositionLongitude(Double positionLongitude) {
        this.positionLongitude = positionLongitude;
    }

    public Boolean getParkingPresent() {
        return isParkingPresent;
    }

    public void setParkingPresent(Boolean parkingPresent) {
        isParkingPresent = parkingPresent;
    }

    public Boolean getCardPaymentPresent() {
        return isCardPaymentPresent;
    }

    public void setCardPaymentPresent(Boolean cardPaymentPresent) {
        isCardPaymentPresent = cardPaymentPresent;
    }

    public Boolean getWifiPresent() {
        return isWifiPresent;
    }

    public void setWifiPresent(Boolean wifiPresent) {
        isWifiPresent = wifiPresent;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantModel that = (RestaurantModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(address, that.address) &&
                Objects.equals(positionLatitude, that.positionLatitude) &&
                Objects.equals(photos, that.photos) &&
                Objects.equals(positionLongitude, that.positionLongitude) &&
                Objects.equals(isParkingPresent, that.isParkingPresent) &&
                Objects.equals(isCardPaymentPresent, that.isCardPaymentPresent) &&
                Objects.equals(isWifiPresent, that.isWifiPresent) &&
                Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, positionLatitude, photos, positionLongitude, isParkingPresent, isCardPaymentPresent, isWifiPresent, isDeleted);
    }
}
