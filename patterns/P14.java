import java.util.*;
public class P14 {
   
        public static void p14(int n) {
            for(int i=0;i<n;i++){
          
                for(char ch = 'A'; ch<='A'+i;ch++){
                    System.out.print(ch + " ");
                    
                }
               
                System.out.println();
               
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
p14(n);
sc.close();
    }
    
}
