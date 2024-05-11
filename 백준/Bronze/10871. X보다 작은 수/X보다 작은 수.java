import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] f_input = sc.nextLine().split(" ");
		int n = Integer.parseInt(f_input[0]);
		int x = Integer.parseInt(f_input[1]);

		int[] s_input = Arrays.stream(sc.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.filter(a -> a < x).toArray();

		String result = "";

		for (int i : s_input) {
			result+=i+" ";
		}

		System.out.println(result);
	}
}
