import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String i_string = "";
		while((i_string = br.readLine()) != null){
			bw.write(i_string);
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}