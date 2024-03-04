
import java.util.Scanner;
public class iAm {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String userString = "";
            String quality = "";
            String collectedQualities = "";
            System.out.println("Please enter a sentence and '.' to end:");

            while(!userString.equals(".")) {
                userString = scanner.nextLine();
                if (userString.startsWith("I am ")) {
                    quality = userString.substring(5);
                    collectedQualities += quality + ", ";
            } // end if
            } // end while

                System.out.println("Qualities collected so far: " + collectedQualities);
            } // end main
        } // end iAm

