package com.example.practica01.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica01.Pokemon
import com.example.practica01.R

class PokemonAdapter(private val pokemonList:List<Pokemon>, private val onClickListener:(Pokemon)->Unit) : RecyclerView.Adapter<PokemonViewHolder>(){
    //recibe la vista para crear el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PokemonViewHolder(layoutInflater.inflate(R.layout.item_pokemon, parent, false))
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = pokemonList[position]
        holder.render(item, onClickListener)
    }
    //Numero de elementos de la lista
    override fun getItemCount(): Int = pokemonList.size

}