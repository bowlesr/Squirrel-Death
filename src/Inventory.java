/**
 * ---------------------------------------------------------------------------
 * File name: Inventory.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;

/**
 * creates a place holder for items in a inventory array list
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Inventory
{
    private ArrayList<Item> items;
    private double weight;
    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     */
    public Inventory()
    {
        items = new ArrayList<>();
        weight = 0.0;
    }// end Inventory

    /**
     * adds item to the array list updates the total weight         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param item
     */
    public void addItem(Item item)
    {
        items.add(item);
        updateWeight();
    }// end addItem

    /**
     * adds the items information for its description         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     * @param weight
     * @param description
     */
    public void addItem(String name, double weight, String description)
    {
        Item item = new Item(name, weight, description);
        items.add(item);
        updateWeight();
    }// end addItem

    /**
     * get the list of inventory items          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return items
     */
    public ArrayList<Item> getInventory()
    {
        return items;
    }// end getInventory

    /**
     * gets a specific item by name         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     * @return null/i
     */
    public Item getItem(String name)
    {
        for(Item i:items)
        {
            if(i.getName().equals(name))
            {
                return i;
            }// end if 
        }// end for
        return null;
    }// end getItem

    /**
     * gets an item a specific number        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param index
     * @return null/items.get(index)
     */
    public Item getItem(int index)
    {
        if(index < items.size())
        {
            return items.get(index);
        }// end if
        return null;
    }// end getItem

    /**
     * removes item form the list and updates weight      
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param item
     */
    public void removeItem(Item item)
    {
        items.remove(item);
        updateWeight();
    }// end romoveItem

    /**
     * removes an item from the list by index number, updates weight        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param index
     */
    public void removeItem(int index)
    {
        items.remove(index);
        updateWeight();
    }// end removeItem

    /**
     * boolean check to make sure your not carrying to much weight        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param weightAllowance
     * @return true/false for weight
     */
    public boolean encumbered(double weightAllowance)
    {
        if(weight > weightAllowance) return true;
        return false;
    }// end encumbered

    /**
     * Format object of type Inventory as a String for
	 * possible display by another class
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * <hr>
     * @return temp - list of items in inventory
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String temp = "";
        for(Item i:items)
        {
            temp += i.name + " - " + i.description + "\n" + "\n";
        }// end for
        return temp;
    }// end toString
    
    /**
     * calculates the total weight for all inventory items         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     */
    private void updateWeight()
    {
        double accumulator = 0.0;
        for (Item i : items)
        {
            accumulator += i.getWeight();
        }// end for
        weight = accumulator;
    }// end updateWeight
}// end Inventory 
