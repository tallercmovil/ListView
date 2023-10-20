package com.amaurypm.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.amaurypm.listview.databinding.ActivityMainBinding
import com.amaurypm.listview.model.Anime
import com.google.android.material.datepicker.RangeDateSelector
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datos = ArrayList<Anime>()

        for(i in 1 .. 20){
            val animeTmp = Anime(i.toLong()+ Random.nextLong(10000), "Título $i", "Tipo $i", "Fecha $i")
            datos.add(animeTmp)
        }

        val miAdapter = AnimesAdapter(this, datos)

        binding.lv.adapter = miAdapter

        binding.lv.setOnItemClickListener { _, view, position, id ->
            Toast.makeText(this, "Click en el elemento en la posición: $position y id: $id", Toast.LENGTH_LONG).show()
        }

    }
}