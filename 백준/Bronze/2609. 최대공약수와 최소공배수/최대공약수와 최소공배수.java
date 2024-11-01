import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// 최대 공약수
		int gcd = gcd_(n,m);
		// 최소 공배수
		int lcm = lcm(n,m, gcd);

		bw.write(gcd + "");
		bw.newLine();
		bw.write(lcm + "");
		bw.flush();
		bw.close();

	}

	// 재귀방식
	static int gcd(int a,int b){
		if (b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}

	// 반복문방식
	static int gcd_(int a,int b){
		while (b != 0) {
			int r = a % b;

			a = b;
			b = r;
		}
		return a;
	}

	static int lcm(int a, int b, int gcd){
		return a * b / gcd;
	}



}