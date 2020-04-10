package algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {

//  https://www.acmicpc.net/problem/1874
//	문제
//	스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 
//	스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
//
//	1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
//	임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
//
//	입력
//	첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
//
//	출력
//	입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

//	public static void main(String[] args) {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		List<String> opList = new ArrayList<String>(); // 연산자 저장
//		int count = 1; // stack에 쌓을 수
//		
//		try {
//			int N = Integer.parseInt(br.readLine()); // 크기 지정
//			int arr[] = new int[N]; // 배열 생성
//			
//			int num = Integer.parseInt(br.readLine()); // 수열로 나열할 숫자 입력
//			
//			if(num > N) {
//				System.out.println("NO");
//				return;
//			} else {
//				
//			}
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//	}

	public static int N; // 입력받을 수열의 크기
	public static int num = 1; // 수열을 만들기 위해 1 ~ N가 되는 수

	public static int[] arr; // 입력받을 수열이 저장될 배열
	public static Stack<Integer> stack; // 수열을 만들기 위해 1 ~ N 까지의 수가 저장될 스택

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		stack = new Stack<Integer>();

		boolean isAble = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if (isAble) {
				// num이 arr[i] 보다 작으면 같을때까지 스택에 증가 시키고 num++한다.
				if (num <= arr[i]) {
					while (num <= arr[i]) {
						stack.push(num++);
						sb.append("+ \n");
					}
				}
				if (stack.isEmpty())
					isAble = false;
				else {
					// 스택의 top이 arr[i]보다 작을때까지 pop
					while (stack.peek() >= arr[i]) {
						stack.pop();
						sb.append("- \n");
						if (stack.isEmpty()) {
							break;
						}
					}
				}
			}
		}
		if (isAble) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
	}

}



/*
 * 얘기해볼것 : 문제 이해의 측면
 * - 예제 입력 : 엔터로 한개씩 입력받는 것인지?
 * - StringBuilder 클래스
 */

