package br.atenta.bean;

public class Dependente extends Pessoa{

	private int matriculaDependente;
	private String parentesco;
	
	
	
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public int getMatriculaDependente() {
		return matriculaDependente;
	}

	public void setMatriculaDependente(int matriculaDependente) {
		this.matriculaDependente = matriculaDependente;
	}
	
	
	
}
