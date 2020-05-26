package com.tamagotchi.tamagotchiserverprotocol.models;

import org.junit.Assert;
import org.junit.Test;

public class VisitTimeTest {
    @Test
    public void Should_BeEquals_When_TimesAreSame() {
        // Given
        String startSame = "123";
        String endSame = "456";

        // When
        VisitTime actual = new VisitTime(startSame, endSame);
        VisitTime expected = new VisitTime(startSame, endSame);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void Should_NotBeEquals_When_TimesAreNotSame() {
        // Given
        String startSame = "123";
        String endSame = "456";

        // When
        VisitTime actual = new VisitTime(startSame, endSame);
        VisitTime expected = new VisitTime(endSame, startSame);

        // Then
        Assert.assertNotEquals(actual, expected);
    }
}
