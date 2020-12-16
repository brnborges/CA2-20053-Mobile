package com.example.ca2mfusion.repositories

import com.example.ca2mfusion.db.entity.Food
import io.reactivex.Flowable
import io.reactivex.Single

interface OrderRepoI {
    fun update(food: Food): Single<Int>

    fun getCartItem(): Flowable<List<Food>>

    fun getAllItem(): Flowable<List<Food>>
}