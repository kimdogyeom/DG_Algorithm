import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int quantity = sc.nextInt();
        int result = 0;

        for(int i=0;i<quantity;i++){
            int price = sc.nextInt();
            int item = sc.nextInt();

            result+=(price*item);
        }

        if(total == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
