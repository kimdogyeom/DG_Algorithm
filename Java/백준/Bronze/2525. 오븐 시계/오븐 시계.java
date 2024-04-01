
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int pm = sc.nextInt();
        int ph = 0;
        

        ph = (m+pm)/60;
        m = (m+pm)%60;

        h+=ph;
        if(h>=24)
        {
            h-=24;
        }
        System.out.println(h +" "+ m);
        
        sc.close();
    }
}