import java.util.*;
public class P7 {  
   public static void p7(int n){
    for(int i =0;i<n;i++){
        for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
      
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p7(n);
    sc.close();
        }
    }
