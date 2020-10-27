package negocio.beans;

public class Militar extends Pessoa {
	String matricula;
	
	//construtores
	public Militar(String cpf, String nome, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	//m�todos
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Militar [Nome=" +getNome()+" Matricula=" + matricula + "]";
	}
	
	
		
}