package com.example.zadanie2350_adapterdelegates.model

import androidx.annotation.DrawableRes

class CountableProduct(
    val id: Int, @DrawableRes val idIcon: Int,
    val name: String,
    val desc: String,
    val count: Int // Количество товаров
) : Item
