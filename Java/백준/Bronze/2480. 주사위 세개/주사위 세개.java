import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        
        sc.close();
        
        int max=f;
        int result = 0;
    
        if(max<s)
            max = s;
        if(max<t)
            max = t;
            
        if(f==s && s==t){
            result = 10000+max*1000;
        }else if(f==s || s==t || f==t){ // 같은 눈 으로 연산
            if(f==s){
                result = 1000+f*100;
            }else if(s==t){
                result = 1000+s*100;
            }else if(f==t){
                result = 1000+f*100;
            }

        }else{
            result = max*100;
        }
        
        System.out.println(result);
    }
}
