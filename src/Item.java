/**
 * ---------------------------------------------------------------------------
 * File name: Item.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;

/**
 * Class that creates items, extends SDEnitiy
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Item extends SDEntity
{
    private double weight;
    private ArrayList<Effect> effects;
    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     * @param name
     * @param weight
     * @param description
     */
    public Item(String name, double weight, String description)
    {
        super(name, description);
        this.weight = weight;
        effects = new ArrayList<>();
    }// end Item 

    /**
     * gets the weight         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return weight
     */
    public double getWeight()
    {
        return weight;
    }// end getWeight

    /**
     * set the weight         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param weight
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }// end setWeight

    /**
     * adds a effect to an item         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param effect
     */
    public void addEffect(Effect effect)
    {
        effects.add(effect);
    }// end addEffect

    /**
     * array list that holds the different type of effects that an item may have and gets them         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return effects
     */
    public ArrayList<Effect> getEffects()
    {
        return effects;
    }// end getEffects

    /**
     * adds effects that are from an enum list and how many         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param type
     * @param value
     */
    public void addEffect(EffectType type, int value)
    {
        Effect effect = new Effect(type, value);
        effects.add(effect);
    }// end addEffect
}// end Item
