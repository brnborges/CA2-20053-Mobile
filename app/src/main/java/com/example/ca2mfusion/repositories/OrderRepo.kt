package com.example.ca2mfusion.repositories

import com.example.ca2mfusion.db.AppDatabase
import com.example.ca2mfusion.db.entity.Food
import io.reactivex.Flowable
import io.reactivex.Single

class OrderRepo(private val db: AppDatabase): OrderRepoI {

    override fun update(food: Food): Single<Int> {
        return db.foodDao().updateFood(food)
    }

    override fun getCartItem(): Flowable<List<Food>> {
        return db.foodDao().getCartList()
    }

    override fun getAllItem(): Flowable<List<Food>> {
        return db.foodDao().getAllList()
    }
}