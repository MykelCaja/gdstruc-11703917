package com.cajamykel;
import java.util.Scanner;

//Min + (int)(Math.random() * ((Max - Min) + 1)) - Random

public class Main {

    public static void main(String[] args) {
        int rounds = 1;
        int action;
        int cardPick;

    //Make deck of cards: [WORKING]
	CardStack playerDeck = new CardStack();
        for(int i = 1; i <= 30; i++){
            String color = null;
            int number = 1 + (int)(Math.random() * ((5 - 1) + 1));
            pickColor(number, color);
            playerDeck.push(new Card(1 + (int)(Math.random() * ((10 - 1) + 1)), color));
        }

    //Summon Player and Create Discard Pile:
    CardStack playerHand = new CardStack();
    CardStack discardPile = new CardStack();

    while(playerDeck.getSize() != 0){
        //Possible Commands
        commandOptions(rounds);

        //Command Chosen
        action = 1 + (int)(Math.random() * ((3 - 1) + 1));
        cardPick = 1 + (int)(Math.random() * ((5 - 1) + 1));
        random(action, cardPick);

        if(action == 1){
            actionOne(cardPick, playerDeck, playerHand);
        }

        if(action == 2){
            actionTwo(cardPick, discardPile, playerHand);
        }

        if(action == 3){
            actionThree(cardPick, discardPile, playerHand);
        }

        //End Phase:
        endPhase(playerDeck.getSize(), playerHand.getSize(), discardPile.getSize(), rounds);
        rounds++;
        new Scanner(System.in).nextLine();//Pause
     }
    }

    //Choosing color
    public static void pickColor(int number, String color){
        if(number == 1){
            color = "Red";
        }
        if(number == 2){
            color = "Blue";
        }
        if(number == 3){
            color = "Yellow";
        }
        if(number == 4){
            color = "Pink";
        }
        if(number == 5){
            color = "Black";
        }
    }


    public static void random(int action, int cardPick){
        System.out.println("Action picked: [" + action + "]");
        System.out.println("Cards to be added: [" + cardPick + "]");
        System.out.println();
    }


    public static void commandOptions(int number){
        System.out.println("Round [" + number + "] =============================");
        System.out.println("Possible Actions available");
        System.out.println("[1] - Draw Cards");
        System.out.println("[2] - Discard Cards");
        System.out.println("[3] - Get cards from the discard pile.");
    }


    public static void endPhase(int playerDeck, int playerHand, int discardPile, int number){
        System.out.println("Round [" + number + "] Complete! ===================");
        System.out.println("Card Deck: " + playerDeck);
        System.out.println("Player Hand: " + playerHand);
        System.out.println("Discard Pile: " + discardPile);
    }

    //Player draws from card deck.
    public static void actionOne(int cardPick, CardStack playerDeck, CardStack playerHand){
        System.out.println("Player drawing from card deck.");
        for(int i = 1; i <= cardPick; i++){
            if(playerDeck.getSize() == 0){
                System.out.println("Wait.");
                System.out.println("There is no card available");
            }
            else{
                playerHand.push(playerDeck.pop());
            }
        }
    }

    //Player decides to discard.
    public static void actionTwo(int cardPick, CardStack discardPile, CardStack playerHand){
        System.out.println("Player decides to discard.");
        for(int i = 1; i <= cardPick; i++){
            if(discardPile.getSize() == 0){
                System.out.println("Wait.");
                System.out.println("There is no card to discard.");
            }
            else{
                discardPile.push(playerHand.pop());;
            }
        }
    }

    //Player gets from the discard pile.
    public static void actionThree(int cardPick, CardStack discardPile, CardStack playerHand){
        System.out.println("Player gets from the discard pile.");
        for(int i = 1; i <= cardPick; i++){
            if(discardPile.getSize() == 0){
                System.out.println("Wait.");
                System.out.println("There is no card in the discard pile.");
            }
            else{
                playerHand.push(discardPile.pop());
            }
        }
    }

}
