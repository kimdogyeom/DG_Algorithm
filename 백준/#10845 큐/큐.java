import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		ArrayQueue queue = new ArrayQueue();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			String comm = st.nextToken();
			switch (comm) {
				case "push":
					queue.push(Integer.parseInt(st.nextToken()));

					break;

				case "pop":
					bw.write(queue.pop() + "");
					bw.newLine();

					break;

				case "size":
					bw.write(queue.size() + "");
					bw.newLine();

					break;

				case "empty":
					if (queue.empty()) {
						bw.write(1 + "");
					}else {
						bw.write(0 + "");
					}
					bw.newLine();
					break;

				case "front":
					bw.write(queue.front()+"");
					bw.newLine();

					break;

				case "back":
					bw.write(queue.back()+"");
					bw.newLine();

					break;
			}
		}

		bw.flush();
		bw.close();
	}
}


	class ArrayQueue {

		int max = 10000;
		int front;      // 머리 쪽에 위치할 index 값, pop할 때 참조 index
		int rear;       // 꼬리 쪽에 위치할 index 값, push할 때 참조 index
		int[] queue;    //

		public ArrayQueue() {
			front = rear = 0;       // 0으로 초기화
			queue = new int[max];   // 큐 배열 생성
		}

		public boolean push(int value) {
			if (rear == max - 1) {
				return false;
			}
			queue[rear++] = value;
			return true;
		}

		public int pop() {
			if (empty()) {
				return -1;
			}
			else {
				return queue[front++];
			}
		}

		public int size() {
			return rear - front;    // ftont와 rear가 같으면 큐에 값이 없다는 뜻
		}

		public boolean empty() {
			return front == rear;   //
		}

		public int front() {
			if (empty()) {
				return -1;
			}
			else{
				return queue[front];
			}
		}

		public int back() {
			if (empty()) {
				return -1;
			}
			else {
				return queue[rear - 1];
			}
		}
	}