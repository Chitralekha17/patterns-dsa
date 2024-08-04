import java.util.*;
public class P13 {
    public static void p13(int n){
        int k =1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p13(n);
    sc.close();
  }  
}
