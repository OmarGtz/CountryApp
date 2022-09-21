package com.example.countryapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.countryapp.R
import com.example.countryapp.model.DataStore
import com.example.countryapp.view.adapter.CountryAdapter

class MainActivity : AppCompatActivity() {

    lateinit var list: RecyclerView
    lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = findViewById(R.id.country_list)
        adapter = CountryAdapter(DataStore.countries) { country ->
            Toast.makeText(this, "Click en ${country.name}", Toast.LENGTH_SHORT).show()
        }
        list.adapter = adapter
    }

}