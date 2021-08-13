/**
 * ---------------------------------------------------------------------------
 * File name: Combatant.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * Class that deals with combat
 *
 * <hr>
 * Date created: Sep 18, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Combatant extends SDEntity
{
	// protected int value holders for the health, combatBonus, defense
    protected int health; 
    protected int combatBonus;
    protected int defense;

    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 18, 2019 
     *
     * 
     * @param name
     * @param description
     */
    public Combatant(String name, String description)
    {
        super(name, description);
        health = 10;
        combatBonus = 10;
        defense = 15;
    }// end Combatant

    /**
     * Gets Health         
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @return health
     */
    public int getHealth()
    {
        return health;
    }// end getHealth

    /**
     * Sets Health         
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param health
     */
    public void setHealth(int health)
    {
        this.health = health;
    }// end setHealth

    /**
     * Gets Combat Bonus          
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @return combatBonus
     */
    public int getCombatBonus()
    {
        return combatBonus;
    }// end getComboBonus

    /**
     * Sets Combat Bonus        
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param combatBonus
     */
    public void setCombatBonus(int combatBonus)
    {
        this.combatBonus = combatBonus;
    }// end setCombatBonus

    /**
     *  Gets Defense       
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @return defense
     */
    public int getDefense()
    {
        return defense;
    }// end getDefense

    /**
     * Sets Defense          
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param defense
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }// end setDefense

    /**
     * Changes health by adding a set "amount"
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param amount
     */
    public void changeHealth(int amount)
    {
        health += amount;
    }// end changeHealth

    /**
     * Changes combat bonuses by adding a set "amount"        
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param amount
     */
    public void changeCombatBonus(int amount)
    {
        combatBonus += amount;
    }// end changeCombatBonus

    /**
     * Changes defense by adding a set "amount"         
     *
     * <hr>
     * Date created: Sep 18, 2019
     *
     * <hr>
     * @param amount
     */
    public void changeDefense(int amount)
    {
        defense += amount;
    }// end changeDefense

    /**
	 * Format object of type Combatant as a String for
	 * possible display by another class
	 *
	 * Date created: Sep 18, 2019
	 * 
	 * @return the formatted string
	 * @see java.lang.Object#toString()
	 */
	@Override
    public String toString()
    {
        return name + " " + description + " " + health + "," + combatBonus + "," + defense;
    }// end toString
}// end Combatant
