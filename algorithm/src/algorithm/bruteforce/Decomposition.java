package algorithm.bruteforce;

import java.util.Scanner;

public class Decomposition {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요 (1이상 1,000,000이하): ");
		int num = sc.nextInt();
		
		
		// 풀이 1
		
		int count = 1;
		
		while(true) {
			if(count < 10) { // 2 자릿수 이하일때
				if(count * 2 == num) { 
					break;
				} else {
					count++;
				}
			} else if (count < 100) { // 3자릿수 이하일때
				
				int a = count/10; // 10의 자릿수
				int b = count - a * 10; // 1의 자릿수
				
				if(count + a + b == num) {
					break;
				} else {
					count ++;
				}
			} else if (count < 1000) {
				// 추가적으로 1,000,000 이하까지 코드 작성
			}
			
		}
		System.out.println(count);
		
		
		// 자릿수를 알아낼 수 있어서 자동으로 각 자릿수의 숫자를 분리해낼 수 있는 코드?
		
		// 풀이 2
		
		// 나올 수 있는 최소값 = 2, 최댓값 1000001
		
//		int count = 0; // 자릿수
		
//		while(true) {
//			if(2 <= num && num <= 18) { // 한자릿수 최소, 최대
//				count = 10;
//			} else if ()
//		}
		
//		int count = 1000000;
		
//		while(num/count == 0) {
//			count = count/10;
//		}
		
		
		
		
		
		
		
	}

}
