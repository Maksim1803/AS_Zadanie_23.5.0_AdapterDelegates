package com.example.zadanie2350_adapterdelegates

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zadanie2350_adapterdelegates.adapter.ProductAdapter
import com.example.zadanie2350_adapterdelegates.model.Ad
import com.example.zadanie2350_adapterdelegates.model.CountableProduct
import com.example.zadanie2350_adapterdelegates.model.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ProductAdapter(arrayListOf(
            Product(0, R.drawable.ic_apple, "Apple", "Juicy Apple fruit, which is eaten fresh, serves as a raw material in cooking and for making drinks."),
            // Пример Ad
            Ad ("Акция", "Скидка на бананы 15%"),
            // Пример CountableProduct
            CountableProduct(1, R.drawable.ic_banana, "Банан", "Спелый банан", 10),
            Product(1, R.drawable.ic_banana, "Banana", "It is one of the oldest food crops, and for tropical countries it is the most important food plant and the main export item."),
            Product(2, R.drawable.ic_lemon, "Lemon", "Lemons are eaten fresh, and are also used in the manufacture of confectionery and soft drinks, in the liquor and perfume industry."),
            Product(3, R.drawable.ic_pear, "Pear", "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."),
            Product(4, R.drawable.ic_strawberry, "Strawberry", "A perennial herbaceous plant 5-20 cm high, with a thick brown rhizome. \"Mustache\" is short. The stem is thin."),
            Product(5, R.drawable.ic_orange, "Orange", "Orange juice is widely used as a drink in restaurants and cafes.")
        ))
        recyclerView.adapter = adapter
    }
}
