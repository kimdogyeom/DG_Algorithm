import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		sc.nextLine();

		String i_num = sc.nextLine();
		int search_num = sc.nextInt();


		int[] num = Arrays.stream(i_num.split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

		long result = Arrays.stream(num)
			.filter(a -> a == search_num)
			.count();

		System.out.println(result);
	}
}
