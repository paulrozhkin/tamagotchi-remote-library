package com.tamagotchi.tamagotchiserverprotocol.models;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты для класса  {@link AuthenticateInfoModel}
 */
public class AuthenticateInfoModelTest {

    @Test
    public void Should_GetCorrectToken_When_Create() {
        // Given
        String token = "token";

        // When
        AuthenticateInfoModel created = new AuthenticateInfoModel(token);

        // Then
        Assert.assertEquals(token, created.getToken());
    }

    @Test
    public void Should_BeEquals_When_TokenAreSame() {
        // Given
        String sameTokens = "tokens";

        // When
        AuthenticateInfoModel actual = new AuthenticateInfoModel(sameTokens);
        AuthenticateInfoModel expected = new AuthenticateInfoModel(sameTokens);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void Should_NotBeEquals_When_TokenAreNotSame() {
        // Given
        String firstToken = "firstToken";
        String secondToken = "secondToken";

        // When
        AuthenticateInfoModel actual = new AuthenticateInfoModel(firstToken);
        AuthenticateInfoModel expected = new AuthenticateInfoModel(secondToken);

        // Then
        Assert.assertNotEquals(actual, expected);
    }
}
