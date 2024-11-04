import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());

		LinkedList<User> userList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			userList.add(new User(Integer.parseInt(st.nextToken()), st.nextToken()));
		}

		Comparator<User> ageSort = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());

		userList.sort(ageSort);

		for (User i : userList) {
			bw.write(i.getAge() + " " + i.getName() + "\n");
		}
		bw.close();

	}

	static class User{
		int age;
		String name;

		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
	}
}