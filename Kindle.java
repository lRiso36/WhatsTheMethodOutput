package Week6;
import java.util.Scanner;

public class Kindle {
    private static final Scanner keyboard = new Scanner(System.in);

    private int totalPages;
    private int currentPage;

    public Kindle(int numberOfPage) {
        totalPages = numberOfPage;
        currentPage = 1;

    }//end of Kindle constructor

    public String toString() {
        return "Page " + currentPage + " of " + totalPages;
    } // end of toString

    public void turnPages(int increment) {
        currentPage += increment;
        if (currentPage > totalPages) {
            currentPage -= increment;
            System.out.println("Turning " + increment + "pages would take you past the last page");
        }
    }

    public void turnPages() {
        if (currentPage + 1 >= totalPages) {
            System.out.println("Turning the page would take you past the last page");
        } else
            currentPage++;
    }
}

        //-------------------------------------------------------------------------------------------------
