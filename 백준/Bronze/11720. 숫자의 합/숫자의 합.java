import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		String i_string = st.nextToken();

		int[] i_num = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			i_num[i] = Character.getNumericValue(i_string.charAt(i));
			sum += i_num[i];
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
