import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		char[][] chars = new char[n][80];

		for (int i = 0; i < n; i++) {
			int score = 0;
			String str = br.readLine();
			chars[i] = str.toCharArray();

			int combo = 0;

			for (char c : chars[i]) {
				if (c == 'O') {
					score += (++combo);
				} else if (c == '0' && combo != 0) {
					score += (++combo);
				}else {
					combo = 0;
				}
			}

			bw.write(score + "\n");
		}

		bw.flush();
		bw.close();
	}
}