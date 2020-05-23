package com.tamagotchi.tamagotchiserverprotocol;

import com.tamagotchi.tamagotchiserverprotocol.models.RestaurantModel;

import org.junit.Test;

import java.net.SocketException;
import java.util.List;

import retrofit2.HttpException;
import retrofit2.http.HTTP;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TamagotchiUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_connection_success() {
        boolean isConnectionFailed = false;

        try {
            List<RestaurantModel> restaurants = RestaurantClient.getInstance().getRestaurantsService().getAllRestaurants().blockingGet();
        }
        catch (HttpException ex) {
            if (ex.code() != 401) {
                isConnectionFailed = true;
            }
        }

        assertFalse(isConnectionFailed);
    }
}