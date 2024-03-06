package com.zenith;
import java.util.*;

public class Deck extends Card{
	
	private List<Card> cards = new ArrayList<Card>();
	
	// Constructor
	public Deck() {
		
		// Loop for each suit
		for (int suitIndex = 0; suitIndex < 4; suitIndex++) {
			
				
				for (int valueIndex = 2; valueIndex <= 14; valueIndex++) {
					
					String cName = "null";
					String cSuit = "null";
					// switch to name card
					
					switch(valueIndex) {
					case 2:
						cName = "Two";
						break;
					case 3:
						cName = "Three";
						break;
					case 4:
						cName = "Four";
						break;
					case 5:
						cName = "Five";
						break;
					case 6:
						cName = "Six";
						break;
					case 7:
						cName = "Seven";
						break;
					case 8:
						cName = "Eight";
						break;
					case 9:
						cName = "Nine";
						break;
					case 10:
						cName = "Ten";
						break;
					case 11:
						cName = "Jack";
						break;
					case 12:
						cName = "Queen";
						break;
					case 13:
						cName = "King";
						break;
					case 14:
						cName = "Ace";
						break;
					}
					
					switch(suitIndex) {
					case 0:
						cSuit = "Spades";
						break;
					case 1:
						cSuit = "Hearts";
						break;
					case 2:
						cSuit = "Clubs";
						break;
					case 3:
						cSuit = "Diamonds";
						break;
					}
					
					
					Card card = new Card(cName, cSuit, valueIndex);
					
					cards.add(card);
					
				
			}
			
			
		}
		
		
	}
	
	
	// describe method prints entire deck to console
	public void describeToConsole() {
		
		System.out.println("Cards in deck:");
		for (Card card : cards) {
		
			card.describeToConsole();
		
		}
		System.out.println("Total cards: " + cards.size());
	}
	
	// Shuffle method to randomly sort cards in deck
	public void shuffle() {
		
		Collections.shuffle(cards);
		Collections.shuffle(cards);
		Collections.shuffle(cards);
		
	}
	
	// debug method to draw a card, print it to console, and put it back on top of the deck
	public Card drawShow() {
		
		Card card = cards.get(0);
		System.out.println("Drew " + card.getName() + " of " + card.getSuit() + ", value " + card.getValue());
		return card;
		
	}
	
	// draw method: draws from top of deck, deletes top card from deck, and outputs the card
	public Card draw() {
		
		Card card = cards.get(0);
		cards.remove(0);
		return card;

	}

	// deal method to deal 7 cars to players, here as a reference.
	public Map<String, List<Card>> deal(int players) {
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Map<String, List<Card>> playerHands = new HashMap<String, List<Card>>();
		
		if (players > 7 || players < 2) {
			
			System.out.println("Invalid number of players. Please pick more than 1 and fewer than 8 players.");
			return null;
			
		} else {
		
			for (int i = 1; i <= players; i++) {
			
				List<Card> hand = new ArrayList<Card>();
			
				for (int j = 0; j < 7; j++) {
			
					hand.add(deck.draw());
				
			
					}
			
				playerHands.put(("Player " + i), hand);
		
				}
		
			for (int k = 1; k <= players; k++) {
			
				System.out.println("\nPlayer " + k + "'s hand:");
			
				for (Card card : playerHands.get("Player " + k)) {
					
					card.describe();
				
				}
				System.out.println();
			
			
			}
		
		System.out.println("Cards remaining in deck: " + deck.size());
		
			return playerHands;
		
		}
		
	}
		


	// method to return number of cards remaining in the deck
	public int size() {
		int size = cards.size();
		return size;
	}
	
	
}
