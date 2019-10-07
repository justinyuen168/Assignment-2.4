import java.util.Scanner;

public class exercise5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String  st= ""; 
  
        System.out.print("What character do you want your triangle made of? ");
        st  = sc.next();
        System.out.print("How tall do you want your triangle? ");
        int n = 0;  
        n = sc.nextInt();
        System.out.println("");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(st);
            }
            System.out.println("");
        }
    }
}