package com.tom.PokerGame;

import java.util.Random;

public class Shuffle {
Card[] cards=new Card[52];
	public Shuffle() {
		for(int i=0;i<52;i++) {
			cards[i]=new Card(i);
		}
	}
	public void game() {
		for(int i=0;i<52;i++) {
			int r= new Random().nextInt(52);
			Card tmp =cards[i];
			cards[i]=cards[r];
			cards[r]=tmp;
		}
	}
	public void print() {
		for(int i=0;i<52;i++) {
			System.out.print(cards[i].get()+" ");
			if (i%13==12) {
				System.out.println();
			}
		}
		}
}
