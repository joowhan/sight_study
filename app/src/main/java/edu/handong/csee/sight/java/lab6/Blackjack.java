package edu.handong.csee.sight.java.lab6;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blackjack blackjack = new Blackjack();
		blackjack.run();
	}
	
	public void run() {
		int n = 0;
		int m = 0;
		int[] num;
		int result =0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		num = new int[n];
		int[] rand = new int[3];
		
		for(int i=0;i<num.length;i++)
			num[i] = sc.nextInt();
		// 모든 입력 마침 //
		while(true) {
			// 0 부터 num.length까지 random 숫자 생성 예를 들어 3 4 5
			for(int i=0;i<3;i++) {
				rand[i] = (int)(Math.random() * num.length);
				for(int j=0;j<i;j++)
					if(rand[i] == rand[i-1]) i--;
				
			}
			for(int i=0;i<3;i++) {
				result += num[rand[i]];
			}
			if(result <= m) break;
		}
		
		System.out.println(result);
		
		
	
	}
	
}
