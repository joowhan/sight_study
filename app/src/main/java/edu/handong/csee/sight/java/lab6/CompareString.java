package edu.handong.csee.sight.java.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareString compareString = new CompareString();
		compareString.run();
	}
	
	public void run() {
		int num;
		String[] words;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		words = new String[num];
		words[0] = sc.nextLine();
		for(int i=0;i<words.length;i++)
			words[i] = sc.nextLine();
		Arrays.sort(words);
		deleteSameWords(words);
		//test print
		for (String i : words) {
           System.out.println("["+i+"]");
        }
	}
	
	public void deleteSameWords(String[] words) {
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(i!=j && words[i].equals(words[j]))
					words[j].replace(words[j], "");
			}
		}
		for (String i : words) {
	           System.out.println("["+i+"]");
	        }
		
	}

}
