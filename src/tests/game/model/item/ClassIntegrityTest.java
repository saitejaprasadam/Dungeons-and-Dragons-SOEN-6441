package tests.game.model.item;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import game.model.Item;

/**
 * This is used to test various methods used in Item class
 * 
 * @author Priyanka A
 * @version 1.0
 * @since 2/28/2017
 *
 */

public class ClassIntegrityTest
{
    public String name1, name2;
    public String type1, type2;
    public int level;
    public String classtype1, classtype2;
    Item obj1;
    Item obj2;

    @Before
    public void beforeEachTest()
    {
        name1 = "Dagger";
        name2 = "MyArmor";
        type1 = "Weapon";
        type2 = "Armor";
        level = 1;
        classtype1 = "Melee";
        classtype2 = "Heavy";
        obj1 = new Item(name1, type1, classtype1, level);
        obj2 = new Item(name2, type2, classtype2, level);
    }

    @Test
    public void testMethods()
    {
        assertEquals(name1, obj1.getItemName());
        assertEquals(type1, obj1.getItemType());
        int modifier = (int) Math.ceil((double) level / (double) 4);
        assertEquals(modifier, obj2.getModifier());
    }

}
