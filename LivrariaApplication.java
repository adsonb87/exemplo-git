import java.util.Scanner;

public class LivrariaApplication{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Usuario usuario = new Usuario();

        System.out.println("nome: ");
        usuario.setNome(scan.nextLine());
        System.out.println("Idade: ");
        usuario.setIdade(scan.nextInt());
        

        System.out.println("Hello " + usuario.getNome() + " !!");

        if(usuario.getIdade() >= 18){
            System.out.println("Você é maior de idade !!!");
        }else{
            System.out.println("Você é menor de idade !!!");
        }
  
        scan.close();

    }

}