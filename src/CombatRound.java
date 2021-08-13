/**
 * ---------------------------------------------------------------------------
 * File name: CombatRound.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */

/**
 * Class for the combat between the player and the squirrel
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class CombatRound
{
    Combatant player;
    Combatant enemy;

    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     * @param player
     * @param enemy
     */
    public CombatRound(Combatant player, Combatant enemy)
    {
        this.player = player;
        this.enemy = enemy;
    }// end CombatRound

    /**
     * Chooses who gets to attack first         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return null
     */
    public Combatant fight()
    {
        if(DieRoller.roll(2) > 1)
        {
            attack(player, enemy);
            if(enemy.getHealth() <= 0) return enemy;
            attack(enemy, player);
            if(player.getHealth() <= 0) return player;
        }// end if
        else
        {
            attack(enemy, player);
            if(player.getHealth() <= 0) return player;
            attack(player, enemy);
            if(enemy.getHealth() <= 0) return enemy;
        }// end else
        return null;
    }// end fight

    /**
     * Hit or miss method          
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param one
     * @param two
     */
    private void attack(Combatant one, Combatant two)
    {
        if(DieRoller.roll(10) + one.getCombatBonus() > two.getDefense())
        {
            int damage = DieRoller.roll(10);
            Output.printLiteral(one.getName() + " " + Output.getString("ATTACK_HIT") + " " + damage);
            two.changeHealth(-damage);
        }// end if
        else
        {
            Output.printLiteral(one.getName() + " " + Output.getString("ATTACK_MISS"));
        }// end else
    }// end attack
}// end CombatRound
