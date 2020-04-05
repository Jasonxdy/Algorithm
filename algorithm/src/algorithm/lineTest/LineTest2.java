package algorithm.lineTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LineTest2 {


	public String[][] solution(String[][] snapshots, String[][] transactions) {

		int size1 = snapshots.length;
		int size2 = transactions.length;

		Map<String, Integer> resultSet = new HashMap<String, Integer>();
		Set<Integer> numSet = new HashSet<Integer>();

		int count = 1;

		for (int i = 0; i < size1; i++) {

			resultSet.put(snapshots[i][0], Integer.parseInt(snapshots[i][1]));

			for (int j = 0; j < size2; j++) {

				if (!numSet.contains(Integer.parseInt(transactions[j][0]))) {
					numSet.add(Integer.parseInt(transactions[j][0]));
					if (snapshots[i][0].equals(transactions[j][2])) { // snapshots에 있을때
						
						int change = 0;
						
						switch (transactions[j][1]) {
						case "SAVE":
							change = resultSet.get(snapshots[i][0]) + Integer.parseInt(transactions[j][3]);
							resultSet.put(snapshots[i][0], change);
							break;
						case "WITHDRAW":
							change = resultSet.get(snapshots[i][0]) - Integer.parseInt(transactions[j][3]);
							resultSet.put(snapshots[i][0], change);
							break;
						}
						
					} else { // snapshots에 없을때

						int change = 0;
						
						switch (transactions[j][1]) {
						case "SAVE":
							change = Integer.parseInt(transactions[j][3]);
							break;
						case "WITHDRAW":
							change = -Integer.parseInt(transactions[j][3]);
							break;
						}
						
						if (resultSet.get(transactions[j][2]) == null) {
							resultSet.put(transactions[j][2], change);
						} else {
							resultSet.put(transactions[j][2], resultSet.get(transactions[j][2]) + change);
						}
					}
				}


			}

		}

		int mapSize = resultSet.size();
		String[][] answer = new String[mapSize][2];

		int i = mapSize - 1;

		Iterator<String> keys = resultSet.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			answer[i][0] = key;
			answer[i][1] = resultSet.get(key).toString();
			i--;
		}

		return answer;
	}

}
