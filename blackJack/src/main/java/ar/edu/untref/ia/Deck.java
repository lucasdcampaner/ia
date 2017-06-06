package ar.edu.untref.ia;

import java.util.*;

/**
 * Created by gonzalocozzi on 06/06/17.
 */
public class Deck {

    private List<String> listOfCards;

    //A deck contains a list of strings representing cards. It's interacted with by the player and the dealer.
    public Deck(){

        this.listOfCards = new ArrayList<>();
        String[] cards = {"2 of Diamonds", "2 of Hearts", "2 of Clubs", "2 of Spades",
                "3 of Diamonds", "3 of Hearts", "3 of Clubs", "3 of Spades",
                "4 of Diamonds", "4 of Hearts", "4 of Clubs", "4 of Spades",
                "5 of Diamonds", "5 of Hearts", "5 of Clubs", "5 of Spades",
                "6 of Diamonds", "6 of Hearts", "6 of Clubs", "6 of Spades",
                "7 of Diamonds", "7 of Hearts", "7 of Clubs", "7 of Spades",
                "8 of Diamonds", "8 of Hearts", "8 of Clubs", "8 of Spades",
                "9 of Diamonds", "9 of Hearts", "9 of Clubs", "9 of Spades",
                "10 of Diamonds", "10 of Hearts", "10 of Clubs", "10 of Spades",
                "Jack of Diamonds", "Jack of Hearts", "Jack of Clubs", "Jack of Spades",
                "Queen of Diamonds", "Queen of Hearts", "Queen of Clubs", "Queen of Spades",
                "King of Diamonds", "King of Hearts", "King of Clubs", "King of Spades",
                "Ace of Diamonds", "Ace of Hearts", "Ace of Clubs", "Ace of Spades"};

        for (String item : cards){
            this.listOfCards.add(item);
        }


        this.shuffle();
    }

    public List<String> getRemainingCards(){
        return this.listOfCards;
    }

    //Remove and returns the top card of the deck
    public String getCard(){

        String card = this.listOfCards.get(0);
        this.listOfCards.remove(0);
        return card;
    }

    //Randomize the order of the cards in the deck
    private void shuffle(){
        Collections.shuffle(this.listOfCards);
    }

}
