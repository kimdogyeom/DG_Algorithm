import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] arr = br.readLine().toCharArray();

		int[] arr2 = new int[26];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr2[arr[i] - 'a'] == -1)   // 여기서 중복되는 글자 필터
				arr2[arr[i] - 'a'] = i;     // (arr[i]-'a')는 해당 글자의 알파벳 순서를 파악
		}                                   // 알파벳 순서를 파악 했으면 arr2의 인덱스에 i를 넣으면 끝

		for (int j : arr2) {
			bw.write(j + " ");
		}

		bw.flush();
		bw.close();
	}
}