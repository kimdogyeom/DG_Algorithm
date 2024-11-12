import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int a,b,c;

	public static void main(String[] args) throws IOException {

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());

		bw.write((a + b) - c + "\n");

		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		String strC = String.valueOf(c);

		int result = Integer.parseInt(strA + strB) - Integer.parseInt(strC);
		bw.write(result + "");

		bw.flush();
		bw.close();

	}
}