import java.util.*;
public class P5 {  
   public static void p5(int n){
    for(int i =1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("* ");
        }
        System.out.println();
    }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p5(n);
    sc.close();
        }
    }
