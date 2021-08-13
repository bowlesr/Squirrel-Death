/**
 * ---------------------------------------------------------------------------
 * File name: GameLoop.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * loops the game until the player wins or loses
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class GameLoop
{
    private SetupMap mapMaker;
    private Map map;

    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     */
    public GameLoop()
    {
        mapMaker = new SetupMap();
        map = mapMaker.getMap();
    }// end GameLoop

    /**
     * runs the game and sets all initial values, gets and sets the player name      
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     */
    public void runGame()
    {
    		// gets and sets player name
        Output.println("NAME_PROMPT");	
        String name = Input.getLine();
        
        	// prints the description of where the squirrel is 
        Output.println("DESCRIPTION_PROMPT");
        String description = Input.getLine();
        Combatant player = new Combatant(name, description);
        player.changeHealth(10);
        Output.printLiteral("You are " + player.toString());
        boolean gameOver = false;
        Room room = map.getRoom(Output.getString("LIBRARY"));
        
        // while loop to keep the game going until player quits or wins the game
        while(!gameOver)
        {
            Output.println("PRESS_A_KEY");
            Input.getLine();
            Output.printLiteral(room.toString());
            
            	// checks the users input for the command and follows through accordingly 
            String[] playerCommand = CommandParser.parseCommand(room);
            Output.printLiteral(playerCommand[0] + " " + playerCommand[1]);
            
            	// this one is for the different directions you can go
            if(playerCommand[0].equals(Output.getString("GO")))
            {
                room = map.getRoom(playerCommand[1]);
            }// end if
            
            	// this on is for the get command
            if(playerCommand[0].equals(Output.getString("GET")))
            {
                Item temp = room.loseItem(playerCommand[1]);
                for(Effect e:temp.getEffects())
                {
                    switch (e.getType())
                    {
                        case HIT_POINT:
                            player.changeHealth(e.getValue());
                            break;
                        case ATTACK_BONUS:
                            player.changeCombatBonus(e.getValue());
                            break;
                        case DEFENSE:
                            player.changeDefense(e.getValue());
                            break;
                        default:

                    }// end switch 
                }// end for
            }// end if
            
            	// this one is for the attack command
            if(playerCommand[0].equals(Output.getString("ATTACK")))
            {
                Combatant enemy = room.getEnemy(playerCommand[1]);
                CombatRound round = new CombatRound(player, enemy);
                Combatant loser = round.fight();
                if(loser != null)
                {
                    if(loser == player) // if player loses = game over
                    {
                        gameOver = true;
                        Output.println("PLAYER_DEAD");
                    }// end if 
                    else	// if squirrel is dead = player continues 
                    {
                        Output.println("ENEMY_DEAD");
                        Output.println("DEAD_SQUIRREL");
                        room.removeEnemy(enemy);
                    }// end else
                }// end if
            }// end if
        }// end while
    }// end runGame
}// end GameLoop
