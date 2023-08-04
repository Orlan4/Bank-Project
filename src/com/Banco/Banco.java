package com.Banco;

public class Banco {
	private float valorTotal;
	private Accoes accao;
	private Cliente usuario;

	
	public Banco() {
		this.valorTotal = 0;

	}

	public Banco(Accoes accao, Cliente usuario) {
		this.accao = accao;
		this.usuario = usuario;
	}

	public Banco(float valorTotal) {
		this.valorTotal = valorTotal;

	}

	public void setUsusario(Cliente Usuario) {
		usuario = Usuario;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setAccao(Accoes accao) {
		this.accao = accao;
	}

	public Accoes getAccao() {
		return this.accao;
	}

	public void addValortotal() {
		valorTotal += Accoes.getRecebeSaldo();
	}

	public float getValorTotal() {
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Banco [valorTotal=" + valorTotal + ", accao=" + accao + ", usuario=" + usuario + "]";
	}

	public void Status() {
		System.out.println("Saldo do Banco::" + getValorTotal());
	
	}
}