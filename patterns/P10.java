import java.util.Scanner;

public class P10 {
    public static void p10(int n){
        for(int i =1;i<=n;i++){
for(int j =1;j<=i;j++){
    System.out.print("* ");
}
System.out.println();
        }
        for(int i =2;i<=n;i++){
            for(int j =n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
                    }
    }
            public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    p10(n);
    sc.close();
        }
}
