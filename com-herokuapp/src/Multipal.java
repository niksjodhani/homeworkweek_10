import java.util.Scanner;
public class Multipal {
    public static void main(String[] args) {
        Chrome browser = new Chrome();
        Gecko firefox = new Gecko();
        Edge edge = new Edge();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any browser of \"Chrome\",\"Gecko\",\"Edge\"");
        String Userenter = scanner.next();


        if (Userenter.equalsIgnoreCase("Chrome")) {
            browser.Chrome();

        } else if (Userenter.equalsIgnoreCase("Gecko")) {
            firefox.geckobrowser();
        } else if (Userenter.equalsIgnoreCase("Edge")) {
            edge.msedgedriver();

        }
    }
}