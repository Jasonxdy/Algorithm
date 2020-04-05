package algorithm.lineTest;

public class Run {

	public static void main(String[] args) {
		LineTest2 lt2 = new LineTest2();

		String[][] snapshots = { { "ACCOUNT1", "100" }, { "ACCOUNT2", "150" } };
		String[][] transactions = {
		                           {"1", "SAVE", "ACCOUNT2", "100"},
		                           {"2", "WITHDRAW", "ACCOUNT1", "50"}, 
		                           {"1", "SAVE", "ACCOUNT2", "100"}, 
		                           {"4", "SAVE", "ACCOUNT3", "500"}, 
		                           {"3", "WITHDRAW", "ACCOUNT2", "30"}
		                         };
		
		String answer[][] = lt2.solution(snapshots, transactions);
		
		for(int i = 0; i<answer.length; i++) {
			for(int j = 0; j<answer[i].length; j++) {
				System.out.println("answer[" + i +"]" + "[" + j + "] : " + answer[i][j]);
			}
		}

	}

}
