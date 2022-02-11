/**
 * SYST 17796 Project Winter 2022 Base code.
 * TeamMembers: RajPatel, DakshilChaudhary and HarleenKaur
 * Date: February 10, 2022
 */
package ca.sheridancollege.project;


public abstract class Card 
{   
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
