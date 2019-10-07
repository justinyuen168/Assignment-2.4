import java.util.Scanner;

class excercise7 {

    public static void main (String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in); 
        int g  = 0;  
        int t  = 0; 
        int tag = (int) (Math.random()*100) + 1; 
        
        System.out.println("I've choosen a random number between 1 and 100. Guess my number ");
        while (g != tag) {
            System.out.print("What is your guess? ");
            g = sc.nextInt();
            t++;
            if (g < tag) {
                System.out.println("higher");
            } else if (g > tag) {
                System.out.println("lower");
            }
        }
        
        System.out.println("You've guessed my number! It only took you " + t + " tries.");
    }
}