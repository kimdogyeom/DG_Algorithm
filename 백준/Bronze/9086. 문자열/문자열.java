import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		while(N-- != 0){
			String input = br.readLine();
			bw.write(input.charAt(0));
			bw.write(input.charAt(input.length()-1));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}