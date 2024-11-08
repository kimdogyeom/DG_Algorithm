// 처음 문제를 접했을 때 괄호가 열리고 닫히는게 재귀로 상태를  체크하면 된다고 생각했으나
// 자료구조 중 스택을 활용하면 이를 효율적으로 처리할 수 있었음

import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 1; i <= n; i++) {
			deque.addLast(i);
		}

		int card = card(deque);

		bw.write(card + "");
		bw.flush();
		bw.close();
	}

	private static int card(Deque<Integer> deque) {
		int itercount = deque.size();
		for (int i = 1; i < itercount; i++) {
			Integer i1 = deque.removeFirst();
			Integer pop = deque.pop();
			deque.addLast(pop);
		}

		return deque.pop();
	}
}
