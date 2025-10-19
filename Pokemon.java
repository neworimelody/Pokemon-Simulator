package PokemonSimulation;


import java.util.ArrayList;
/**
 * Pokemon class, allows the user to create a pokemon 
 * */
public class Pokemon
{
    // Private constants
    private static final int MAX_HEALTH = 100;
    private static final int MAX_MOVES = 4;
    private String name; 
    private int health; 
    private String image;
    public Move [] moves = new Move [4];
    

    // Write your Pokemon class here
    
    /**
     * Creates a new Pokemon that takes in a String as its parameter to set the name
     * sets the health to 100 (default)
     * @param name (String) - name of the Pokemon
    */
    public Pokemon(String name){
        this.name = name;
        health = 100;
    }
    /**
     * Creates a new Pokemon that takes in a String as its parameter to set the name
     * sets the health to 100 (default)
     * If the pokemon has an ASCII image, this constructor will be used
     * @param name (String) - name of the Pokemon
     * @param image (String) - image that comes with the Pokemon (if it has one)
    */
    public Pokemon(String name, String image){
        this.name = name; 
        this.image = image;
        health = 100;
    }
    /**
     * Retrieves the name of the Pokemon
     * @return name of the Pokemon
    */
    public String getName(){
        return name;
    }
     /**
     * Retrieves the amount of health the Pokemon has
     * @return health of the Pokemon
    */
    public int getHealth(){
        return health;
    }
    /**
     * Sets the image to the String parameter it takes in
     * @param image (String) - the image that the user wishes to set 
     * the pre-existing image to
    */
    public void setImage(String image){
        this.image = image;
    }
     /**
     * Retrieves the ASCII image of the Pokemon
     * @return ASCII image of the Pokemon 
    */
    public String getImage(){
        return image;
    }
    /**
     * Creates an arraylist and adds moves that the pokemon knows to it
     * Retrieves all of the moves that the current Pokemon knows
     * @return all known moves of the Pokemon 
    */
    public ArrayList<Move> getMoves(){
       ArrayList<Move> knownMoves = new ArrayList<Move>();
        
        for(int i = 0; i < moves.length; i++){
            knownMoves.add(moves[i]);
        }
       return knownMoves; 
    }
    /**
     * Checks if the Pokemon has fainted through the health
     * if the health is equal to or less than 0, the pokemon has fainted
     * @return true if health <= 0
     * @return false otherwise
    */
    public boolean hasFainted(){
        if(health <= 0){
            return true;
        }
    return false;
    }
    /**
     * Checks if the Pokemon can still learn more moves
     * Goes through each index of the array to check if it = null
     * (if the array still has room)
     * @return true if there are still indexes where moves = null
     * @return false if there is no more indexes left to fill
    */
    public boolean canLearnMoreMoves(){
        for(int i = 0; i < moves.length; i++){
            if(moves[i] == null ){
                return true; 
            }
        }
        return false; 
    }
    /**
     * Allows the pokemon to learn more moves if there is still space
     * and if they do not already know the move
     * @return true if there is room and they don't know the move yet
     * @return false otherwise
    */
    public boolean learnMove(Move move){
         
        //  for(int i = 0; i < 4; i++){
        //     if(moves[i] != null&&move.equals(moves[i])) {
        //         //System.out.println("You already know " + move);
        //         return false;
        //     }
        // }
         for(int i = 0; i < 4; i++){
            if(moves[i] == null ){
                moves[i] = move;
                // System.out.println("you have learned " + move);
                 return true;
            }
        }
        // System.out.println("You can not learn " + move + "because moves is full");

        return false;
    }
    /**
     * Allows a pokemon to forget a move they already know
     * Checks if the move they want to forget is in the array 
     * Removes that move from the array by setting that index to null
     * @param move (Move) - the move that the Pokemon wishes to forget
    */
    public void forgetMove(Move move){
        
     
         for(int i = 0; i < moves.length; i++){
            if(moves[i]!= null && move.equals(moves[i]) ){
                moves[i] = null;
                // System.out.println("you have forgotten " + move);
            }
        }
        // System.out.println("You have already forgotten " + move);
        
    }
    /**
     * Checks if a Pokemon knows a certain move 
     * if the move at index has the same name as the move they want to check
     * the method will return true
     * @return true if the Pokemon knows the move
     * @return false otherwise
    */
    public boolean knowsMove(String moveName){
        for(int i = 0; i < moves.length; i++){
            if(moves[i].equals(moveName)){
                return true;
            }
        }
        return false;
    }
    /**
     * Allows a Pokemon to attack nother Pokemon using a move of their choice
     * subtracts the damage delt from the health if the move they wish to use exists 
     * @return true if the move they wish to use matches up with an existing move
     * @return false otherwise
     * @param opponent (Pokemon) - the Pokemon that the user wishes to attack with a chosen pokemon
     * @param move (Move) - the move that the user wishes to use to attack
    */
    public boolean attack (Pokemon opponent, Move move){
        int dmg = move.getDamage();
        // for(int i = 0; i < moves.length; i++){
        //     if(move != null && moves[i].equals(move)){
        //         opponent.health -= dmg;
        //         return true;
        //         }
        //     return false;
        // }
        
        if(move!= null){
            opponent.health -=dmg;
            return true;
        }
        return false;
    }
    /**
     * if an ASCII image of the pokemon exists, it will retreive that image
     * along with other known stats like name, health, and max health and puts
     * it in a String statement
     * excludes the ASCII image if it does not exist for a specific Pokemon
     * @return String statement of known information of the Pokemon including ASCII image
     * @return String statement of known information of the Pokemon excluding ASCII image
    */
    public String toString(){ 
        if(getImage() != null){
            return name + " (Health: " + health + " / " + MAX_HEALTH + ")" + getImage();
        }
        return name + " (Health: " + health + " / " + MAX_HEALTH + ")";
    }
}