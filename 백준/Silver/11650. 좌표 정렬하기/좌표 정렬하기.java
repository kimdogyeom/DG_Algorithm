import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());

		LinkedList<Coordinate> coordinateArr = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			coordinateArr.add(new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		Comparator<Coordinate> coordiSort = (s1, s2) -> {
			if (s1.getX() == s2.getX()) {
				return Integer.compare(s1.getY(), s2.getY());
			}

			return Integer.compare(s1.getX(), s2.getX());
		};

		coordinateArr.sort(coordiSort);
		for (Coordinate i : coordinateArr) {
			bw.write(i.getCoordinate() + "\n");
		}
		bw.flush();
		bw.close();

	}

	private static class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y){
			this.x = x;
			this.y = y;
		}

		public int getX(){
			return this.x;
		}

		public int getY() {
			return this.y;
		}

		public String getCoordinate(){
			return this.x + " " + this.y;
		}
	}
}
