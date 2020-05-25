package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.Roles;

public class UserModel {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("role")
    @Expose
    private Roles role;

    @SerializedName("fullName")
    @Expose
    private String fullName;

    @SerializedName("isBlocked")
    @Expose
    private String isBlocked;

    @SerializedName("avatar")
    @Expose
    private String avatar;

    public UserModel() {

    }

    public UserModel(Integer id, String login, Roles role, String fullName, String isBlocked, String avatar) {
        this.id = id;
        this.login = login;
        this.role = role;
        this.fullName = fullName;
        this.isBlocked = isBlocked;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public Roles getRole() {
        return role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public String getAvatar() {
        return avatar;
    }
}
