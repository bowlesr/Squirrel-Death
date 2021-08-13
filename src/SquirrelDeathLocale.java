/**
 * ---------------------------------------------------------------------------
 * File name: SquirrelDeathLocale.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * sets the language for the game
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class SquirrelDeathLocale
{
    private static ResourceBundle messages;
    private static Locale aLocale;    
    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     */
    public SquirrelDeathLocale()
    {
        aLocale = new Locale("en","US");
    }// end SquirrelDeathLocale    
    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     * @param language
     */
    public SquirrelDeathLocale(String language)
    {
        if(language.equals("French")) aLocale = new Locale("fr","FR");
        else if(language.equals("Spanish")) aLocale = new Locale("es", "MX");
        else aLocale = new Locale("en","US");
    }// end SquirrelDeathLocale    
    
    /**
     * returns the language        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param prompt
     * @return messages.getString(prompt)
     */
    public String prompt(String prompt) 
    {
        messages = ResourceBundle.getBundle("MessageBundle", aLocale);
        return messages.getString(prompt);
    }// end prompt
}// end SqurrilDeathLocale
