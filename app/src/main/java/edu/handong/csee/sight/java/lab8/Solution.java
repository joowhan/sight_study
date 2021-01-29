package edu.handong.csee.sight.java.lab8;

class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int result = solution.romanToInt("III");
		System.out.println(result);
	}
	
	public int romanToInt(String s) {
		// I II III IV V VI VII VIII IX X
		int result = 0;
		String[] arr = s.split("");
		int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("I")) {
				if (i+1<arr.length && arr[i + 1].equals("V")) {
					result += (V - I);
					i++;
				} else if (i+1<arr.length &&arr[i+1].equals("X")) {
					result += (X - I);
					i++;
				} else
					result += I;

			}
			
			else if (arr[i].equals("X")) {
				if (i+1<arr.length &&arr[i + 1].equals("L")) {
					result += (L - X);
					i++;
				}
				else if (i+1<arr.length &&arr[i + 1].equals("C")) {
					result += (C - X);
					i++;
				}else
					result += X;
			}
			
			else if (arr[i].equals("C")) {
				if (i+1<arr.length &&arr[i + 1].equals("D")) {
					result += (D - C);
					i++;
				}
				else if (i+1<arr.length &&arr[i + 1].equals("M")) {
					result += (M - C);
					i++;
				}else
					result += C;
			}
			else if(arr[i].equals("V")) {
				result += V;
			}
			else if(arr[i].equals("L")) {
				result += L;
			}
			else if(arr[i].equals("D")) {
				result += D;
			}
			else if(arr[i].equals("M")) {
				result += M;
			}

		}
		return result;
	}
}
