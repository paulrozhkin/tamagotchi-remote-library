package com.tamagotchi.tamagotchiserverprotocol.models.enums;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.UserModel;

public class UserWithJwtModel extends UserModel {
    @SerializedName("token")
    @Expose
    private String token;

    public UserWithJwtModel() {

    }

    public UserWithJwtModel(Integer id, String login, Roles role, String fullName, Boolean isBlocked, Integer avatar) {
        super(id, login, role, fullName, isBlocked, avatar);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
