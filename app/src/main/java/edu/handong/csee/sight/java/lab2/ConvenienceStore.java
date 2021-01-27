package edu.handong.csee.sight.java.lab2;

import java.util.Scanner;

public class ConvenienceStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvenienceStore convenienceStore = new ConvenienceStore();
		convenienceStore.run();
	}
	
	
	public void run() {
		int s_price ;
		int s_gram;
		int x, min;
		int num;
		int price;
		
		
		Scanner sc = new Scanner(System.in);
		s_price = sc.nextInt();
		s_gram = sc.nextInt();
		x = 1000/s_gram;
		price = s_price * x;
		
		num = sc.nextInt();
		min = FindLowPrice(num);
		if(min<price)
			System.out.println(min);
		else
			System.out.println(price);
		
		
	}
	
	private int FindLowPrice(int num) {
		int[] cmprice = new int[num];
		int[] cmgram = new int[num];
		int[] result = new int[num];
		int x, min;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++) {
			cmprice[i] = sc.nextInt();
			cmgram[i] = sc.nextInt();
			x = 1000/cmgram[i];
			result[i] = cmprice[i] * x;
		}
		
		min = result[0];
		for(int i=0;i<result.length;i++) {
			if(min > result[i])
				min = result[i];
		}
		return min;
	}
}
