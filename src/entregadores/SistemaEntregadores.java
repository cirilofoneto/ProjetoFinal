package entregadores;

import java.util.Scanner;

public class SistemaEntregadores {

	public static void main(String[] args) {
			
		int vetores = 2;
		
		Scanner leitor = new Scanner(System.in);
		String[] nomesEntregadores = new String[vetores];
		String[] telefonesEntregadores = new String[vetores];
		double[] avaliacoesEntregadores = new double[vetores];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema você deve informar seu usuário e sua senha");
		System.out.println("Digite seu usuário");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();

		if(FuncoesEntregadores.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usuário ou senha incorretos.");
			System.exit(1);
		}
		
		
		
		while(opcao!=5) {
			FuncoesEntregadores.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Cadastrar os 20 entregadores da plataforma, pela funcao.
				//Dentro do loop que solicita a digitação dos dados de cada entregador, chamar a funcao abaixo
				FuncoesEntregadores.cadastrarEntregador(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores);
				break;
				
			case 2:
				//Alterar a avaliação de um entregador pelo nome
				FuncoesEntregadores.alterarAvaliacao(nomesEntregadores, avaliacoesEntregadores);
				break;
				
			case 3:
				
				FuncoesEntregadores.melhorAvaliado(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores);
				break;
			case 4:
				FuncoesEntregadores.lista(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores);
				break;	
			case 5:
				System.out.println("Sair");
			default:
				System.out.println("Seleçao Invalida");
				break;
				
			}
			
		}

	}

}
