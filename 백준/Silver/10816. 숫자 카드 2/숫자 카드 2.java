import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import javax.lang.model.type.ArrayType;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;


	static int n, m;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		HashMap<Integer, Integer> nHash = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int card = Integer.parseInt(st.nextToken());
			nHash.put(card, nHash.getOrDefault(card, 0) + 1);
		}

		m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			sb.append(nHash.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
		}

		bw.write(sb.toString().trim());
		bw.flush();
		bw.close();

	}
}
