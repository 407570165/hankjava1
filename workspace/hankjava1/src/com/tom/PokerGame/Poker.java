package com.tom.PokerGame;

import java.util.Random;

public class Poker {
	int[] cards=new int[52];
	Card[] c=new Card[52];
	int i;
	char[] suits={'\u2660','\u2663','\u2665','\u2666'};
	char flower;
	public Poker(){
		for(i=0;i<52;i++){
			cards[i]=i;
		}
	}
	public void game(){
		for (i=0;i<52;i++){
		/*	switch((i)/13){
			case 0:
				flower='\u2660';
				break;
			case 1:
				flower='\u2663';
				break;
			case 2:
				flower='\u2665';
				break;
			case 3:
				flower='\u2666';
				break;
			}*/
			System.out.print((cards[i]%13+1)+""+suits[i/13]+" ");
		if(i%13==12){
			System.out.println();
		}	
		}
		
	}
}
			