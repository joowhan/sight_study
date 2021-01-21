package edu.handong.csee.sight.java.lab2;

import java.util.Scanner;

public class Correct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Correct correct = new Correct();
		correct.run();
	}
	
	public void run() {
		int position;
		String word;
		char ch;
		System.out.println("문자열의 위치를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		position = sc.nextInt(); //위치 입력 
		word = sc.next();//문자열 입력 // 문자열 
		//ch = word.charAt(position); //제거할 문자 찾기
		String front = word.substring(0, position-1);
		String end = word.substring(position);
		String result = front + end;
		System.out.println(result);
		
		
		//word.replace(ch, "");
		
	}

}
