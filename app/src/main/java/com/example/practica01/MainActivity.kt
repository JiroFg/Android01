package com.example.practica01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica01.adapter.PokemonAdapter
import com.example.practica01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //val manager = GridLayoutManager(this,2)
        binding.recyclerPokemon.layoutManager = manager
        binding.recyclerPokemon.adapter = PokemonAdapter(PokemonProvider.pokemonList){
            onItemSelected(it)
        }
    }

    fun onItemSelected(pokemon:Pokemon){
        Toast.makeText(this,pokemon.nombre,Toast.LENGTH_SHORT).show()
    }
}