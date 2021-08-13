/**
 * ---------------------------------------------------------------------------
 * File name: SetupMap.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 25, 2019
 * ---------------------------------------------------------------------------
 */



/**
 * Class that sets up a Map to navigate the game
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class SetupMap
{
    private Map map;

    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     */
    public SetupMap()
    {
        map = new Map();
        createRooms();
    }// end SetupMap

    /**
     * get the map        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @return map
     */
    public Map getMap()
    {
        return map;
    }// end getMap

    /**
     * creates the rooms that will be on the map, sets various things the go with each room/place         
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     */
    private void createRooms()
    {
    		// creates a library and adds it to the map, changes effects, has items and adds exits
        Room library = new Room(Output.getString("LIBRARY"), Output.getString("LIBRARY_DESCRIPTION"));
        library.addExit(Output.getString("FOUNTAIN"));
        Item tempItem = new Item(Output.getString("BOOK"), 1.0,Output.getString("SQ_BOOK_TITLE"));
        tempItem.addEffect(EffectType.ATTACK_BONUS, 1);
        library.gainItem(tempItem);
        map.addRoom(library);

        	// creates a fountain and adds it to the map, changes effects, has items, possible combatant and adds exits
        Room fountain = new Room(Output.getString("FOUNTAIN"), Output.getString("FOUNTAIN_DESCRIPTION"));
        fountain.addExit(Output.getString("LIBRARY"));
        fountain.addExit(Output.getString("CULP"));
        fountain.addExit(Output.getString("LOT"));
        tempItem = new Item(Output.getString("STICK"), 0.5, Output.getString("STICK_DESCRIPTION"));
        tempItem.addEffect(EffectType.ATTACK_BONUS, 2);
        fountain.gainItem(tempItem);
        tempItem = new Item(Output.getString("WAFFLE"), 0.1, Output.getString("WAFFLE_DESCRIPTION"));
        tempItem.addEffect(EffectType.HIT_POINT, -1);
        fountain.gainItem(tempItem);
        Combatant tempCombatant = new Combatant(Output.getString("CHITTERS"), Output.getString("CHITTERS_DESCRIPTION") );
        fountain.addCombatant(tempCombatant);
        map.addRoom(fountain);

        	// creates a culp and adds it to the map, changes effects, has items, possible combatant and adds exits
        Room culp = new Room(Output.getString("CULP"), Output.getString("CULP_DESCRIPTION"));
        culp.addExit(Output.getString("FOUNTAIN"));
        culp.addExit(Output.getString("LOT"));
        tempItem = new Item(Output.getString("HAMMER"), 2.0, Output.getString("HAMMER_DESCRIPTION"));
        tempItem.addEffect(EffectType.ATTACK_BONUS, 3);
        culp.gainItem(tempItem);
        map.addRoom(culp);
        
        	// creates a parkingLot and adds it to the map, changes effects, has items, possible combatant and adds exits
        Room parkingLot = new Room(Output.getString("LOT"), Output.getString("LOT_DESCRIPTION"));
        parkingLot.addExit(Output.getString("CULP"));
        parkingLot.addExit(Output.getString("FOUNTAIN"));
        parkingLot.addExit(Output.getString("NICKS"));
        tempCombatant = new Combatant(Output.getString("FLUFFY"), Output.getString("FLUFFY_DESCRIPTION"));
        parkingLot.addCombatant(tempCombatant);
        tempCombatant = new Combatant(Output.getString("RICKY"), "RICKY_DESCRIPTION");
        parkingLot.addCombatant(tempCombatant);
        map.addRoom(parkingLot);

        	// creates a nicks and adds it to the map, and adds exits
        Room nicks = new Room(Output.getString("NICKS"), Output.getString("NICKS_DESCRIPTION"));
        nicks.addExit(Output.getString("LOT"));
        nicks.addExit(Output.getString("QUAD"));
        map.addRoom(nicks);

        	// creates a quad and adds it to the map, and adds exits
        Room quad = new Room(Output.getString("QUAD"), "QUAD_DESCRIPTION");
        quad.addExit(Output.getString("NICKS"));
        quad.addExit(Output.getString("STREET"));
        map.addRoom(quad);

        	// creates a street and adds it to the map, and adds exits
        Room street = new Room(Output.getString("STREET"), Output.getString("STREET_DESCRIPTION"));
        street.addExit(Output.getString("QUAD"));
        street.addExit(Output.getString("BRIDGE"));
        street.addExit(Output.getString("HIGHWAY"));
        map.addRoom(street);

        	// creates a stateOfFranklinStreet and adds it to the map, and kills you if you go in it
        Room stateOfFranklinStreet = new Room(Output.getString("HIGHWAY"), Output.getString("HIGHWAY_DESCRIPTION"));
        stateOfFranklinStreet.setAreaIsLethal(true);
        map.addRoom(stateOfFranklinStreet);

        	// creates a pedestrianBridge and adds it to the map, and adds exits
        Room pedestrianBridge = new Room(Output.getString("BRIDGE"), Output.getString("BRIDGE_DESCRIPTION"));
        pedestrianBridge.addExit(Output.getString("MC"));
        pedestrianBridge.addExit(Output.getString("STREET"));
        map.addRoom(pedestrianBridge);

        	// creates a millenniumCenter and adds it to the map, and adds exits
        Room millenniumCenter = new Room(Output.getString("MC"), Output.getString("MC_DESCRIPTION"));
        millenniumCenter.addExit(Output.getString("BRIDGE"));
        map.addRoom(millenniumCenter);
    }// end createRooms
}//end SetupMap
