/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author samandeepsingh
 */
public class GoFishGame extends Game{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInp = -1;
        int i=0;
        int inp = 0;
        String playerName = "";
     GroupOfCards goc = GroupOfCards.getInstance();
     goc.fillDeck();
     goc.deal();
     while(true){
         System.out.println("************GO FISH************");
         System.out.println("Submitted By- Samandeep Singh, Ha Nguyen,Issayev Chingiz,Ruhi Ruhi\n");
         System.out.println("Please Enter Your Name: \n");
         playerName = input.nextLine();
         Player player = new Player(playerName);
         GoFishGame gg = new GoFishGame();
         System.out.println("Welcome " + player.getPlayerName() + "\n");
         System.out.println("Please Make a choice:\n(1) Start the game \n(2) Quit Game \n(3) View Rules");
         inp = input.nextInt();
         if(inp == 2){
             System.exit(0);
         }
         else if(inp == 3){
             System.out.println("RULES OF THE GAME:\n The rules are, if there are 2 players each of them will get 7 cards, if there are 3 or more players each of them will get\n" +
"5 cards and the remaining cards are placed in the middle. One of the players will call the number of a card that the\n" +
"person has, if the other player has it then he/she should give it to the first player and if the first player gathers all four\n" +
"suits of a kind then he/she puts it down and then keep going to the next player until all of them run out of cards. Final\n" +
"step that all players count how many cards each of them has. The player who has the most cards is the winner.");
             System.out.println("Press 1 to go back or 2 to exit");
             int inp1 = 0;
             if(inp1 == 1){
                 continue;
             }
             else if(inp == 2){
                 System.exit(0);
             }
             else{
                 System.out.println("Invalid Input");
             }
         }
         else if(inp == 1){
             System.out.println("***********************Shuffling Deck***********************\n");
             System.out.println("***********************Dealing Cards************************");
             while(userInp != 0){
             System.out.println("Your Hand: ");
             i = 0;
             for(Card cdd : goc.getPlayerHand()){
             i++;
             System.out.println("("+i+") " +cdd.toString());
            }
             System.out.println("Your Turn \n Ask for a card:(Please enter the place number of the card you want to call)");
             userInp = input.nextInt();
             if(goc.callCardfromComp(goc.getPlayerHand().get((userInp - 1)))){
               System.out.println("Computer had a card you asked for, It has been added to your hand");
            }
             else{
               System.out.println("Computer didn't have the card. So, It said Go Fish.\n A card is added from the remaining deck");
               goc.getFromDeckPlayer();

       }
             System.out.println("Please choose one of the following:\n (1) Start Computer Turn (2) Exit");
             userInp = input.nextInt();
             if(userInp == 2){
                 gg.declareWinner();
                 System.exit(0);
             }
             else if(userInp == 1){
             goc.checkFourOfAKindPlayer();

             System.out.println("Computer's Turn\n");
             Card compRequest = goc.compTurn();
             System.out.println("Computer asked for: " + compRequest.toString());
             if(goc.callCardfromPlayer(compRequest)){
                 System.out.println("You have the other suit of the same card. Your card has been given to the computer");
             }
             else{
                 System.out.println("GO FISH You don't have the card computer asked for. Computer has taken a card from the remaining deck");
                 goc.getFromDeckComp();
             }
             goc.checkFourOfAKindComp();
             }
             else{
                 System.out.println("Invalid Input");
                 continue;
             }
             }

         }
         else{
             System.out.println("Invalid Input");
             continue;
         }

     } 
    }

    @Override
    public void declareWinner() {
        GroupOfCards gc = GroupOfCards.getInstance();
       if(gc.getPlayerScore()>gc.getCompScore()){
           System.out.println("\n Your Score: " + gc.getPlayerScore());
           System.out.println("Computer's Score: " + gc.getCompScore());
           System.out.println("You Win!");
       }
       else if(gc.getPlayerScore()<gc.getCompScore()){
           System.out.println("\n Your Score: " + gc.getPlayerScore());
           System.out.println("Computer's Score: " + gc.getCompScore());
           System.out.println("Computer Wins!");
       }
       else{
           System.out.println("\nYour Score: " + gc.getPlayerScore());
           System.out.println("Computer's Score: " + gc.getCompScore());
           System.out.println("Tie");
       }
    }
    }

