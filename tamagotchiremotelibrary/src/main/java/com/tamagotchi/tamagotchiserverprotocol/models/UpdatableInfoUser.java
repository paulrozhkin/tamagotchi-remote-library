package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.Roles;

public class UpdatableInfoUser {
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

    @SerializedName("password")
    @Expose
    private String password;

    public UpdatableInfoUser(String login, Roles role, String fullName, String isBlocked, String avatar, String password) {
        this.login = login;
        this.role = role;
        this.fullName = fullName;
        this.isBlocked = isBlocked;
        this.avatar = avatar;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public String getFullName() {
        return fullName;
    }

    public Roles getRole() {
        return role;
    }

    public String getLogin() {
        return login;
    }
}
