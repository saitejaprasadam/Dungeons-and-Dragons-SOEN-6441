package game.model.character.classes;

import java.util.ArrayList;

import game.interfaces.DiceImplementationInterface;


/**
 * Custom data structure for storing character classes
 * 
 * @author Supreet Singh (s_supree)
 * @since 1.0.0
 */
public class CharacterClassStructure implements DiceImplementationInterface
{
    private int numberOfRolls;
    private int diceSides;
    private ArrayList<String> types;

    /**
     * set number of dice rolls
     * 
     * @param nOfRolls set number of dice rolls
     */
    public void setNumberOfRolls(int nOfRolls)
    {
        this.numberOfRolls = nOfRolls;
    }

    /**
     * set number of dice sides
     * 
     * @param sideDices set dice sides
     */
    public void setDiceSides(int sideDices)
    {
        this.diceSides = sideDices;
    }
    
    /**
     * set allowed character types
     *  
     * @param types
     */
    public void setTypes(ArrayList<String> types){
        this.types = types;
    }
    
    /**
     * get allowed character types
     * 
     * @return allowed character types
     */
    public ArrayList<String> getTypes(){
        return this.types;
    }

    /**
     * @return number of dice rolls
     */
    public int getNumberOfRolls()
    {
        return this.numberOfRolls;
    }

    /**
     * @return number of dice sides
     */
    public int getDiceSides()
    {
        return this.diceSides;
    }
}