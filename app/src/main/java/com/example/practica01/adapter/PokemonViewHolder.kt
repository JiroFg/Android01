package com.example.practica01.adapter
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practica01.Pokemon
import com.example.practica01.databinding.ItemPokemonBinding

class PokemonViewHolder(view: View):RecyclerView.ViewHolder(view){
    val binding = ItemPokemonBinding.bind(view)
    fun render(pokemonModel:Pokemon, onClickListener: (Pokemon)->Unit){
        binding.tvPokemonName.text = pokemonModel.nombre
        binding.tvPokemonType.text = pokemonModel.tipo
        Glide.with(binding.ivPokemon.context).load(pokemonModel.img).into(binding.ivPokemon)
        itemView.setOnClickListener{onClickListener(pokemonModel)}
    }
}