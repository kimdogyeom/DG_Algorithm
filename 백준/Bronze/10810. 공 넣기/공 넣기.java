import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] bucket = new int[n];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			// 배열의 index와  현실의 순서를 혼동하지말자
			for (int j = a-1; j <= b-1; j++) {
				bucket[j] = c;
			}
		}

		for (int i : bucket) {
			bw.write(i + " ");
		}
		bw.flush();
		bw.close();
	}
}
