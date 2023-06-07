package conta.controller;

import java.util.ArrayList;
import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	private ArrayList <Conta> listacontas = new ArrayList <Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		if (conta != null) 
		conta.visualizar();
		else System.out.println("\nA Conta numero : " + numero + " não foi encontrada!");
		
	}

	@Override
	public void listarTodas() {
		for(var conta: listacontas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listacontas.add(conta);
		System.out.println("\nA Conta Numero :" + conta.getNumero() + " Foi Criada Com Sucesso!!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarconta = buscarNaCollection(conta.getNumero());
		
		if(buscarconta != null) {
			listacontas.set(listacontas.indexOf(buscarconta), conta);
			System.out.println("\nA Conta Numero :" + conta.getNumero() + " Foi Atualizada Com Sucesso!!");
		} else System.out.println("\nA Conta Numero :" + conta.getNumero() + " Não Foi Encontrada!!");
	}

	@Override
	public void deletar(int numero) {
		var Conta = buscarNaCollection(numero);

		if (Conta != null) {
			if(listacontas.remove(Conta) == true)
			System.out.println("\nA Conta Numero :" + numero + " Foi Deletada Com Sucesso!!");
		} else
			System.out.println("\nA Conta Numero :" + numero + " Não Foi Encontrada!!");
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	} 	public Conta buscarNaCollection(int numero) {
	    for (var conta : listacontas) {
	        if (conta.getNumero() == numero) {
	            return conta;
	        }
	    }
	    return null;
	}	public int retornaTipo (int numero) {
	    for (var conta : listacontas) {
	        if (conta.getNumero() == numero) {
	            return conta.getTipo();
	        }
	    }
	    return 0;
	}
	
	public int gerarNumero () {
		return ++ numero;
	}
}
