package edu.abdiel.segundasemana;

public class Operadores {
	public static void main(String[] args) {
//		String nomeCompleto = "LINGUAGEM" + "JAVA";
//		System.out.println(nomeCompleto);
		
//		aula 2 Operadores
		
//		String concatenacao = "?";
//		
//		System.out.println(concatenacao);
//		
//		concatenacao = 1+1+1+"1";
//		
//		System.out.println(concatenacao);
//		
//		concatenacao = 1+"1"+1+1;
//		
//		System.out.println(concatenacao);
//		
//		concatenacao = 1+"1"+1+"1";
//		
//		System.out.println(concatenacao);
//		
//		concatenacao = "1"+1+1+1;
//		
//		System.out.println(concatenacao);
//		
//		concatenacao = "1"+(1+1+1);
//		
//		System.out.println(concatenacao);
		
//		Aula3 Operadores
//		int numero = 5;
//		numero = - numero;
//		System.out.println(numero);
//		
//		System.out.println(- numero);
//		
//		
//		numero = numero * -1;
//		System.out.println(numero);
		
//		int numero = 5;
		
		//x repeticao
//		numero++;
		
		
		// Debug eclipse F11 para abrir o modo debug, F6 para ir linha por linha
//		System.out.println(numero ++);
//		System.out.println(++ numero);
//		System.out.println(numero);
		
//		System.out.println(numero --);
//		System.out.println(numero);
		
//		boolean variavel = true;
		
//		variavel = !variavel;
		
		//System.out.println(!variavel);
//		System.out.println(variavel);
		

//		int a, b;
		
//		a = 5;
//		b = 6;
//		String resultado = a == b ? "verdadeiro" : "falso";
//		int resultado = a == b ? 1 : 0;
//		System.out.println(resultado);

//		if (a == b)
//			resultado = "verdadeiro";
//		else
//			resultado = "falso";
//		System.out.println(resultado);
		
		/*

		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm é diferente a de numeroDois? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm é maior que numeroDois? " + simNao);
		
		
		
		if (numero1 > numero2)
			System.out.println("Numero 1 maior que numero 2");
		
		
//		if (numero1 < numero2) {
		if (numero1 == numero2) {
			System.out.println("a nossa condição é verdadeira");	
		}
		
		
//		 * - comentarios 
//		 * Classe String - Funcionario - Cliente 
//		e a gente quer comparar se duas informações( dois objetos
//		sao iguais
		
		String nomeUm = "ABDIEL";
		String nomeDois = new String("ABDIEL");
		
		System.out.println(nomeUm.equals(nomeDois));
		
		*/
		boolean condicao1 = true;
		
		boolean condicao2 = true;
		
//		if (condicao1 && condicao2) {
		if (condicao1 && (7 > 4)) {
			System.out.println("as duas condições são verdadeiras");
		}
		
		if (condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}
		
		System.out.println("fim");
	}

}
