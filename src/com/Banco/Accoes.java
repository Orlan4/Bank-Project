package com.Banco;

public class Accoes {

	private double saldo;
	private Cliente cliente;
	private static double recebeSaldo;

	public Accoes() {
		recebeSaldo = 0;
		this.saldo = 0;
	}

	public Accoes(double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
		recebeSaldo +=saldo;
	}

	public static double getRecebeSaldo() {
		return recebeSaldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
		//recebeSaldo += valor;
	}

	public void retirar(double valor) {
		saldo -= valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Accoes [saldo=" + saldo + "]";
	}

	public void Status() {
		System.out.println("Saldo:" + getSaldo());
	}

}
