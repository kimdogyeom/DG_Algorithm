import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String input;
        String num[];

        while(sc.hasNext()){
            input = sc.nextLine();
            num = input.split(" ");
            
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            
            System.out.println(a+b);            
        }
    }
}