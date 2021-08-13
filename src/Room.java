/**
 * ---------------------------------------------------------------------------
 * File name: Room.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;


/**
 * creates what is in the room
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Room extends SDEntity
{
    protected ArrayList<String> exits;
    protected ArrayList<Combatant> enemies;
    protected boolean areaIsLethal;
    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     * @param name
     * @param description
     */
    public Room(String name, String description)
    {
        super(name, description);
        exits = new ArrayList<>();
        enemies = new ArrayList<>();
        areaIsLethal = false;
    }// end Room 

    /**
     * checks to see it the area it lethal          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return areaIsLethal
     */
    public boolean isAreaIsLethal()
    {
        return areaIsLethal;
    }// end isAreaIsLethal

    /**
     * sets the boolean value for the room if it is or not lethal         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param areaIsLethal
     */
    public void setAreaIsLethal(boolean areaIsLethal)
    {
        this.areaIsLethal = areaIsLethal;
    }// end setAreaIsLethal

    /**
     * add(s) the exit(s) to the room         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param exit
     */
    public void addExit(String exit)
    {
        exits.add(exit);
    }// end addExit

    /**
     * adds a (possible) enemy combatant to the room       
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param enemy
     */
    public void addCombatant(Combatant enemy)
    {
        enemies.add(enemy);
    }// end addCombatant

    /**
     * gets the exits for the room and puts them into a string array           
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return exits.toArray(temp)
     */
    public String[] getExits()
    {
        String[] temp = new String[exits.size()];
        return exits.toArray(temp);
    }// end getExits

    /**
     * gets enenies and returns them in an array list        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return enemies
     */
    public ArrayList<Combatant> getEnemies()
    {
        return enemies;
    }// end getEnemies

    /**
     * gets the combatant enemy info that you will be fighting          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     * @return null/c
     */
    public Combatant getEnemy(String name)
    {
        for(Combatant c:enemies)
        {
            if (c.getName().equals(name)) return c;
        }// end for
        return null;
    }// end getEnemy

    /**
     * removes the enemy after it as been defeated from the array list         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param enemy
     */
    public void removeEnemy(Combatant enemy)
    {
        enemies.remove(enemy);
    }// end removeEnemy

    /**
     * Format object of type Room as a String for
	 * possible display by another class
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * <hr>
     * @return fullDescription
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String fullDescription = "";
        fullDescription += "Room:\n";
        fullDescription += description + "\n\n";
        fullDescription += "Exits:\n";
        for(String s:exits)
        {
            fullDescription += s + "\n";
        }// end for
        fullDescription += "\nItems:\n";
        fullDescription += inventory.toString();
        fullDescription += "Enemies:\n";
        for(Combatant c:enemies)
        {
            fullDescription += c.getName() + ": " +c.getDescription() + "\n";
        }// end for
        return fullDescription;
    }// end toString
}// end Room
