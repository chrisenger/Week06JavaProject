package com.zenith;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> discard = new ArrayList<Card>();
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String playerName = "";
	
	
	// constructor
	public Player(String name) {
		
		this.score = 0;
		this.playerName = name;
		
	}
	
	// score Getter
	public int getScore() {
		return score;
	}
	// score Setter
	public void setScore(int score) {
		this.score = score;
	}
	
	// name Getter
	public String getName() {
			return playerName;
	}
	// name Setter
	public void setName(String name) {
		this.playerName = name;
	}

	
	// describes player name, score, and each card in their hand
	public void describe() {
		
		System.out.println("Player name: " + playerName);
		System.out.println("Score: " + score);
		System.out.println("Cards:");
		for (Card card : hand) {
			card.describe();
		}
		
	}
	
	
	// removes first card from hand and outputs it
	public Card flip() {
		
		Card card = hand.get(0);
		hand.remove(0);
		discard.add(card);
		
		return card;
	}
	
	// draws the top card from the deck using deck.draw() method and adds it to the player's hand
	public void draw(Deck deck) {
		
		hand.add(deck.draw());
		
	}
	
	
	// increments the score by 1
	public void incrementScore() {
		
		score ++;
		
	}
	
	
	
	
	
	
	
	
//end of class bracket
}
