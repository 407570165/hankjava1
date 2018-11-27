package com.tom.PokerGame;

import java.util.Random;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] flowers={0x2665,0x2660};
			System.out.println(flowers);
			int c=0x2666;
			System.out.println(c);
			int[] nums =new int[5];
			nums[4]=98;
			nums[2]=77;
			for(int i=0;i<nums.length;i++){
				System.out.println(nums[i]);
			}
	
			
			Random random=new Random();
			for(int i=0;i<52;i++){
			int number=random.nextInt(13+1);
			int a=random.nextInt(4+1);
			char flower=0;
			switch(a){
			case 1:
				flower='H';
				break;
			case 2:
				flower='S';
				break;
			case 3:
				flower='C';
				break;
			case 4:
				flower='D';
				break;
			}
			System.out.println(flower);
			
			
		
			/*if(a==1){
				System.out.print(number+"S");
			}
			else if(a==2){
				System.out.print(number+"H");
			}
			if(a==3){
				System.out.print(number+"C");
			}
			if(a==4){
				System.out.print(number+"D");
			}
		}*/
			}
		}
	//}
		
	}

//}
