/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @modifier Samandeep Singh
 */
public class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    enum cardSuits{
        CLUBS, HEARTS, DIAMONDS, SPADES;
    }
    
    enum cardValues{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
    protected cardSuits currentSuit;
    protected cardValues currentValue;
    
    public Card(cardValues cv, cardSuits cs){
        this.currentValue = cv;
        this.currentSuit = cs;
    }

    public String toString(){
       return (this.getCurrentValue()+ " of " + this.getCurrentSuit());
    }
        @Override
    public boolean equals(Object o) { 
   
        if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Card)) { 
            return false; 
        }  
        Card c = (Card) o;  
        return this.currentSuit == c.currentSuit && this.currentValue == c.currentValue;
    }

    /**
     * @return the currentSuit
     */
    public cardSuits getCurrentSuit() {
        return currentSuit;
    }

    /**
     * @param currentSuit the currentSuit to set
     */
    public void setCurrentSuit(cardSuits currentSuit) {
        this.currentSuit = currentSuit;
    }

    /**
     * @return the currentValue
     */
    public cardValues getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(cardValues currentValue) {
        this.currentValue = currentValue;
    }
    
}
