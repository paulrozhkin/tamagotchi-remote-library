package com.tamagotchi.tamagotchiserverprotocol.routers;

import com.tamagotchi.tamagotchiserverprotocol.models.OrderCreateModel;
import com.tamagotchi.tamagotchiserverprotocol.models.OrderModel;
import com.tamagotchi.tamagotchiserverprotocol.models.OrderPathModel;
import com.tamagotchi.tamagotchiserverprotocol.models.enums.OrderStatus;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IOrdersApiService {

    /**
     * Get all orders in system.
     * @param clientFilter filtration orders by user id.
     * @param statusFilter filtration by status order.
     * @param cooksStatusFilter filtration by status cooks in order.
     * @param waitersStatusFilter filtration by status waiters in order.
     * @return Observable orders.
     */
    @GET("orders")
    Single<List<OrderModel>> getAllOrders(@Query("client") String clientFilter,
                                          @Query("status") OrderStatus statusFilter,
                                          @Query("cooks_status") OrderStatus cooksStatusFilter,
                                          @Query("waiters_status") OrderStatus waitersStatusFilter);


    /**
     * Get order by id.
     * @return order item.
     */
    @GET("orders/{id}")
    Single<OrderModel> getOrderById(@Path("id") Integer orderId);

    /**
     * Create new oder in system.
     * @param newOder order.
     * @return completable
     */
    @POST("orders")
    Completable createOrder(@Body OrderCreateModel newOder);

    /**
     * Patch order by id.
     * @param orderId order id.
     * @param order update info
     * @return order
     */
    @PATCH("orders/{id}")
    Single<OrderModel> pathOrder(@Path("id") Integer orderId, @Body OrderPathModel order);
}
