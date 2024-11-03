import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;
	static String[] inputString;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());

		inputString = new String[n];
		for (int i = 0; i < n; i++) {
			inputString[i] = br.readLine();
		}

		// 길이와 알파벳순으로 정렬
		Arrays.sort(inputString, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2); // 길이가 같으면 알파벳순으로 정렬
			}
			return s1.length() - s2.length(); // 길이가 다르면 길이순으로 정렬
		});


		// 중복 제거 및 출력
		// HashSet은 해시 알고리즘 사용하여 중복을 허용하지 않는 자료구조
		// LinkedHashSet은 순서를 보장하는 HashSet, 즉 중복을 허용하지 않고 순서대로 출력하는 자료구조
		LinkedHashSet<String> uniqueStrings = new LinkedHashSet<>();
		for (String str : inputString) {
			uniqueStrings.add(str);
		}

		// 결과 출력
		for (String str : uniqueStrings) {
			bw.write(str + "\n");
		}
		bw.flush();
		bw.close();
	}
}