import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int result = 0;
		// boolean[] check = new boolean[100]은 안되고 new boolean[101]은 되는것인가..
		// 조건에서는 첫째 줄에 손님의 수 N이 주어진다. N은 100보다 작거나 같다. 라고 주어졌는데
		// 1~100까지라서 100을 체크하려면 101개의 인덱스를 만들거나
		// for문 안의 조건문에서 인덱스를 -1씩 해줘야한다.
		boolean[] check = new boolean[101];

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (check[num] == true)
				result++;
			else
				check[num] = true;
		}

		bw.write("" + result);

		bw.flush();
		bw.close();
	}
}