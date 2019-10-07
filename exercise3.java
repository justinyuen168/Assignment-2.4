import java.util.Scanner;

class exercise3 {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int i = 0; 
        int t = 0; 
        System.out.println("Put in numbers to add and negative to calculate");
        System.out.println("");

    while (i >= 0) {
            i = sc.nextInt();
            if (i >= 0) {
                t = t + i;    
            }
        }

        System.out.println("");
        System.out.println("Your total is " + t);        
    }
}