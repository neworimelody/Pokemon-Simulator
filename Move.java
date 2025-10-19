package PokemonSimulation;

//Copy over your code for the Move class here

/**
 * Move class, allows the user to create move for their pokemon
 * */
public class Move
{
 // Private constants
 private static final int MAX_DAMAGE = 25;
 private String name; 
 private int damage; 
 // Write your implementation of the Move class here
 
 /**
  * Creates a new Move object that takes in the parameters name
  * and how much damage it does
  * if the damage being set exceeds 25 (max damage)
  * it will capped at 25 (sets it back to 25)
  * @param name (String) - name of the move
  * @param damage (int) - the amount of damage the move does
 */
 public Move(String name, int damage){
     this.name = name;
     this.damage = damage;
     if(this.damage > MAX_DAMAGE){
         this.damage = MAX_DAMAGE;
     }
     
 }
 /**
  * Retrieves the name of the move
  * @return name of the move
 */
 public String getName(){
     return name;
 }
 /**
  * Retrieves the amount of damage the move does
  * @return the amount of damage the move does
 */
 public int getDamage(){
     return damage; 
 }
 /**
  * checks if one move has the same name as another move
  * @return true if they do have the same name
  * @return false if they do not have the same name
  * @param other (Move) - the move the user wishes to check equality with 
 */
 public boolean equals(Move other){
     if(this.getName().equals(other.getName())){
         return true;
     }
     return false;
 }
 /**
  * Retrieves known information about the move (damage and name) 
  * and formats it in a String statement
  * @return formatted String statement
 */
 public String toString(){
     return name + " (" + damage + " Damage)";
 }
     
}
