import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int bucket_count = Integer.parseInt(st.nextToken());
		int mix_count = Integer.parseInt(st.nextToken());

		int[] bucket = new int[bucket_count];

		for (int i = 0; i <bucket_count; i++) {
			bucket[i]=i+1;
		}

		int temp = 0;
		while(mix_count-- != 0){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			
			for (int j = a-1; j<b;j++) {
				temp = bucket[j];
				bucket[j] = bucket[b-1];
				bucket[b-1] = temp;
				b--;
			}
		}

		for (int i = 0; i < bucket.length; i++) {
			bw.write(bucket[i]+" ");
		}

		bw.flush();
		bw.close();
	}
}