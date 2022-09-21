package com.example.countryapp.view.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.countryapp.R
import com.example.countryapp.model.Country

/**
 * CountryViewHolder
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameTextView: TextView
    val imageView: ImageView

    init {
        nameTextView = view.findViewById(R.id.name)
        imageView = view.findViewById(R.id.flag_image)
    }

    fun bind(country: Country, onClickEvent: (Country) -> Unit) {
        itemView.setOnClickListener {
            onClickEvent(country)
        }
        nameTextView.text = country.name
        imageView.setImageDrawable(ContextCompat.getDrawable(itemView.context, country.flag))
    }
}