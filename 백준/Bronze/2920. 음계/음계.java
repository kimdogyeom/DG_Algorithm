import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		String result = check(arr);

		bw.write(result);

		bw.flush();
		bw.close();
	}

	private static String check(int[] arr) {
		if (arr[0] == 1) {
			for (int i = 0; i < 8; i++) {
				if (arr[i] != i + 1){
					return "mixed";
				}
			}
			return "ascending";
		}else{
			for (int i = 0; i < 8; i++) {
				if (arr[i] != 8 - i) {
					return "mixed";
				}
			}
			return "descending";
		}
	}
}