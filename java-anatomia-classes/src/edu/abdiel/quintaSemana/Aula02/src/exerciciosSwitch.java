import java.util.Scanner;

public class exerciciosSwitch {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia da semana: \n");
        String diaSemana = leitor.next();

        switch(diaSemana){
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;

            default:
                System.out.println("Dia indefinido");
        }

        leitor.close();
    }
    
}
