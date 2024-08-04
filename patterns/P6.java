import java.util.*;
public class P6 {  
   public static void p6(int n){
    for(int i =1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(n-j+1+" ");
        }
        System.out.println();
    }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p6(n);
    sc.close();
        }
    }
