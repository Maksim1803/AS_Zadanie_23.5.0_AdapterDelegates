package com.example.zadanie2350_adapterdelegates.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zadanie2350_adapterdelegates.R
import com.example.zadanie2350_adapterdelegates.model.CountableProduct
import com.example.zadanie2350_adapterdelegates.model.Item
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate

class CountableProductDelegateAdapter: AbsListItemAdapterDelegate<CountableProduct, Item, CountableProductDelegateAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.icon) // из countable_item.xml
        val textName: TextView = itemView.findViewById(R.id.text_name) // из countable_item.xml
        val textDesc: TextView = itemView.findViewById(R.id.text_desc) // из countable_item.xml
        val countTextView: TextView = itemView.findViewById(R.id.count) // из countable_item.xml

    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
        return item is CountableProduct
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.countable_item, parent, false)
        )
    }

    override fun onBindViewHolder(
        item: CountableProduct,
        holder: ViewHolder,
        payloads: MutableList<Any>
    ) {
        holder.icon.setImageResource(item.idIcon)
        holder.textName.text = item.name
        holder.textDesc.text = item.desc
        holder.countTextView.text = item.count.toString()
    }
}
