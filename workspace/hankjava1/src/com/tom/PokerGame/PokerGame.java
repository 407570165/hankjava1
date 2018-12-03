package com.tom.PokerGame;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random(13+1);
		int i=0;
		int j=0;
			int[] a=new int[13];
			a[1]=1;
			a[2]=2;
			a[3]=3;
			a[4]=4;
			a[5]=5;
			a[6]=6;
			a[7]=7;
			a[8]=8;
			a[9]=9;
			a[10]=10;
			a[11]=11;
			a[12]=12;
			a[13]=13;
			for(i=0,j=0;i<a.length;i++) {
				int b =random.nextInt(4+1);
				char flower=0;
				switch(b) {
				case 1:
					flower='h';
					break;
				case 2 :
					flower='c';
					break;
				case 3:
					flower='a';
					break;
				case 4:
					flower='d';
					break;
					default:
				System.out.println(flower+a[i]);
			}
			
			 
				
				}
			}
		}

