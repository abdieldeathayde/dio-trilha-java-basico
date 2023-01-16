package ExerciciosMetodos;

import java.util.Scanner;

public class imprimirMensagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora do dia: ");
        int horaDoDia = scanner.nextInt();
        System.out.print("Digite o minuto do dia: ");
        int minutoDoDia = scanner.nextInt();

        if (horaDoDia >= 6 && horaDoDia <= 11 && minutoDoDia >= 0 && minutoDoDia <= 59){
            System.out.println("Manhã");
        } else if (horaDoDia >= 12 && horaDoDia <= 18 && minutoDoDia >= 0 && minutoDoDia <= 59){
            System.out.println("Tarde");
        } else if (horaDoDia >= 19 && horaDoDia <= 23 && minutoDoDia >= 0 && minutoDoDia <= 59){
            System.out.println("Noite");
        } else {
            System.out.println("Valor incorreto");
        }
        scanner.close();
    }
}
