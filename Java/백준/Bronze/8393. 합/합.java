import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int result = 0;

        for(int i=0; i<n; i++){
            count++;
            result+=count;
        }
        
        System.out.println(result);
    }
}
