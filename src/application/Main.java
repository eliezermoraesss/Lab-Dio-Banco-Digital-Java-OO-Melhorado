package application;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente eliezer = new Cliente();
		eliezer.setNome("Eliezer");
		
		Conta cc = new ContaCorrente(eliezer);
		Conta poupanca = new ContaPoupanca(eliezer);
		
		System.out.print("Qual o valor de depósito? ");
		double deposito = sc.nextDouble();
		cc.depositar(deposito);
		
		System.out.print("Qual valor deseja transferir para a poupança? ");
		double transferir = sc.nextDouble();
		cc.transferir(transferir, poupanca);
		System.out.println();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
