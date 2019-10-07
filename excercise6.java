import java.util.Scanner;

public class excercise6 {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = 0;     
        int r = 0;   
        int t = 0;  
        String ans  = "y"; 

        while (ans.equals("y")) {

            System.out.print("How many times do you want to roll? ");
            n = sc.nextInt();
  
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < n; i++) {
                r = (int) (Math.random()*6)+1;
                t = t + r;
                System.out.print(r + " ");
            }
            System.out.println("");
            System.out.println("your total: " + t);
            System.out.println("");
            System.out.print("Again? ");
            ans = sc.next();
            System.out.println("");            
        }
    }
}
