import java.util.*;
public class P4{  
   public static void p4(int n){
    for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p4(n);
    sc.close();
        }
    }
