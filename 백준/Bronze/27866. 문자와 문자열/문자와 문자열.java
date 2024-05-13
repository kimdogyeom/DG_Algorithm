import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		int i = Integer.parseInt(br.readLine());

		// 문제에서 말하는 순서와 인덱스의 차이확인
		bw.write(input.charAt(i-1));

		bw.flush();
		bw.close();
	}
}