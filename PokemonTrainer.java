package PokemonSimulation;
/**
 * PokemonTrainer class, allows the user to create a PokemonTrainer object
 * */
public class PokemonTrainer
{
    // private constants
    private static final int MAX_POKEMON = 2;
    private String name;
    private int numPokemon;
    public Pokemon [] pokemons = new Pokemon [2];
    
    // Write your PokemonTrainer class here
    /**
     * Creates a new PokemonTrainer object that takes a String name 
     * as its parameter 
     * sets inital number of Pokemon to 0
    */
    public PokemonTrainer(String name){
        this.name = name;
        numPokemon = 0;
    }
    /**
     * Adds pokemon to a PokemonTrainer's inventory of Pokemon if 
     * the pokemon at either index is null (there is space for a new
     * Pokemon)
     * @return true if there is room to add a new Pokemon
     * @return false otherwise 
    */
    public boolean addPokemon(Pokemon p){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] == null){
                pokemons[i] = p;
                return true; 
            }
        }
        return false;
    }
    /**
     * Checks if the trainer has lost
     * loses when all of the trainer's pokemon have fainted (their health =0)
     * @return true if all of the trainer's pokemon have fainted
     * @return false otherwise
    */
    public boolean hasLost(){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i].hasFainted() && pokemons[i+1].hasFainted()){
                return true;
            }
        }
        return false;
        
    }
    /**
     * Retrieves the next pokemon that has not fainted 
     * checks if one of the two pokemon a trainer has is fainted 
     * @return the next pokemon that has not fainted
     * @return null if both pokemon have fainted or the trainer only has one pokemon
    */
    public Pokemon getNextPokemon(){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] != null && !pokemons[i].hasFainted()){
                return pokemons[i];
            }
        }
        return null;
    }
    /**
     * Retrieves known information about the trainer as a string
     * @return name of the trainer
    */
    public String toString(){
        return name; 
    }
}
