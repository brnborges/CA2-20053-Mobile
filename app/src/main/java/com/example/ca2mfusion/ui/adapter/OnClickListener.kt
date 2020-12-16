package com.example.ca2mfusion.ui.adapter

import com.example.ca2mfusion.db.entity.Food

interface OnClickListener {
    fun update(food: Food, position: Int)
}