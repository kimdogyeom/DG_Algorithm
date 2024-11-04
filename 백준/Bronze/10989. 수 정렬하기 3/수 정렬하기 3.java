import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());

		int[] intArr = new int[n];

		for (int i = 0; i < n; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(intArr);

		for (int i : intArr) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
}