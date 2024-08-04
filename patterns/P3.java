import java.util.*;
public class P3 {  
   public static void p2(int n){
    for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p2(n);
    sc.close();
        }
    }