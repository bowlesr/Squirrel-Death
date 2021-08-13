/**
 * ---------------------------------------------------------------------------
 * File name: Effect.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * Class that has the effect type and value
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Effect
{
    private EffectType type;
    private int value;

    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     * @param type
     * @param value
     */
    public Effect(EffectType type, int value)
    {
        this.type = type;
        this.value = value;
    }//end Effect

    /**
     * gets the type         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return type
     */
    public EffectType getType()
    {
        return type;
    }// end getType

    /**
     * sets the type        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param type
     */
    public void setType(EffectType type)
    {
        this.type = type;
    }// end setType

    /**
     * gets the value     
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return value
     */
    public int getValue()
    {
        return value;
    }// end getValue

    /**
     * sets the value         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param value
     */
    public void setValue(int value)
    {
        this.value = value;
    }// end setValue
}// end Effect
