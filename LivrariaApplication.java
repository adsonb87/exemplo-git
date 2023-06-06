import java.util.Scanner;

public class LivrariaApplication{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nome: ");
        String text = scan.nextLine();
        System.out.println("Idade: ");
        Integer idade = scan.nextInt();
        scan.close();

        System.out.println("Hello " + text + " !!");

        if(idade >= 18){
            System.out.println("Você é maior de idade !!!");
        }else{
            System.out.println("Você é menor de idade !!!");
        }
        
    }

}