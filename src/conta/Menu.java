package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int opçao;
		
		while(true) {
			System.out.println(Cores.TEXT_CYAN  + Cores.ANSI_BLACK_BACKGROUND+"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			System.out.println();
		
		opçao = leia.nextInt();
		
		if(opçao == 9){
			System.out.println( Cores.TEXT_WHITE_BOLD +"\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			leia.close();
			System.exit(0);
		}		switch (opçao) {
		case 1: {
			System.out.println(Cores.TEXT_WHITE_BOLD + " Criar Conta\n\n");
			break;
		}
		case 2:{
			System.out.println(Cores.TEXT_WHITE_BOLD + " Listar todas as Contas\n ");
			break;
		}
		case 3:{
			System.out.println(Cores.TEXT_WHITE_BOLD + " Buscar Conta por Numero\n ");
			break;
		}
		case 4:{
			System.out.println(Cores.TEXT_WHITE_BOLD + " Atualizar Dados da Conta\n ");
			break;
		}
		case 5:{
			System.out.println(Cores.TEXT_WHITE_BOLD + " Apagar Conta\n ");
			break;
		}
		case 6:{
			System.out.println(Cores.TEXT_WHITE_BOLD + "  Sacar\n  ");
			break;
		}
		case 7:{
			System.out.println(Cores.TEXT_WHITE_BOLD + "  Depositar\n  ");
			break;
		}case 8:{
			System.out.println(Cores.TEXT_WHITE_BOLD + " Transferir valores entre Contas\n ");
			break;
		}
		
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
            break;}
		}

	}

}
