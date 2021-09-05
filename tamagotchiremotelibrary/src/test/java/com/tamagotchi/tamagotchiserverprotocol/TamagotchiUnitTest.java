package com.tamagotchi.tamagotchiserverprotocol;

import com.tamagotchi.tamagotchiserverprotocol.models.AuthenticateInfoModel;
import com.tamagotchi.tamagotchiserverprotocol.models.OrderModel;
import com.tamagotchi.tamagotchiserverprotocol.models.RestaurantModel;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import retrofit2.HttpException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TamagotchiUnitTest {

//    @Before
//    public void initClient() {
//        RestaurantClient.getInstance().getAuthenticateInfoService().LogIn(new AuthenticateInfoModel("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6Ik1hbmFnZXIiLCJpYXQiOjE1ODk4MzE3NjF9.UG-UTOnTz-EWvKPWjEMNoBzKhu9tbloZuV-rSwTmCmM"));
//    }
//
//    @Test
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
//
//    @Test
//    public void test_connection_success() {
//        boolean isConnectionFailed = false;
//
//        try {
//            List<RestaurantModel> restaurants = RestaurantClient.getInstance().getRestaurantsService().getAllRestaurants().blockingGet();
//        } catch (HttpException ex) {
//            if (ex.code() != 401) {
//                isConnectionFailed = true;
//            }
//        }
//
//        assertFalse(isConnectionFailed);
//    }
//
//    @Test
//    public void orders_getAllTest() {
//        boolean isSuccess = false;
//
//        try {
//            List<OrderModel> orders = RestaurantClient.getInstance().getOrdersApiService().getAllOrders(
//                    null, null, null, null).blockingGet();
//            isSuccess = true;
//        } catch (Exception e) {
//            isSuccess = false;
//        }
//
//        assertTrue(isSuccess);
//    }
}