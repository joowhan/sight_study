package edu.handong.csee.sight.java.lab2;

import java.util.HashMap;
import java.lang.Math;
import java.util.Scanner;

/*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
길이가 0보다 크고 80보다 작은 문자열이 주어진다. 
문자열은 O와 X만으로 이루어져 있다.*/

class CountQuiz {
  public static void main(String[] args) {
    CountQuiz countQuiz = new CountQuiz();
		countQuiz.run();
  }

	public void run(){
		int correct=0;
		int wrong=0;
		int num;
		int length;
		String answer="";
		int[] random;
		
		HashMap<Integer, Integer> scorePackage = new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); //문제 개수 입력

		for(int i=0;i<num;i++){
			length = ((int)(Math.random()*80000)); //문자열 크기를 random하게 0 ~ 80
			random = new int[length]; //length 만큼의 숫자 배열 크기를 정한다.
			
			for(int j=0;j<length;j++){
				random[j] = ((int)(Math.random()*10000)%10);
				if(random[j]%2!=0)
					answer+="X";
				else
					answer+="O";
			}
		}
		System.out.println(answer);
		
		
		
		//answer = "OOXXOXXOOO";
		
		
		
		
		/*
		char[] ans = new char[answer.length()];
		
		for(int i=0;i<ans.length;i++){
			if(ans[i]=="O"){
				correct++;
			}
			if(ans[i]=="X"){

			}
		}*/
	}
}
