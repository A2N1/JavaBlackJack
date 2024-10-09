import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class BlackJack {
    prvate class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }
    }

    ArrayList<Card> deck;

    BlackJack() {
        startGame();
    }

    public void start Game() {
        //deck = new ArrayList<Card>();
        buildDeck();
    }

    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"H", "D", "C", "S"};

        for(int i = 0, i < types.length; i++) {
            for (int j = < values.length; j++) {
                Card card = new Card(values[j], types[i]);
                deck.add(card);
            }
        }

        System.out.println("Built deck:");
        System.out.println(deck);
    }
}
