package edu.handong.csee.sight.java.lab2;

import java.util.Scanner;

public class FindDwarf { 
	
	public static void main(String[] args) {
		FindDwarf findDwarf = new FindDwarf();
		findDwarf.run();
	}
	
	public void run() {
		int[] dwarf;
		
		dwarf = new int[9];
		System.out.println("난쟁이 숫자를 입력하세요.");
		for(int i=0; i<dwarf.length;i++) {
			Scanner sc = new Scanner(System.in);
			dwarf[i] = sc.nextInt();
			if(dwarf[i]<0||dwarf[i]>99) {
				System.out.println("다시 입력하세요.");
				i--;
			}
		}
		FindSevenDwarf(dwarf);
		
	}
	//9개 중 7개의 합이 100인지 확인해야 한다. 
	//0 ~ 8 사이의 중복되지 않는 7개의 숫를 생성
	private void FindSevenDwarf(int[] dwarf) {
		int[] num = new int[7];
		int result =0;
		while(true) {
			for(int i=0;i<7;i++) {
				num[i] = ((int)(Math.random()*8000)%10); // 0 ~ 8
				for(int j=0;j<i;j++) {
					if(num[i]==num[j])
						i--;
				} //중복 제거 
			}
			for(int i=0;i<7;i++) {
				System.out.println(num[i]);
			}
			for(int i=0;i<7;i++) {
				result +=dwarf[num[i]];
			}
			if(result==100) break;
		}
		for(int i=0;i<7;i++) {
			System.out.println(dwarf[num[i]]);
		}
	}
	
}
