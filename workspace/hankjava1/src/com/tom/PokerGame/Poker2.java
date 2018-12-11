package com.tom.PokerGame;

import java.util.ArrayList;

public class Poker2 {
	ArrayList bag =new ArrayList();
	public Poker2(){
		for (int i=0;i<52;i++){
			Card c =new Card(i);
				bag.add(c);
		}
		System.out.println(bag.size());
	}
	public void print(){
		for (int i=0;i<52;i++){
			Card c =(Card)bag.get(i);
			System.out.print(c.get()+" ");
			if (i%13==12)
				System.out.println();
		}
	}
}
