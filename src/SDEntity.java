/**
 * ---------------------------------------------------------------------------
 * File name: SDEntity.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;

/**
 * lets you pick up, use, or lose item
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class SDEntity
{
    protected String name;
    protected String description;
    protected Inventory inventory;

    
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
    public SDEntity(String name, String description)
    {
        this.name = name;
        this.description = description;
        inventory = new Inventory();
    }// end SDEnitiy

    /**
     * gets name       
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return name
     */
    public String getName()
    {
        return name;
    }// end getName

    /**
     * set name         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }// end setName

    /**
     * gets description         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return description
     */
    public String getDescription()
    {
        return description;
    }// end getDescripion

    /**
     * sets description         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }// end setDescription

    /**
     * gets ArrayList for inventory         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return inventory.getInbentory
     */
    public ArrayList<Item> getInventory()
    {
        return inventory.getInventory();
    }// end getInbentory

    /**
     * ads an item to you inventory          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param item
     */
    public void gainItem(Item item)
    {
        inventory.addItem(item);
    }// end gainItem

    /**
     * lose item (assuming because it broke because of use or to open up more room in the inventory)
     * 
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     * @return temp
     */
    public Item loseItem(String name)
    {
        Item temp = inventory.getItem(name);
        if(temp != null)
        {
            inventory.removeItem(temp);
            return temp;
        }// end if
        return temp;
    }// end loseItem

    /**
     * prints what you have within you inventory          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return inventory.toString()
     */
    public String listInventory()
    {
        return inventory.toString();
    }// end listInventory
}// end SDEntity
