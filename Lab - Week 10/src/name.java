// Georgian Student Number : 200416930
// Lakehead Student Number : 0877826
//JORDON MOLONEY
/** Importing the scanner to allow
 *  for the user to enter their own name
 */
import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = new String();
        /** Getting the name from the user to make into
         *  The string "name".
         */
        System.out.println("Please enter your name");
        String name = scan.nextLine();

        /** Using a for loop a long with a CharArray to
         *  go through all the letter values in the inputted name
         *  Whilst printing the blank space that creates the
         *  diagonal effect, which increases in size each time.
         */
        for (char letter : name.toCharArray()) {
            System.out.println(x + letter);
            x = x + " ";
        }
    }
}