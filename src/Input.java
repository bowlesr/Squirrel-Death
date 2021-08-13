/**
 * ---------------------------------------------------------------------------
 * File name: Input.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * reads the input from the user
 *
 * <hr>
 * Date created: Sep 18, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Input
{
    private static Scanner kb = new Scanner(System.in);

    /**
     * gets the next line/reads next line of input         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return kb.nextLine()
     */
    public static String getLine()
    {
        return kb.nextLine();
    }// end getLine

    /**
     * checks the users input for valid input          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param values
     * @return temp
     */
    public static String getAllowedValue(String values[])
    {
        String temp = "";
        boolean correctInput = false;
        
        	// while loop to check for valid input. Throws an error if the input is not valid
        while(!correctInput)
        {
            temp = kb.nextLine();
            for(String s:values)
            {
                if(temp.toLowerCase().equals(s)) correctInput = true;
            }// end for
            if(!correctInput) Output.println("INPUT_ERROR");
        }// end while
        return temp;
    }// end getAllowedValue

    /**
     * breaks the string into parts		(this one I'm honestly not sure what it does, will ask in class)          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return kb.nextLine().split(" ")
     */
    public static String[] getTokens()
    {
        return kb.nextLine().split(" ");
    }// end getTokens
}// end Input
