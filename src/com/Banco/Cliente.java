package com.Banco;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	private int numero;
	private Accoes accao;

	public Cliente() {
		this.id = 00;
		this.nome = "Nao definido";
		this.idade = 0;
		this.numero = 00000000;
	}

	public Cliente(int id, String nome, int idade, int numero, Accoes accao) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.numero = numero;
		this.accao = accao;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Accoes getAccao() {
		return accao;
	}

	public void setAccao(Accoes accao) {
		this.accao = accao;
	}

	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", numero=" + numero + ", accao=" + accao
				+ "]";
	}

	public void Status() {
		System.out.println("ID:" + getId());
		System.out.println("Nome:" + getIdade());
		System.out.println("Idade:" + getIdade());
		System.out.println("Numero:" + getNumero());
	}

}
