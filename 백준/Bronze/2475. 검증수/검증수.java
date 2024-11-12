import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		for (int i = 0; i < 5; i++) {
			int j = Integer.parseInt(st.nextToken());
			result += j * j;
		}

		bw.write(result % 10 + "");
		bw.flush();
		bw.close();

	}
}