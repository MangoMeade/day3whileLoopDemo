/**
 * Created by aibar on 6/28/2017.
 */
public class whileLoopInfinite {
    public static void main(String[] args) {
        System.out.println("hello world");

        while(true) {
            //to break out of this loop you will want
            //to include a conditional statement
            //to break out of the loop -- you can use the
            //keyword break

            int randomNumber = (int) (Math.random() * 10); //generate random num from 0 to 10
            System.out.println(randomNumber);

            if (randomNumber == 7) {
                System.out.println("value is found -- exit loop!");
                break;
            }
        }

        System.out.println("Continue statement example below: ");
        for (int i = 0; i < 5; i++) {
            int randomNumber2 = (int) (Math.random() * 10);

            if (randomNumber2 > 7) {
                System.out.println("invalid number -- continue loop");
                continue;
            }
            System.out.println(randomNumber2); //this will only execute if randomNumber2 <= 7
        }
    }
}
