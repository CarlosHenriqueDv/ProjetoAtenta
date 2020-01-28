package br.atenta.bean;

public class Trabalhador extends Pessoa{
	
	private int matriculaTrabalhador;
	private double remuneracao;
	
	
	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public int getMatriculaTrabalhador() {
		return matriculaTrabalhador;
	}

	public void setMatriculaTrabalhador(int matriculaTrabalhador) {
		this.matriculaTrabalhador = matriculaTrabalhador;
	}
	

	

}
