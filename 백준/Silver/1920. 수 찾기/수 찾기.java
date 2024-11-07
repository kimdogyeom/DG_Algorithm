import static java.util.Collections.binarySearch;

import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n, m;
	static List<Integer> a_arr = new ArrayList<>();
	static List<Integer> m_arr = new ArrayList<>();



	public static void main(String[] args) throws IOException {
		// 문제정의
		//
		// 1. N입력받기
		// 2. A[N]만큼 숫자가 입력
		// 3. M입력받기
		// 4. M개의 숫자가 입력
		// 5. M개 입력받은 수 중 A[0]~A[N]까지 같은 수가 있으면 1 없으면 0 출력
		// 6. 간단한 순회문제
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a_arr.add(Integer.parseInt(st.nextToken()));
		}

		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			m_arr.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(a_arr);

		for (int i = 0; i < m_arr.size(); i++) {
			int result = binarySearch(a_arr, m_arr.get(i));
			if (result >= 0) {
				bw.write(1 + "\n");
			}else {
				bw.write(0 + "\n");
			}

		}



		bw.flush();
		bw.close();
	}
}
