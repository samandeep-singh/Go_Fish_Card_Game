/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samandeepgill
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class GroupOfCards.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        GroupOfCards expResult = null;
        GroupOfCards result = GroupOfCards.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillDeck method, of class GroupOfCards.
     */
    @Test
    public void testFillDeck() {
        System.out.println("fillDeck");
        GroupOfCards instance = null;
        instance.fillDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deal method, of class GroupOfCards.
     */
    @Test
    public void testDeal() {
        System.out.println("deal");
        GroupOfCards instance = null;
        instance.deal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of callCardfromComp method, of class GroupOfCards.
     */
    @Test
    public void testCallCardfromCompGood() {
        System.out.println("callCardfromComp");
        Card c = new Card(Card.cardValues.ACE, Card.cardSuits.HEARTS);
        GroupOfCards instance = GroupOfCards.getInstance();
        boolean expResult = true;
        boolean result = instance.callCardfromComp(c);
        assertEquals(expResult, result);
    }
        public void testCallCardfromCompBoundary() {
        System.out.println("callCardfromComp");
        Card c = new Card(Card.cardValues.ACE, Card.cardSuits.HEARTS);
        GroupOfCards instance = GroupOfCards.getInstance();
        boolean expResult = true;
        boolean result = instance.callCardfromComp(c);
        assertEquals(expResult, result);
    }
        

    /**
     * Test of callCardfromPlayer method, of class GroupOfCards.
     */
    @Test
    public void testCallCardfromPlayer() {
        System.out.println("callCardfromPlayer");
        Card c = null;
        GroupOfCards instance = null;
        boolean expResult = false;
        boolean result = instance.callCardfromPlayer(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkFourOfAKindPlayer method, of class GroupOfCards.
     */
    @Test
    public void testCheckFourOfAKindPlayer() {
        System.out.println("checkFourOfAKindPlayer");
        GroupOfCards instance = null;
        instance.checkFourOfAKindPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkFourOfAKindComp method, of class GroupOfCards.
     */
    @Test
    public void testCheckFourOfAKindComp() {
        System.out.println("checkFourOfAKindComp");
        GroupOfCards instance = null;
        instance.checkFourOfAKindComp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFourOfAKindPlayer method, of class GroupOfCards.
     */
    @Test
    public void testRemoveFourOfAKindPlayer() {
        System.out.println("removeFourOfAKindPlayer");
        Card c = null;
        GroupOfCards instance = null;
        instance.removeFourOfAKindPlayer(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFourOfAKindComp method, of class GroupOfCards.
     */
    @Test
    public void testRemoveFourOfAKindComp() {
        System.out.println("removeFourOfAKindComp");
        Card c = null;
        GroupOfCards instance = null;
        instance.removeFourOfAKindComp(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFromDeckPlayer method, of class GroupOfCards.
     */
    @Test
    public void testGetFromDeckPlayer() {
        System.out.println("getFromDeckPlayer");
        GroupOfCards instance = null;
        instance.getFromDeckPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFromDeckComp method, of class GroupOfCards.
     */
    @Test
    public void testGetFromDeckComp() {
        System.out.println("getFromDeckComp");
        GroupOfCards instance = null;
        instance.getFromDeckComp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compTurn method, of class GroupOfCards.
     */
    @Test
    public void testCompTurn() {
        System.out.println("compTurn");
        GroupOfCards instance = null;
        Card expResult = null;
        Card result = instance.compTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.showCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleCompHand method, of class GroupOfCards.
     */
    @Test
    public void testShuffleCompHand() {
        System.out.println("shuffleCompHand");
        GroupOfCards instance = null;
        instance.shuffleCompHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int givenSize = 0;
        GroupOfCards instance = null;
        instance.setSize(givenSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerScore method, of class GroupOfCards.
     */
    @Test
    public void testGetPlayerScore() {
        System.out.println("getPlayerScore");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getPlayerScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerScore method, of class GroupOfCards.
     */
    @Test
    public void testSetPlayerScore() {
        System.out.println("setPlayerScore");
        int playerScore = 0;
        GroupOfCards instance = null;
        instance.setPlayerScore(playerScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompScore method, of class GroupOfCards.
     */
    @Test
    public void testGetCompScore() {
        System.out.println("getCompScore");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getCompScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompScore method, of class GroupOfCards.
     */
    @Test
    public void testSetCompScore() {
        System.out.println("setCompScore");
        int compScore = 0;
        GroupOfCards instance = null;
        instance.setCompScore(compScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerHand method, of class GroupOfCards.
     */
    @Test
    public void testGetPlayerHand() {
        System.out.println("getPlayerHand");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getPlayerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompHand method, of class GroupOfCards.
     */
    @Test
    public void testGetCompHand() {
        System.out.println("getCompHand");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getCompHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
