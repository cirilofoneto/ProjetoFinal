package agendamento;

import java.util.Scanner;

public class SistemaAgendamento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] agendamentos = new String[3];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema voc� deve informar seu usu�rio e sua senha");
		System.out.println("Digite seu usu�rio");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();

		
		if(FuncoesAgendamento.login(usuario, senha) == true){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usu�rio ou senha incorretos.");
			System.exit(1);
		}
		
	
		
		
		while(opcao != 4) {
			FuncoesAgendamento.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Digitar todos os 10 hor�rios de agendamento dispon�veis para o dia
				//Dentro do loop que solicita a digita��o de cada hor�rio, chamar a seguinte fun��o para cada hor�rio digitado

				FuncoesAgendamento.inserirHorario(agendamentos);
			
				
				break;
				
			case 2:
				//Digitar um hor�rio de agendamento desejado. Se estiver dispon�vel, solicitar o nome do cliente e substituir no vetor o hor�rio original por hor�rio + nome do cliente
				//Fazer a verifica��o com a seguinte funcao
				//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
				
				//Fazer a substitui��o com a seguinte fun��o
				FuncoesAgendamento.agendar(agendamentos);
				
				break;
				
			case 3:
				//Exibir a agenda completa
				FuncoesAgendamento.exibirAgenda(agendamentos);
				break;
			
			case 4:
				System.out.println("Obrigado por utilizar nossso programa de agendamento");
				break;
			default:
				//Mensagem de op��o inv�lida
				break;
				
			}
		}
	}

}
