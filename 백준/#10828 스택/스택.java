import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[] stack = new int[N];
		int state = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = 0;

			String s = st.nextToken();

			if (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (s) {
				case ("push"):
					stack[state] = num;
					state++;
					break;
				case ("pop"):
					if (state == 0 || stack[state - 1] == 0) {
						bw.write("-1"+"\n");
						break;
					}else {
						bw.write(stack[state - 1]+"\n");
						stack[state -1] = 0;
						state--;
					}
					break;
				case ("size"):
					bw.write(state+"\n");
					break;
				case ("empty"):
					if (state == 0) {
						bw.write("1"+"\n");
					} else {
						bw.write("0"+"\n");
					}
					break;
				case ("top"):
					if (state == 0) {
						bw.write("-1"+"\n");
						break;
					}

					if (stack[state - 1] == 0) {
						bw.write("-1"+"\n");
					} else {
						bw.write(stack[state - 1] + "\n");
					}
					break;
			}
		}

		bw.flush();
		bw.close();
	}
}