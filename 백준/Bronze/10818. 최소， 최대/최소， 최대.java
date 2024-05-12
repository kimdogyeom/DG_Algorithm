import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextLine();
		String num = sc.nextLine();

		int max = Arrays.stream(num.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
		int min = Arrays.stream(num.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();

		System.out.println(min + " " + max);
	}
}
