package edu.handong.csee.sight.java.lab5;

import java.util.Scanner;

public class Hotel {
	private int num = 0;
	private int n =0;
	private int h = 0;
	private int w = 0;
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.ReserveSystem();
	}
	
	public void ReserveSystem() {
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(i!=num) {
			i++;
			
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			FindRoom();
		}
	}
	
	public void FindRoom() {
		int client = 0;
		int height = 0;
		int width = 1;
		for(int i=0;i<n;i++) {
			client++;
			height++;
			if(client == h) {
				client = 0;
				height = 0;
				width++;
				if(width == w) break;
			}
		}
		//System.out.println(height+"0"+width); //높이가 10이하 
	}
}
