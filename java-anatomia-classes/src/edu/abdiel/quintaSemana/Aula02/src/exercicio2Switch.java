import java.util.Scanner;

public class exercicio2Switch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valorVariavel = leitor.nextInt();

        switch(valorVariavel){
            case 1:
                System.out.println("Certo");
            case 2:
                System.out.println("Certo");
            case 3:
                System.out.println("Certo");
            case 4:
                System.out.println("Errado");
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor indefinido");
        }

        leitor.close();
    }
    
}
