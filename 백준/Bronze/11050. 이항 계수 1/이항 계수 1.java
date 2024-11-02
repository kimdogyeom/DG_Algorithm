import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;
	static int k;
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		dp = new int[n + 1][k + 1];

		int result = BC(n,k);

		bw.write(result + "");
		bw.flush();
		bw.close();

	}

	static int BC(int n, int k) {
		if (dp[n][k] != 0) {
			return dp[n][k];
		}

		if (n == k || k == 0) {
			return dp[n][k] = 1;
		}

		return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	}
}