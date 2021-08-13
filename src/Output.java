/**
 * ---------------------------------------------------------------------------
 * File name: Output.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * different types of output depending on what/how it needs to be displayed
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Output
{
    private static SquirrelDeathLocale locale = new SquirrelDeathLocale();

    /**
     * prints on a line with out going to a new line         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param prompt
     */
    public static void print(String prompt)
    {
        System.out.println(locale.prompt(prompt));
    }// end print
    
    /**
     * prints on a new line       
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param prompt
     */
    public static void println(String prompt)
    {
        System.out.println(locale.prompt(prompt) + "\n");
    }// end println
    
    /**
     * prints the string literal        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param literal
     */
    public static void printLiteral(String literal)
    {
        System.out.println(literal);
    }// end printLiteral    
    
    /**
     * gets the string       
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param prompt
     * @return locale.prompt(prompt)
     */
    public static String getString(String prompt)
    {
        return locale.prompt(prompt);
    }// end getString
}// end Output
