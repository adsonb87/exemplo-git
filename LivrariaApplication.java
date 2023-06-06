import java.util.Scanner;

public class LivrariaApplication{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nome: ");
        String text = scan.nextLine();
        scan.close();
        System.out.println("Hello " + text + " !!");
    }

}