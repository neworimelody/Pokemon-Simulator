# Pokemon-Simulator
Simulates a Pokemon battle utilizing ASCII art and user inputs. The players take turns playing moves and the game wins once someone's Pokemons die.

#
### Pokemon: allows the user to create a pokemon 

#
### PokemonTrainer: allows the user to create a PokemonTrainer object
#
### ComputerTrainer: subclass of PokemonTrainer that allows the user to create a trainer that randomly generates moves and pokemon
#
### Move: allows the user to create move for their pokemon
#
### PokemonSimulation: 
# Runs the simulator by allowing a user to set up their trainer account through inputting a username (through a scanner) and chosing various pokemon the user will set up one pokemon at a time and it will then get added to the unique array of pokemon that belongs to the trainer. Then the user can teach the pokemon moves. The trainer can teach a total of 4 moves (length of the moves array) but can stop at any time by inputting "no" when asked if you wish to teach your pokemon more moves. the trainer can input a unique name and damage for each move. this process for learning moves and chosing pokemon will happen twice for each player(once per pokemon) once the trainer is set up, they will be asked to chose a pokemon to put into battle. once they chose, the computer/opponent will also chose if the opponent is a computer trainer, they will chose a random pokemon with a random set of moves from their array of pokemon the two trainers will then take turns attacking each other using their own array of moves. (they will chose which move to use in every turn) if the opponent is a computer trainer, it will chose a random move from its array of moves when one pokemon of one trainer has fainted, that trainer will automatically put its other (alive) pokemon into battle. the battle will continue until one user has lost both of their pokemon in which case the other trainer will win and the simulation will end
