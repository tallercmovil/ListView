package com.amaurypm.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.amaurypm.listview.databinding.ElementoListaBinding
import com.amaurypm.listview.model.Anime

/**
 * Creado por Amaury Perea Matsumura el 20/10/23
 */
class AnimesAdapter(
    private val context: Context,
    private val animes: ArrayList<Anime>
):BaseAdapter() {

    override fun getCount(): Int = animes.size


    override fun getItem(position: Int): Any = animes[position]


    override fun getItemId(position: Int): Long = animes[position].id

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
       val binding = ElementoListaBinding.inflate(LayoutInflater.from(context))

        binding.tvTitulo.text = animes[position].titulo
        binding.tvTipo.text = animes[position].tipo
        binding.tvFecha.text = animes[position].fecha

        return binding.root
    }

}