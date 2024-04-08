package com.pokemon.demo.services;

import com.pokemon.demo.model.Pokemon;
import com.pokemon.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getThemAll() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> getPokemonById(long id){
        return pokemonRepository.findById(id);
    }

    public void savePokemon(Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }
}
