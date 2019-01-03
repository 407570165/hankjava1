package com.tom.PokerGame;

import java.util.ArrayList;
import java.util.Random;

public class trash {
	ArrayList bag = new ArrayList();
	public trash () {
		for(int i =0;i<52;i++) {
			Card c =new Card(i);
			bag.add(c);
		}
		System.out.println(bag.size());
	}
	public void shuffle () {
		for (int i=0;i<52;i++) {
			int r =new Random().nextInt(52);
		}
	}
		public void print() {
			for(int i=0;i<52;i++) {
		if (i%13==12) {
			System.out.println();
		}
			}
	}
}
