import java.util.Scanner;

class excercise4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String st = ""; 
        System.out.print("What character do you want your bar made of? ");
        st = sc.next();
        System.out.print("How long do you want your bar? ");
        int n = 0; 
        n = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        
       int i = 0;
        while ( i < n) {
            System.out.print(st);
             i++;
        }
    }
}
