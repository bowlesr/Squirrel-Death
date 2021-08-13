/**
 * ---------------------------------------------------------------------------
 * File name: CommandParser.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * Class that takes in the commands and validates them
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class CommandParser
{
    private static String[] firstWordAllowed = {Output.getString("GO"), Output.getString("ATTACK"), Output.getString("GET")};    
    
    /**
     * array of string that hold the allowable commands that can be used in the game       
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param room
     * @return returnString
     */
    public static String[] parseCommand(Room room)
    {

        boolean correct = false;
        String[] command = Input.getTokens();
        while(!correct)
        {

            for(String s:firstWordAllowed)
            {
                if(s.equals(command[0])) correct = true;
            }// end for
            if(!correct)
            {
                Output.println("INPUT_ERROR");
                command = Input.getTokens();
            }// end if 

        }// end while
        if(command.length < 2)
        {
            Output.printLiteral(command[0] + " " + Output.getString("WHAT"));
        }// end if
        else
        {
            return secondWord(command, room);
        }// end else
        String[] returnString = {"bad", "command"};
        return returnString;
    }// end parseCommand    
    
    /**
     * array of string that hold the second allowable word that can be used in the game    
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param command
     * @param room
     * @return returnString
     */
    private static String[] secondWord(String[] command, Room room)
    {
        if(command[0].equals(Output.getString("GO")))
        {
            for(String s:room.getExits())
            {
                if(s.equals(command[1])) return command;
            }// end for
        }// end if

        if(command[0].equals(Output.getString("ATTACK")))
        {
            for(Combatant c:room.getEnemies())
            {
                if(c.getName().equals(command[1])) return command;
            }// end for
        }// end if

        if(command[0].equals(Output.getString("GET")))
        {
            for(Item i:room.inventory.getInventory())
            {
                if(i.name.equals(command[1])) return command;
            }// end if
        }// end for
        Output.printLiteral("I can't " + command[0] + " a " + command[1]);
        String[] returnString = {"bad", "command"};
        return returnString;
    }// end seconWord
}// end CommandParser
