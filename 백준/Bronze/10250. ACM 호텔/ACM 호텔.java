import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int h,w, n;

	public static void main(String[] args) throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			// n번째 손님이 들어갈 방
			// n%층 몇층
			int floor = n % h;
			if (floor == 0) {
				floor = h;
			}

			// n-1로 0-based 인덱스 처럼 계산하여 정확한 계산을 함
			// n이h의 배수일 때 부정확한 계산발생
			int roomNum = (n - 1) / h + 1;

			bw.write(floor + String.format("%02d", roomNum) + "\n");
		}

		bw.flush();
		bw.close();
	}
}