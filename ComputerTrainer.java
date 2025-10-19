package PokemonSimulation;

/**
 * ComputerTrainer, subclass of PokemonTrainer that allows the user to create a trainer that randomly generates moves and pokemon
 * */
public class ComputerTrainer extends PokemonTrainer
{

    // Possible pokemon names and move names to generate random Pokemon
    private static final String[] POKEMON_NAMES = {"Pikachu", "Bulbasaur", "Charmander", "Squirtle"};
	private static final String[] MOVE_NAMES = {"Tailwhip", "Bodyslam", "Splash", "Shock"};
	private static final int MAX_DAMAGE = 25;
	private static final int MAX_MOVES = 4;

	private PokemonImages images = new PokemonImages();
    /**
     * Creates a new Computer Trainer that extends the Pokemon Trainer class
     * adds two randomly generated Pokemon to itself in the constructor
     * @param name (String) - name of the ComputerTrainer
    */
    public ComputerTrainer(String name)
    {
        // fill this in
        super(name);
        addRandomPokemon();
        addRandomPokemon();
    }
    /**
	* Returns a random integer between 0 and n-1, inclusive
	* @return a random integer between 0 and n-1, inclusive
	*/	
	public static int random(int n) {
		return (int)(Math.random() * n);
	}
    /**
     * Adds a randomly generated Pokemon to this ComputerTrainer's
     * collection of Pokemon. A ComputerTrainer can only have 2
     * Pokemon.
     * @return true/false
    */
    public boolean addRandomPokemon()
    {
        // fill this in
        String randomPokemonName = POKEMON_NAMES[random(POKEMON_NAMES.length)];
        Pokemon newP = new Pokemon(randomPokemonName);
        
        for(int i = 0; i < 4; i++){
            String randomMoveName = MOVE_NAMES[random(MOVE_NAMES.length)];
            Move move = new Move (randomMoveName, random(MAX_DAMAGE));
            newP.learnMove(move);
            }
        for(int i = 0; i < 2; i++){
            if(pokemons[i] == null){
            pokemons[i] = newP;
            return true;
            }
        }
        return false;
    }
    
    /**
     * Randomly choses a move from the set of moves that the 
     * computer trainer's pokemon knows
     * returns null if all pokemon have fainted
     * @return randomly chosen move
    */
    public Move chooseRandomMove()
    {
        Pokemon currentBattlingPokemon = getNextPokemon();
        // fill this in
    
            if(currentBattlingPokemon == null || currentBattlingPokemon.hasFainted()){
              return null;
            }
            
            else{}
        
            int i = 0;
            for(i = 0; i < 4; i++){
                if(currentBattlingPokemon.moves[i] == null){
                    return null;
                }
            
            }
        return currentBattlingPokemon.moves[random(currentBattlingPokemon.moves.length)];
    }
}
