package com.example.countryapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.countryapp.R
import com.example.countryapp.model.Country
import com.example.countryapp.view.viewholder.CountryViewHolder

/**
 * CountryAdapter
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
class CountryAdapter(list: List<Country>,val onClickEvent: (Country) -> Unit): RecyclerView.Adapter<CountryViewHolder>() {

    var countries: List<Country> = list
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.bind(country, onClickEvent)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}