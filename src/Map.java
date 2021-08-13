/**
 * ---------------------------------------------------------------------------
 * File name: Map.java
 * Project name: Squirrel Death
 * ---------------------------------------------------------------------------
 * Creator's name and email: Rodney Bowles, bowlesr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 18, 2019
 * ---------------------------------------------------------------------------
 */

import java.util.HashMap;

/**
 * Creates a place to hold the actual rooms for the map and creates the map itself
 *
 * <hr>
 * Date created: Sep 25, 2019
 * <hr>
 * @author Rodney Bowles
 */
public class Map
{
    private HashMap<String, Room> map;

    
    /**
     * Constructor        
     *
     * <hr>
     * Date created: Sep 25, 2019 
     *
     * 
     */
    public Map()
    {
        map = new HashMap<>();
    }// end Map

    /**
     * adds/puts a room to/on the map      
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param room
     */
    public void addRoom(Room room)
    {
        map.put(room.getName(), room);
    }// end addRoom 

    /**
     * gets the room information to be used with said room        
     *
     * <hr>
     * Date created: Sep 25, 2019
     *
     * <hr>
     * @param name
     * @return map.get(name) - name of the room 
     */
    public Room getRoom(String name)
    {
        return map.get(name);
    }// end getRoom
}// end Map
