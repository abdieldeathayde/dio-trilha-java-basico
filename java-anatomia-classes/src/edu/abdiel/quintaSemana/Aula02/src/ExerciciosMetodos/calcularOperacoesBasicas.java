package ExerciciosMetodos;

import java.util.Scanner;

public class calcularOperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a operação: ");
        String operacao = scanner.next();

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (operacao.equalsIgnoreCase("soma")){    
            soma(numero1, numero2);
        } else if (operacao.equalsIgnoreCase("multiplicação")){
            multiplicacao(numero1, numero2);
        } else if (operacao.equalsIgnoreCase("divisão")){
            divisao(numero1, numero2);
        } else if (operacao.equalsIgnoreCase("subtração")){
            subtracao(numero1, numero2);
        }
        scanner.close();
    }

    private static void soma(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);
    }

    private static void multiplicacao(int numero1, int numero2){
        int resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    private static void divisao(int numero1, int numero2){
        int resultado = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + resultado);
    }

    private static void subtracao(int numero1, int numero2){
        int resultado = numero1 - numero2;
        System.out.println("O resultado da divisão é: " + resultado);
    }
}
