import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] input = br.readLine().toCharArray();

		int[] requiredTime = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result += requiredTime[input[i] - 'A'];
		}

		bw.write(result + "");

		bw.flush();
		bw.close();
	}
}