//Link URI: https://www.urionlinejudge.com.br/judge/en/problems/view/1110

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		while (true) {
			int value = Integer.parseInt(in.readLine());
			if (value == 0) {
				break;
			}
			ArrayList<Integer> remaining = new ArrayList<Integer>(value);
			int top = 0;
			StringBuilder result = new StringBuilder("Discarded cards: ");
			for (int i = 1; i <= value; i++) {
				remaining.add(i);
			}

			while (remaining.size() > 2) {
				top = remaining.remove(0);
				result.append(top);
				result.append(", ");
				remaining.add(remaining.remove(0));
			}
			result.append(remaining.remove(0));
			result.append("\nRemaining card: ");
			result.append(remaining.get(0));
			result.append("\n");
			System.out.print(result);
		}
	}
}