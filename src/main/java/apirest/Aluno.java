package apirest;

public class Aluno extends Pessoa {

	Aluno(int id, String nome, int idade, String curso){
		super(nome, idade);
		setID(id);
		setCurso(curso);
	}

	
	private String curso;
	private int ID;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
}
