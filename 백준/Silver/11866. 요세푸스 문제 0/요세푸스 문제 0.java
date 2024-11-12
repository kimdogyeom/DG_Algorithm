import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;


	static int n, k;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		// n크기의 자료구조(배열,리스트)를 만들어놓고 1~n까지 채워넣음
		// 자료구조의 크기가 0이 될 때 까지 반복을 돌며
		// k번째 요소를 계속해서 지움
		// 그러면 위치를 기억할 수 있어야 하지 않나?
		// ------
		// 나머지 연산을 활용해서 자료구조 사이즈로 나머지연산을 한다면?
		// 5크기의 원인데 7번째를 구해야 한다 7%5
		// 근데 배열이 0부터 시작하니까 -1을 해줘서 순서를 맞춰줘야함

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(i + 1);
		}

		bw.write("<");
		int index = 0;
		while (!arr.isEmpty()) {
			index = (index + k - 1) % arr.size();
			bw.write(arr.remove(index)+"");

			if (!arr.isEmpty()) {
				bw.write(", ");
			}
		}
		bw.write(">");

		bw.flush();
		bw.close();

	}
}
