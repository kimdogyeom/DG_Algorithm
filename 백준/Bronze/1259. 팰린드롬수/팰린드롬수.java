//

import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		while (true) {
			String str = br.readLine();
			boolean check = true;

			if (str.equals("0")) {
				break;
			}

			for (int i = 0; i < str.length()/2; i++) {
				if (str.charAt(i) != str.charAt((str.length()-1) - i)) {
					check = false;
				}
			}

			if (check) {
				bw.write("yes");
			}else {
				bw.write("no");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

}