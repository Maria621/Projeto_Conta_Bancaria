package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupança;

public class Menu {

	public static void main(String[] args) {
		//Teste da classe conta
		Conta c1 = new Conta(1,123,1,"Adriana",10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		//Teste da classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente (2,123,1,"Mariana",15000.0f,1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		//Teste da classe Conta Poupança
		ContaPoupança cp1 = new ContaPoupança (3,123,2,"Victor",100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
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
			System.out.println( Cores.TEXT_CYAN +"\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			leia.close();
			System.exit(0);
		}		switch (opçao) {
		case 1: {
			System.out.println(Cores.TEXT_CYAN + " Criar Conta\n\n");
			break;
		}
		case 2:{
			System.out.println(Cores.TEXT_CYAN + " Listar todas as Contas\n ");
			break;
		}
		case 3:{
			System.out.println(Cores.TEXT_CYAN + " Buscar Conta por Numero\n ");
			break;
		}
		case 4:{
			System.out.println(Cores.TEXT_CYAN + " Atualizar Dados da Conta\n ");
			break;
		}
		case 5:{
			System.out.println(Cores.TEXT_CYAN + " Apagar Conta\n ");
			break;
		}
		case 6:{
			System.out.println(Cores.TEXT_CYAN + "  Sacar\n  ");
			break;
		}
		case 7:{
			System.out.println(Cores.TEXT_CYAN + "  Depositar\n  ");
			break;
		}case 8:{
			System.out.println(Cores.TEXT_CYAN + " Transferir valores entre Contas\n ");
			break;
		}
		
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
            break;}
		}

	}

}
