package edu.abdiel.segundasemana;

public class MinhaClasse2 {
	public static void main(String[] args) {
		/*
		String meuNome = "Gleyson";
		
		int anoFabricacao = 2022;
		
		boolean verdadeira = true;
		
		anoFabricacao = 2018;
		*/
		String primeiroNome = "Abdiel";
		String segundoNome = "Athayde";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
