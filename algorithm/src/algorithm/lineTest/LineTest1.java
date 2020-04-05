package algorithm.lineTest;

import java.util.Scanner;

public class LineTest1 {


	public int solution(String inputString) {
		
		int count1 = 0; // ()
		int count2 = 0; // {}
		int count3 = 0; // []
		int count4 = 0; // <>
		boolean flag = false; // 괄호 유무
		
		for(int i=0; i<inputString.length(); i++) {
			
			if(inputString.charAt(i) == '(') {
				count1++;
				flag = true;
			} else if(inputString.charAt(i) == '{') {
				count2++;
				flag = true;
			} else if(inputString.charAt(i) == '[') {
				count3++;
				flag = true;
			} else if(inputString.charAt(i) == '<') {
				count4++;
				flag = true;
			} else if(inputString.charAt(i) == ')') {
				if(count1%2 == 1) {
					count1++;
				}
				flag = true;
			} else if(inputString.charAt(i) == '}') {
				if(count2%2 == 1) {
					count2++;
				}
				flag = true;
			} else if(inputString.charAt(i) == ']') {
				if(count3%2 == 1) {
					count3++;
				}
				flag = true;
			} else if(inputString.charAt(i) == '>') {
				if(count4%2 == 1) {
					count4++;
				}
				flag = true;
			}
				
		}
		
		int answer = 0; // 결과값 저장
		
		
		if(flag == false) { // 괄호 없음
			answer = 0;
		} else { // 괄호 있음
			if(count1%2 == 1 || count2%2 == 1 || count3%2 == 1 || count4%2 == 1) {
				answer = -1;
			} else {
				answer = count1/2 + count2/2 + count3/2 + count4/2;
			}
		}
		

		return answer;
	}

}
