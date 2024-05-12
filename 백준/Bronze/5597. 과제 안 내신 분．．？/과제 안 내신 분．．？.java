import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] students = new int[30];

		for (int i = 0; i < students.length-2; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			students[a-1] = a;
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] == 0) {
				bw.write((i+1) + "");
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
	}
}
