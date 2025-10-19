package PokemonSimulation;

import java.util.Scanner; 
import java.util.ArrayList;

/**
 * Nori Zhang
 * 
 * 3/7/25
 * Pokemon Simulator
 * 
 * Runs the pokemon simulator 
 * */
public class PokemonSimulation 
{
    private PokemonImages images = new PokemonImages();
    /**
     * Runs the simulator by allowing a user to set up their trainer account
     * through inputting a username (through a scanner) and chosing various pokemon 
     * the user will set up one pokemon at a time and it will then get added to the unique array of 
     * pokemon that belongs to the trainer.
     * Then the user can teach the pokemon moves. The trainer can teach a 
     * total of 4 moves (length of the moves array) but can stop at any time by inputting
     * "no" when asked if you wish to teach your pokemon more moves.
     * the trainer can input a unique name and damage for each move.
     * this process for learning moves and chosing pokemon will happen twice for each player
     * (once per pokemon)
     * once the trainer is set up, they will be asked to chose a pokemon 
     * to put into battle. once they chose, the computer/opponent will also chose
     * if the opponent is a computer trainer, they will chose a random pokemon with
     * a random set of moves from their array of pokemon
     * the two trainers will then take turns attacking each other using their own
     * array of moves. (they will chose which move to use in every turn)
     * if the opponent is a computer trainer, it will chose a random move from its
     * array of moves
     * when one pokemon of one trainer has fainted, that trainer will automatically
     * put its other (alive) pokemon into battle.
     * the battle will continue until one user has lost both of their pokemon
     * in which case the other trainer will win and the simulation will end
    */
    public void run()
    {
        // Start here!
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Pokemon Simulator!" + "\n");
        System.out.println("Set up first Pokemon Trainer: ");
        System.out.println("Trainer, what is your name?");
        String username = input.next();
        System.out.println("Hello " + username + "!" + "\n");
        PokemonTrainer t1 = new PokemonTrainer(username);
        
        System.out.println("Choose your first pokemon");
        System.out.println("Enter the name of your pokemon: ");
        String pokemonName = input.next();
        String pokemonImage = images.getPokemonImage(pokemonName);
        System.out.println("You chose: \n" + pokemonImage);
        Pokemon p = new Pokemon(pokemonName);
        t1.pokemons[0] = p;
        System.out.println(p);
        
        System.out.println("Would you like to teach " + pokemonName + " a new move?");
        String answer = input.next();
        for(int i = 0; i < 4; i++){
            while(answer.equals("yes")){
            System.out.println("Enter the name of the move: ");
            String move = input.next();
            System.out.println("How much damage does this move do? ");
            int dmg = input.nextInt();
            Move m = new Move (move, dmg);
            p.learnMove(m);
            System.out.println(pokemonName + " learned " + m + "!" + "\n");
            System.out.println("Would you like to teach " + pokemonName + " a new move?");
            answer = input.next();
            }
        }
        System.out.println(pokemonName + " has learned all of their moves" + "\n");
        
        
        System.out.println("Choose your second pokemon");
        System.out.println("Enter the name of your pokemon: ");
        String pokemonName1 = input.next();
        pokemonImage = images.getPokemonImage(pokemonName1);
        System.out.println("You chose: \n" + pokemonImage);
        Pokemon p1 = new Pokemon(pokemonName1);
        t1.pokemons[1] = p1;
        System.out.println(p1);
        
        System.out.println("Would you like to teach " + pokemonName1 + " a new move?");
        answer = input.next();
        for(int j = 0; j < 4; j++){
            while(answer.equals("yes")){
            System.out.println("Enter the name of the move: ");
            String move1 = input.next();
            System.out.println("How much damage does this move do? ");
            int dmg1 = input.nextInt();
            Move m1 = new Move (move1, dmg1);
            p1.learnMove(m1);
            System.out.println(pokemonName1 + " learned " + m1 + "!" + "\n");
            System.out.println("Would you like to teach " + pokemonName1 + " a new move?");
            answer = input.next();
            }
        }
        System.out.println(pokemonName + " has learned all of their moves" + "\n");
        
        
        // System.out.println("Set up second Pokemon Trainer: ");
        // System.out.println("Trainer, what is your name?");
        // String username1 = input.next();
        // System.out.println("Hello " + username1 + "!" + "\n");
        // PokemonTrainer t2 = new PokemonTrainer(username1);
        
        // System.out.println("Choose your first pokemon");
        // System.out.println("Enter the name of your pokemon: ");
        // String pokemonName2 = input.next();
        // pokemonImage = images.getPokemonImage(pokemonName2);
        // System.out.println("You chose: \n" + pokemonImage);
        // Pokemon p2 = new Pokemon(pokemonName2);
        // t2.pokemons[0] = p2;
        // System.out.println(p2);
        
        // System.out.println("Would you like to teach " + pokemonName2 + " a new move?");
        // answer = input.next();
        // for(int w = 0; w < 4; w++){
        //     while(answer.equals("yes")){
        //     System.out.println("Enter the name of the move: ");
        //     String move2 = input.next();
        //     System.out.println("How much damage does this move do? ");
        //     int dmg2 = input.nextInt();
        //     Move m2 = new Move (move2, dmg2);
        //     p2.learnMove(m2);
        //     System.out.println(pokemonName2 + " learned " + m2 + "!" + "\n");
        //     System.out.println("Would you like to teach " + pokemonName2 + " a new move?");
        //     answer = input.next();
        //     }
        // }
        // System.out.println(pokemonName2 + " has learned all of their moves" + "\n");
        
        
        // System.out.println("Choose your second pokemon");
        // System.out.println("Enter the name of your pokemon: ");
        // String pokemonName3 = input.next();
        // pokemonImage = images.getPokemonImage(pokemonName3);
        // System.out.println("You chose:" + "\n" + pokemonImage);
        // Pokemon p3 = new Pokemon(pokemonName3);
        // t2.pokemons[1] = p3;
        // System.out.println(p3);
        
        // System.out.println("Would you like to teach " + pokemonName3 + " a new move?");
        // answer = input.next();
        // for(int k = 0; k < 4; k++){
        //     while(answer.equals("yes")){
        //     System.out.println("Enter the name of the move: ");
        //     String move3 = input.next();
        //     System.out.println("How much damage does this move do? ");
        //     int dmg3 = input.nextInt();
        //     Move m3 = new Move (move3, dmg3);
        //     p3.learnMove(m3);
        //     System.out.println(pokemonName3 + " learned " + m3 + "!" + "\n");
        //     System.out.println("Would you like to teach " + pokemonName3 + " a new move?");
        //     answer = input.next();
        //     }
        // }
        //   System.out.println(pokemonName3 + " has learned all of their moves" + "\n");
        
      
        Pokemon t1P = null;
        String firstName = "";
        System.out.println("Everything is ready for battle!");
        System.out.println("Press q to enter battle \n");
        String enter = input.next();
        
        System.out.println(t1 + "'s turn:" + "\n" + "Choose the Pokemon you would like to use");
        System.out.println(p + ", " + p1);
        firstName = input.next();
        
        if(firstName.equals(p.getName())){
            t1P = p;
            pokemonImage = images.getPokemonImage(p.getName());
            System.out.println(t1 + " chose: "  + "\n" + pokemonImage);
            System.out.println("Available Moves: " + t1P.getMoves() + "\n");
        }
        else if(firstName.equals(p1.getName())){
            t1P = p1;
            pokemonImage = images.getPokemonImage(p1.getName());
            System.out.println(t1 + " chose: "  + "\n"+ pokemonImage);
            System.out.println("Available Moves: " + t1P.getMoves() + "\n");
        }
        
         ComputerTrainer ct1 = new ComputerTrainer("Computer");
        Pokemon t2P = ct1.pokemons[0];
        pokemonImage = images.getPokemonImage(t2P.getName());
        System.out.println(ct1 + " chose: "  + "\n"+ pokemonImage);
        System.out.println(t2P);
        System.out.println("Available Moves: " + t2P.getMoves() + "\n");
    
        // Pokemon t2P = null;
        // System.out.println(t2 + "'s turn:" + "\n" + "Choose the Pokemon you would like to use");
        // System.out.println(p2 + ", " + p3);
        // firstName = input.next();
        
        // if(firstName.equals(p2.getName())){
        //     t2P = p2;
        //     pokemonImage = images.getPokemonImage(p2.getName());
        //     System.out.println(t2 + " chose: "  + "\n" + pokemonImage);
        //     System.out.println("Available Moves: " + t2P.getMoves()  + "\n");
        // }
        // else if(firstName.equals(p3.getName())){
        //     t2P = p3;
        //     pokemonImage = images.getPokemonImage(p3.getName());
        //     System.out.println(t2 + " chose: "  + "\n" + pokemonImage);
        //     System.out.println("Available Moves: " + t2P.getMoves() + "\n");
        // }
    
        int moveIndex = 0;
        Move t1move = null;
        //Move t2move = null;
        String trainerMove = "";
        
        while(t1P != null && t2P != null){
    
        //trainer 1 turn
        System.out.println(t1 + ", Choose your move" + "\n");
        System.out.println("Available Moves: " + t1P.getMoves());
        trainerMove = input.next();
        
            for(moveIndex = 0; moveIndex < t1P.moves.length; moveIndex++){
             if(trainerMove.equals(t1P.moves[moveIndex].getName())){
                t1move = t1P.moves[moveIndex];
                t1P.attack(t2P, t1move);
                pokemonImage = images.getPokemonImage(t1P.getName());
                System.out.println(pokemonImage);
                System.out.println(t1 + "'s " + t1P+ " used " + t1move.getName() + " on " + t2P + "\n");
                break;
            }
        }
        
        
        if(t2P.hasFainted()){
            System.out.println(t2P + " has fainted");
            t2P = ct1.getNextPokemon();
            
            if(t2P == null){
                System.out.println(ct1 + " has no Pokemon left! " + t1 + " is the winner!");
                break;
            }
            else{
                System.out.println(ct1 + " is now using " + t2P.getName());
            }
        }
        
        
        //trainer 2 turn 
        // System.out.println(t2 + ", Choose your move");
        // System.out.println("Available Moves: " + t2P.getMoves());
        // trainerMove = input.next();
        // for(moveIndex = 0; moveIndex < t2P.moves.length; moveIndex++){
        //      if(trainerMove.equals(t2P.moves[moveIndex].getName())){
        //         t2move = t2P.moves[moveIndex];
        //         t2P.attack(t1P, t2move);
        //         System.out.println(t2 + "'s " + t2P + " used " + t2move.getName() + " on " + t1P + "\n");
        //         break;
        //         }
        //     }
        
        Move ct1Move = ct1.chooseRandomMove();
        if(ct1Move != null){
          // System.out.println(t1P + "before we run t2P.attack()");
            t2P.attack(t1P, ct1Move);
            // System.out.println(t1P + "after we run t2P.attack()");
             pokemonImage = images.getPokemonImage(t2P.getName());
            System.out.println(pokemonImage);
            System.out.println("Computer's " + t2P + " used " + ct1Move.getName() + " on " + t1P);
           
        }
            
             if(t1P.hasFainted()){
            System.out.println(t1P + " has fainted");
            
            t1P = t1.getNextPokemon();
            
            if(t1P == null){
                System.out.println(t1 + " has no Pokemon left! " + ct1 + " is the winner!");
                break;
            }
            else{
                System.out.println(t1 + " is now using " + t1P.getName());
                }
            
            }
            
        }
        
        
    }
    
    /**
     * Acts as code-hs's hidden main method.
     * @param args (args) - 
     */
    public static void main(String[] args) {
        PokemonSimulation simulator = new PokemonSimulation();
        simulator.run();
    }
}
