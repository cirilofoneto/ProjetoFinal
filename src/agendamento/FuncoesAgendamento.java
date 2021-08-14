package agendamento;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.source.doctree.VersionTree;

public class FuncoesAgendamento {
	
	

	// Aqui devem ser criadas as funções utilizadas no arquivo SistemaAgendamento

	public static boolean login(String login, String senha) {

		String login1 = "teste";
		String senha1 = "123";

		if (login.equalsIgnoreCase("teste") && senha.equalsIgnoreCase("123")) {
			return true;
		} else {
			return false;

		}
	}
	
	public static void exibirMenu() {
	
		System.out.println("1 - Digite agenda do dia");
		System.out.println("2 - Confirma Agendamento");
		System.out.println("3 - Exibir agenda completa");
		System.out.println("4 - Sair");
		
	}
	public static void inserirHorario(String vetHorario[]) {
		Scanner pega = new Scanner(System.in);
		int giro = 1;
		String horario;
		
		
		
		for(int cont = 0; cont<vetHorario.length; cont++) {
		System.out.println("Digite o " + giro + "º Horario");
		vetHorario[cont] = pega.next(); 
		giro++;
		}
	}
	public static void exibirAgenda(String vetHorario[]) {
		
		for(int cont = 0; cont<vetHorario.length; cont++) { 
			System.out.println("Horarios:  " + vetHorario[cont]);
		}
		
	}
	
	public static void agendar(String vetHorario[]){
	
			Scanner pega = new Scanner(System.in);

			
			for(int cont = 0; cont<vetHorario.length; cont++) {
				
				String confirmaHorario;
				System.out.println("Digite o Horario para consulta ");
				confirmaHorario = pega.next();
				
				
				if(confirmaHorario.equalsIgnoreCase(confirmaHorario)) {
					System.out.println("Horario Disponivel! \n");
					
					//System.out.println("Digite nome do Cliente é confirma novamente o horario: ");
					vetHorario[cont] = JOptionPane.showInputDialog("Confirma Horario e nome do cliente");
					
					
					cont = vetHorario.length;
					
					pega.nextLine();
					
				}
				else { 
				 System.out.println("Horario Preenchido");
				}
				
			}
	}
	
	
	
	
}
