import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n, m;

	static String[] chess;

	// 2. 정답 체스판과 비교
	static String[] w_chess = {
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
	};

	static String[] b_chess = {
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
	};


	public static void main(String[] args) throws IOException {
		// 문제정의
		// 완전탐색문제
		// 1. 체스판 입력받기
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		chess = new String[n];
		for (int i = 0; i < n; i++) {
			chess[i] = br.readLine();
		}


		// 3. 최소 값 찾기
		int result = 99999;

		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int check_result = check(i, j);
				if (check_result < result) {
					result = check_result;
				}
			}
		}
		// 4. 최소 값 출력
		bw.write(result + "");
		bw.close();

	}

	private static int check(int n, int m) {
		// 매개변수로 받아온 n,m은 체크할 시작위치임

		int white_result = 0;
		int black_result = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (w_chess[i].charAt(j) != chess[n+i].charAt(m+j)) {
					white_result++;
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (b_chess[i].charAt(j) != chess[n+i].charAt(m+j)) {
					black_result++;
				}
			}
		}

		return ((white_result < black_result) ? white_result : black_result);
	}
}
