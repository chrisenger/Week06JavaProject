package com.zenith;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	
	// constructor
	public Card(String name, String suit, int value) {
		
		this.name = name;
		this.suit = suit;
		this.value = value;
		
	}
	
	// blank constructor
	public Card() {
		this.name = "";
		this.suit = "";
		this.value = 0;
	}

	// Name Getter
	public String getName() {
	   return name;
	 }

	// Name Setter
	public void setName(String newName) {
	   this.name = newName;
	}
	 
	// Suit Getter
	public String getSuit() {
		return suit;
	}
	 
	// Suit Setter
	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}
	 
	// Value Getter
	public int getValue() {
	  return value;
	}

	// Value Setter
	public void setValue(int newValue) {
	  this.value = newValue;
	}


	public String describe() {
		
		return this.name + " of " + this.suit;
		
	}
	
	// describe to console
	public void describeToConsole() {
		
		System.out.println(this.name + " of " + this.suit);
		
	}
	
	
	
	
	

}
