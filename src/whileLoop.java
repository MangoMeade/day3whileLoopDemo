import java.util.Scanner;

/**
 * Created by aibar on 6/28/2017.
 */
public class whileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            //get some input from the user and do some stuff
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye!");


    }
}
