/**
 * ---------------------------------------------------------------------------
 * File name: DieRoller.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.Random;

/**
 * Creates a class that creates a random die roller
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class DieRoller
{
    private static Random rand = new Random();

    /**
     * Take in a parameter for how many sides it has and returns a random number from the possibilities 
     * that it can have        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param dieSides
     * @return rand.nextInt(dieSides) + 1
     */
    public static int roll(int dieSides)
    {
        return rand.nextInt(dieSides) + 1;
    }// end roll
}// end DieRoller
