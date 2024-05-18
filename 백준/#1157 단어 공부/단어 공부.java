import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] input_Arr = br.readLine().toUpperCase().toCharArray();
		int[] count = new int[26];


		// input_Arr[i]-'A'를 가지고 count
		for (int i = 0; i < input_Arr.length; i++) {
			count[input_Arr[i] - 'A']++;
		}

		int max = -1;
		int result=0;
		// count[]에 각 알파벳 갯수 들어가있음
		for (int i = 0; i <count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				result = i;
			} else if (max == count[i]) {
				result = -1;
			}
		}

		if (result == -1) {
			bw.write("?");
		}else {
			//(char) count[result]+'A' 이렇게 하면 count에 저장된 갯수와 A를 합산하는 것임...
			// 당연히 글자가 깨질 수 밖에...
			// 아래 처럼 해야지 result로 알파벳 순서를 찾고 'A'와 합산해 올바른 출력을 함!
			bw.write((char)(result+'A')+ "");
		}

		bw.flush();
		bw.close();
	}
}