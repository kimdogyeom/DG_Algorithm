import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N 과목의 개수 M 자기 점수 중 최대값
		// 모든 점수를 점수 / M*100로 고쳤다.
		// 예를 들어, 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

		int N = Integer.parseInt(st.nextToken());
		int[] score = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		int max = score[0];
		for (int i = 0; i < N; i++) {
			if(max < score[i]){
				max = score[i];
			}
		}

		float sum = 0f;
		for (int i = 0; i < N; i++) {
			sum += (float) score[i] / max * 100;
		}
		bw.write(sum/N+"");


		bw.flush();
		bw.close();
	}
}