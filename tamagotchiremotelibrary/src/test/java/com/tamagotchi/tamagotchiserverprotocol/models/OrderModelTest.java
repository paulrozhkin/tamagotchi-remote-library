package com.tamagotchi.tamagotchiserverprotocol.models;

import com.tamagotchi.tamagotchiserverprotocol.models.enums.OrderStatus;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.StaffStatus;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Тесты для класса  {@link OrderModelTest}
 */
public class OrderModelTest {

    // Set defaults
    private static final Integer defaultRestaurant = 1;
    private static final Integer defaultClient = 1;
    private static final List<Integer> defaultMenu = new ArrayList<Integer>() {{
        add(1);
        add(2);
    }};
    private static final Integer defaultNumberOfPersons = 4;
    private static final String defaultComment = "Be best";
    private static final OrderStatus defaultOrderStatus = OrderStatus.Completed;
    private static final StaffStatus defaultCooksStatus = StaffStatus.Ready;
    private static final StaffStatus defaultWaitersStatus = StaffStatus.Ready;
    private static final List<Integer> defaultCooks = new ArrayList<Integer>() {{
        add(1);
    }};
    private static final List<Integer> defaultWaiters = new ArrayList<Integer>() {{
        add(2);
    }};
    private static final Integer defaultTotalAmounts = 123;
    private static final Integer defaultTotalId = 1;
    private static final String defaultTimeCreated = "2020-05-19T19:00:00+03:00";
    private static final VisitTime defaultVisitTIme = new VisitTime("2020-05-19T16:00:00+03:00",
            "2020-05-19T19:00:00+03:00");

    private OrderModel defaultOderModel;

    @Before
    public void initDefaultOderModel() {
        defaultOderModel = new OrderModel(
                defaultRestaurant,
                defaultClient,
                defaultMenu,
                defaultNumberOfPersons,
                defaultComment,
                defaultOrderStatus,
                defaultCooksStatus,
                defaultWaitersStatus,
                defaultCooks,
                defaultWaiters,
                defaultTotalAmounts,
                defaultTotalId,
                defaultVisitTIme,
                defaultTimeCreated
        );
    }

    @Test
    public void Should_BeEquals_When_FieldsAreSame() {
        // Given
        OrderModel actual = defaultOderModel;

        // When
        OrderModel expected = new OrderModel(
                defaultRestaurant,
                defaultClient,
                defaultMenu,
                defaultNumberOfPersons,
                defaultComment,
                defaultOrderStatus,
                defaultCooksStatus,
                defaultWaitersStatus,
                defaultCooks,
                defaultWaiters,
                defaultTotalAmounts,
                defaultTotalId,
                defaultVisitTIme,
                defaultTimeCreated
        );

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void Should_NotBeEquals_When_FieldsAreNoteSame() {
        // Given
        OrderModel actual = defaultOderModel;

        // When
        OrderModel expected = new OrderModel(
                3,
                5,
                defaultMenu,
                defaultNumberOfPersons,
                defaultComment,
                defaultOrderStatus,
                defaultCooksStatus,
                defaultWaitersStatus,
                defaultCooks,
                defaultWaiters,
                defaultTotalAmounts,
                defaultTotalId,
                defaultVisitTIme,
                defaultTimeCreated
        );
        
        // Then
        Assert.assertNotEquals(actual, expected);
    }
}
