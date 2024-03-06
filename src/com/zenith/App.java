package com.zenith;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		
		System.out.println("Welcome to WAR.\nEnter player 1 name:");
		Player player1 = new Player(sc.next());
		System.out.println("Enter player 2 name:");
		Player player2 = new Player(sc.next());
		
		sc.close();
		
		//Let's play!
		deck.shuffle();
		
		// deal the cards to the two players
		// TODO: make this work for n players
		for (int i = 0; i < 52; i += 2) {
			
			player1.draw(deck);
			player2.draw(deck);
			
		}
		
		for (int i = 0; i < 26; i ++) {
			
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			
			System.out.println(player1.getName() + " plays " + p1.describe() + "!");
			System.out.println(player2.getName() + " plays " + p2.describe() + "!");
			
			if (p1.getValue() > p2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " scores!");
			} else if (p1.getValue() < p2.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " scores!");
			} else {
				System.out.println("It's a draw!");
			}
			
			System.out.println(player1.getName() + " score: " + player1.getScore() + "\n" + player2.getName() + " score: " + player2.getScore());
			System.out.println("\n");
			
			// Sleep for amount of time each loop to enhance "gameplay"
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n\n");
		if (player1.getScore() > player2.getScore()) {
			
			System.out.println(player1.getName() + " wins!");
			
		} else if (player1.getScore() < player2.getScore()) {
			
			System.out.println(player2.getName() + " wins!");
			
		} else if (player1.getScore() == player2.getScore()) {
			
			System.out.println("It's a draw!");
			
		}
		

	}

}
