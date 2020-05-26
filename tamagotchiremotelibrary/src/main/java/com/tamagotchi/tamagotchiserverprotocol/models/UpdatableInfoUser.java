package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.Roles;

import java.util.Objects;

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
    private Integer avatar;

    @SerializedName("password")
    @Expose
    private String password;

    public UpdatableInfoUser(String login, Roles role, String fullName, String isBlocked, Integer avatar, String password) {
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

    public Integer getAvatar() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdatableInfoUser that = (UpdatableInfoUser) o;
        return Objects.equals(login, that.login) &&
                role == that.role &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(isBlocked, that.isBlocked) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, role, fullName, isBlocked, avatar, password);
    }
}
