package entregadores;

import java.util.Scanner;

public class FuncoesEntregadores {

	public static boolean login(String login, String senha) {

		String login1 = "teste";
		String senha1 = "123";
		double avaliacao = 0;

		if (login.equalsIgnoreCase("teste") && senha.equalsIgnoreCase("123")) {
			return true;
		} else {
			return false;

		}
	}

	public static void exibirMenu() {
		System.out.println("1 - Cadastrar Entregadores");
		System.out.println("2 - Alterar avaliaçao");
		System.out.println("3 - Entregador melhor avaliado");
		System.out.println("4 - Lista Entregadores");
		System.out.println("5 - Sair");

	}

	public static void cadastrarEntregador(String entregadoresNome[], String entregadoresTelefon[],
			double entregadoresAvaliacao[]) {

		Scanner pega = new Scanner(System.in);

		for (int cont = 0; cont < entregadoresNome.length; cont++) {
			System.out.println("Digite Nome do Entregador: ");
			entregadoresNome[cont] = pega.next();
			System.out.println("Digite Telefone do Entregador: ");
			entregadoresTelefon[cont] = pega.next();
			System.out.println("Digite avaliação do Entregador: ");
			entregadoresAvaliacao[cont] = pega.nextDouble();

		}
	}

	public static void alterarAvaliacao(String entregadoresNome[], double entregadoresAvaliacao[]) {
		Scanner pega = new Scanner(System.in);

		System.out.println("Digite nome do Entragador: ");
		String nome = pega.next();

		for (int cont = 0; cont < entregadoresNome.length; cont++) {
			if (nome.equalsIgnoreCase(entregadoresNome[cont])) {
				System.out.println("Entregador Encontrado: ");
				System.out.println("Qual nova avaliação do colaborador");
				entregadoresAvaliacao[cont] = pega.nextDouble();
				
				cont = entregadoresNome.length;
			} else {
				System.out.println("Entregador não encontrado");
			}
		}
	}

	public static void melhorAvaliado(String entregadoresNome[], String entregadoresTelefon[],
			double entregadoresAvaliacao[]) {
		
	
		
		
		

		for (int cont = 0; cont < entregadoresNome.length; cont++) {
			
			if (avaliacao < entregadoresAvaliacao[cont]) {
				double avaliacao = entregadoresAvaliacao[cont];
				System.out.println("Colaborador com Maior Nota: " + entregadoresAvaliacao[cont] + "Nome: " + entregadoresNome[cont]
						+ "Telefone: " + entregadoresTelefon[cont]);

			}


		}

	}
	public static void lista(String entregadoresNome[], String entregadoresTelefon[], double entregadoresAvaliacao[]) { 
		
			for(int cont = 0; cont<entregadoresNome.length; cont++) {
				System.out.println("Nome: "+ entregadoresNome[cont] + " Telefone: " + entregadoresTelefon[cont] + "Avaliaçao: " + entregadoresAvaliacao[cont]);
				
			}
		
		
	}

}
