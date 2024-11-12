import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int a,b,c;

	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());

		int result = a * b * c;
		String str = String.valueOf(result);

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c - '0'] += 1;
		}

		for (int i : arr) {
			bw.write(i + "\n");

		}

		bw.flush();
		bw.close();
	}
}