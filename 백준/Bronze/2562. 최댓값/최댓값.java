import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] i_num = new int[9];

		for (int i = 0; i < i_num.length; i++) {
			i_num[i] = sc.nextInt();
		}

		int max = 0;
		int count = 0;

		for (int i = 0; i < i_num.length; i++) {
			if (i_num[i] > max) {
				max = i_num[i];
				count = i+1;
			}
		}

		System.out.println(max);
		System.out.println(count);
	}
}
