/**
 * ---------------------------------------------------------------------------
 * File name: SquirrelDeath.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * Lets you choose to start a new game or to continue from a saved point(not yet implemented yet)
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class SquirrelDeath
{
    /**
     * Welcome message and asks if you want to start a new game or continue and then will then 
     * start the game       
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param args
     */
    public static void main(String args[])
    {
        Output.println("WELCOME");
        Output.println("SQUIRREL");
        String response = Input.getAllowedValue(new String[] {Output.getString("NEW"), Output.getString("CONTINUE")});
        
        	// starts the game
        GameLoop game = new GameLoop();
        game.runGame();
    }// end main
}// end SquirrelDeath
