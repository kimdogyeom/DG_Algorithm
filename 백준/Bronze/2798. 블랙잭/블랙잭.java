import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int cardCount;
	static int dealerNum;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		cardCount = Integer.parseInt(st.nextToken());
		dealerNum = Integer.parseInt(st.nextToken());

		int[] card = new int[cardCount];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cardCount; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(card);

		int nearNum = card[0] + card[1] + card[2];

		for (int i = 0; i < cardCount; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {
					int testNum = card[i] + card[j] + card[k];

					if (testNum > dealerNum) {
						break;
					}

					if (dealerNum - testNum < dealerNum - nearNum) {
						nearNum = testNum;
					}
					if (nearNum == dealerNum) {
						break;
					}
				}
			}
		}

		bw.write(nearNum + "");
		bw.flush();
		bw.close();
	}

}