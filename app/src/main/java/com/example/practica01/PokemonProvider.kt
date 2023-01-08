package com.example.practica01

class PokemonProvider {
    companion object{
        var pokemonList = listOf<Pokemon>(
            Pokemon(
                "Pikachu",
                "Eletrico",
                "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/7/77/latest/20150621181250/Pikachu.png/300px-Pikachu.png"
            ),
            Pokemon(
                "Piplup",
                "Agua",
                "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/1/11/latest/20200827204128/Piplup.png/300px-Piplup.png"
            ),
            Pokemon(
                "Bulbasaur",
                "Planta",
                "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/4/43/latest/20190406170624/Bulbasaur.png/300px-Bulbasaur.png"
            ),
            Pokemon(
                "Charmander",
                "Fuego",
                "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/56/latest/20200307023245/Charmander.png/300px-Charmander.png"
            ),
            Pokemon(
                "Squirtle",
                "Agua",
                "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/e/e3/latest/20160309230820/Squirtle.png/300px-Squirtle.png"
            )
        )
    }
}