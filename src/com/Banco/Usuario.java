package com.Banco;

import java.util.Scanner;

public class Usuario {
	private static Scanner ler;
	private static Scanner lerStr;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		lerStr = new Scanner(System.in);

		Cliente cliente1 = null;
		Accoes accao1 = null;
		Banco banco = null;

		// Classe Cliente
		System.out.println("***********Inscricao**********");
		System.out.println("");

		System.out.println("Insira o ID");
		int id = ler.nextInt();

		System.out.println("Insira o Nome");
		String nome = lerStr.nextLine();

		System.out.println("Insira o Idade");
		int idade = ler.nextInt();

		System.out.println("Insira o Numero");
		int numero = ler.nextInt();

		cliente1 = new Cliente(id, nome, idade, numero, accao1);

		System.out.println("");
		System.out.println("*******Fim da Inscricao*******");
		System.out.println("");

		// Classe Accoes
		System.out.println("*************Accao Deposito************");

		System.out.println("Deposite o primeiro valor");
		double deposito = ler.nextDouble();
		accao1 = new Accoes(deposito, cliente1);
		
		banco = new Banco(accao1, cliente1);

		System.out.println("");
		System.out.println("***********Administrador*******");
		System.out.println("");

		

		cliente1.Status();
		accao1.Status();
		banco.Status();

		System.out.println("");
		System.out.println("**********Accao Levantamento*************");
		System.out.println("Levante o primeiro valor");
		accao1.retirar(ler.nextDouble());
		System.out.println("");
		System.out.println("***********Administrador*******");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		cliente1.Status();
		accao1.Status();
		banco.Status();

		System.out.println("***********Fim do teste Alpha*************");
		System.out.println("Volte Sempre");

		cliente1.setAccao(accao1);
		accao1.setCliente(cliente1);
		banco.setUsusario(cliente1);
		banco.setAccao(accao1);

		ler.close();
		lerStr.close();

	}
}
