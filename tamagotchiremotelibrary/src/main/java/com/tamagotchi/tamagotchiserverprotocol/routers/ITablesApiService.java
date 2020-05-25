package com.tamagotchi.tamagotchiserverprotocol.routers;

import com.tamagotchi.tamagotchiserverprotocol.models.TableModel;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ITablesApiService {
    /**
     * Get tables.
     * @return restaurant tables.
     */
    @GET("restaurants/{restaurantId}/tables")
    Single<List<TableModel>> getTables(@Path("restaurantId") Integer restaurantId);

    /**
     * Get table by id.
     * @return table.
     */
    @GET("restaurants/{restaurantId}/tables/{tableId}")
    Single<TableModel> getMenuItemById(@Path("restaurantId") Integer restaurantId, @Path("tableId") Integer tableId);
}
