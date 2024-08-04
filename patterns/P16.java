import java.util.*;
public class P16{
   
        public static void p16(int n) {
            char letter = 'A'; 
          
            for (int i = 1; i <= n; i++) {
               
                for (int j = 0; j < i; j++) {
                    System.out.print(letter + " ");
                }
               
                System.out.println();
                
                letter++;
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
p16(n);
sc.close();
    }
    
}
