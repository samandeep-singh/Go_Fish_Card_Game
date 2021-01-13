/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * @modifier Samandeep Singh April 15th, 2019
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    ArrayList <Card> deck = new ArrayList<Card>();
    private ArrayList <Card> playerHand = new ArrayList<Card>(7);
    private ArrayList <Card> compHand = new ArrayList<Card>(7);
    private int size;//the size of the grouping
    int randomIndex = 0;
    int deckSize = 51;
    boolean matchFound = false;
    private int playerScore = 0;
    private int compScore = 0;
    int count = 0;
    /*
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    */
    private static GroupOfCards onlyObject = null;
    
    private GroupOfCards()
    {
       
    }
    
    public static GroupOfCards getInstance()
    {
        if(onlyObject==null)
        {
            onlyObject = new GroupOfCards();
        }
        return onlyObject;
    }

    
    public void fillDeck(){
            for(Card.cardValues cv: Card.cardValues.values()){
                for(Card.cardSuits cs : Card.cardSuits.values()){
                    deck.add(new Card(cv, cs));
                }
            }
    }
    
    public void deal(){
       for(int i=0; i<7; i++){
           shuffle();
            getPlayerHand().add(new Card(deck.get(0).getCurrentValue(), deck.get(0).getCurrentSuit()));
           deck.remove(0);
           shuffle();
            getCompHand().add(new Card(deck.get(0).getCurrentValue(), deck.get(0).getCurrentSuit()));
           deck.remove(0);
       }
    }
    
    public boolean callCardfromComp(Card c){
        matchFound = false;
       for(Iterator<Card> itr = getCompHand().iterator(); itr.hasNext();){ 
           Card cg = itr.next();
           if(cg.getCurrentValue()==c.getCurrentValue()){
                getPlayerHand().add(new Card(cg.getCurrentValue(), cg.getCurrentSuit()));
                itr.remove();
              matchFound = true;
           }
       }
       if (matchFound)return true;
       else return false;
       
    }
    public boolean callCardfromPlayer(Card c){
        matchFound = false;
       for(Iterator<Card> itrd = getPlayerHand().iterator(); itrd.hasNext();){ 
           Card cgd = itrd.next();
           if(cgd.getCurrentValue()==c.getCurrentValue()){
                getCompHand().add(new Card(cgd.getCurrentValue(), cgd.getCurrentSuit()));
                itrd.remove();
              matchFound = true;
           }
       }
       if (matchFound)return true;
       else return false;
       
    }
        public void checkFourOfAKindPlayer(){  
         for(int i = 0; i<getPlayerHand().size();i++){
             count = 0;
           for(int j = i+1; j<getPlayerHand().size();j++){
               if(getPlayerHand().get(i).getCurrentValue() == getPlayerHand().get(j).getCurrentValue()){
                  count++;
                  if(count == 3){
                      setPlayerScore(getPlayerScore() + 1);
                      removeFourOfAKindPlayer(getPlayerHand().get(i));
                  } 
               }
           }
       }
         System.out.println("Player Score: " + getPlayerScore());
    
     }
         public void checkFourOfAKindComp(){  
         for(int i = 0; i<getCompHand().size();i++){
             count = 0;
           for(int j = i+1; j<getCompHand().size();j++){
               if(getCompHand().get(i).getCurrentValue() == getCompHand().get(j).getCurrentValue()){
                  count++;
                  if(count == 3){
                      setCompScore(getCompScore() + 1);
                      removeFourOfAKindComp(getCompHand().get(i));
                  } 
               }
           }
       }
         System.out.println("Computer Score: " + getPlayerScore());
    
     }
         public void removeFourOfAKindPlayer(Card c){
           for(Iterator<Card> itrd = getPlayerHand().iterator(); itrd.hasNext();){ 
           Card cgd = itrd.next();
           if(cgd.getCurrentValue()==c.getCurrentValue()){
                itrd.remove();
            
           } 
         }
         }
         
        public void removeFourOfAKindComp(Card c){
           for(Iterator<Card> itrd = getCompHand().iterator(); itrd.hasNext();){ 
           Card cgdv = itrd.next();
           if(cgdv.getCurrentValue()==c.getCurrentValue()){
                itrd.remove();
            
           } 
         }
         }
         public void getFromDeckPlayer(){
            shuffle();
            getPlayerHand().add(new Card(deck.get(0).getCurrentValue(), deck.get(0).getCurrentSuit()));
            deck.remove(0); 
         }
         
         public void getFromDeckComp(){
            shuffle();
            getCompHand().add(new Card(deck.get(0).getCurrentValue(), deck.get(0).getCurrentSuit()));
            deck.remove(0);  
         }
         public Card compTurn(){
             shuffleCompHand();
             return getCompHand().get(0);
         }
  
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return deck;
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    public void shuffleCompHand(){
        Collections.shuffle(compHand);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    

    /**
     * @return the playerScore
     */
    public int getPlayerScore() {
        return playerScore;
    }

    /**
     * @param playerScore the playerScore to set
     */
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    /**
     * @return the compScore
     */
    public int getCompScore() {
        return compScore;
    }

    /**
     * @param compScore the compScore to set
     */
    public void setCompScore(int compScore) {
        this.compScore = compScore;
    }

    /**
     * @return the playerHand
     */
    public ArrayList <Card> getPlayerHand() {
        return playerHand;
    }

    /**
     * @return the compHand
     */
    public ArrayList <Card> getCompHand() {
        return compHand;
    }
    
}//end class
