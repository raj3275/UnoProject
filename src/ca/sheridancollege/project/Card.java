/**
 * SYST 17796 Project Winter 2019 Base code.
 * Team Members: Raj Patel, Dakshil Chaudhary and Harleen Kaur
 * Date: February 10, 2022
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    public enum Color { RED,BLUE,GREEN,YELLOW };
    public enum Value {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,DRAWTWO,DRAWFOUR,SKIP,REVERSE,WILDCARD};
    private Color color; // user defined data type
    private Value value;

    public Card(Color s,Value v)
    {
        color =s;
        value = v;
    }
    public Color getColor() {
        return color;
    }

    /**
     * @param suit the suit to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
    
    @Override
    public abstract String toString();
    
}
