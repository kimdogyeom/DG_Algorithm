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

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (vps(s)) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}

		bw.flush();
		bw.close();
	}

	private static boolean vps(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.empty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
