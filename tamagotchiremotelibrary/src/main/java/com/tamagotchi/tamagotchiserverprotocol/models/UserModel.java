package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.Roles;

import java.util.Objects;

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
    private Boolean isBlocked;

    @SerializedName("avatar")
    @Expose
    private Integer avatar;

    public UserModel() {

    }

    public UserModel(Integer id, String login, Roles role, String fullName, Boolean isBlocked, Integer avatar) {
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

    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public Integer getAvatar() {
        return avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) &&
                Objects.equals(login, userModel.login) &&
                role == userModel.role &&
                Objects.equals(fullName, userModel.fullName) &&
                Objects.equals(isBlocked, userModel.isBlocked) &&
                Objects.equals(avatar, userModel.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, role, fullName, isBlocked, avatar);
    }
}
