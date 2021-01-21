package edu.handong.csee.sight.java.lab2;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPassword password = new CheckPassword();
		password.run();
	}
	
	/*
	 * 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
	 * 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
	 * 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.*/
	public void run() {
		String password;
		String[] vowel = {"a","e","i","o","u"};
		System.out.println("password를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		password = sc.next();
		boolean IsContainVowel;
		
		IsContainVowel = CheckVowel(password, vowel);
		if(!IsContainVowel) {
			System.out.println("<"+password+">"+" is not acceptable.");
			return;
		}
		if(!CheckCount(password, vowel)) {
			System.out.println("<"+password+">"+" is not acceptable.");
			return;
		}
		if(!CheckSame(password)) {
			System.out.println("<"+password+">"+" is not acceptable.");
			return;
		}
		
		System.out.println("<"+password+">"+" is acceptable.");
			
	}
	
	private boolean CheckSame(String password) {
		String[] passwords;
		int check=0;
		passwords= password.split("");
		for(int i=0; i<passwords.length;i++) {
			if(i>0 && passwords.equals(passwords[i-1])){
				if(passwords[i].equals("e") && passwords[i].equals("e")||passwords[i].equals("o") && passwords[i].equals("o"))
					check =0;
				else check =1;
			}
			if(check == 1) return false;
		}
		return true;
	}
	
	
	
	//모음 3개가 연속인가? 모음을 하나의 string으로 하고, password를 하나 씩 읽는다. 
	//password 1개가 모음 string에 포함되어 있다면, count++ 아니면 count = 0
	//count가 3이 되면 return false를 한다. 아니면 return true를 한다. 
	private boolean CheckCount(String password, String[]vowel) {
		String str_vowel = vowel.toString();
		String[] passwords = password.split("");
		int vcount = 0;
		int ccount = 0;
		for(int i=0;i<passwords.length;i++) {
			if(str_vowel.contains(passwords[i])) {
				vcount++;
				ccount = 0;
			}
			else {
				vcount = 0;
				ccount++;
			}
			if(vcount==3||ccount==3) return false;
		}
		return true;
	}
	
	
	private boolean CheckVowel(String password, String[] vowel) { //모음 하나를 반드시 포함하고 있는지 
		int count =0;
		for(int i=0;i<vowel.length;i++) {
			if(password.contains(vowel[i]))	 count++;
		}
		if(count == 0) return false;
		return true;
	}
}
