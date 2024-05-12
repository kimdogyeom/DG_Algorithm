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
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = i + 1;
		}


		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int temp = 0;

			temp = bucket[a];
			bucket[a] = bucket[b];
			bucket[b] = temp;
		}

		for (int i = 0; i < bucket.length; i++) {
			bw.write(bucket[i]+ " ");
		}

		bw.flush();
		bw.close();
	}
}
