package associacao;

public class Empregado {

	private String nome;
	private Departamento departamento;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

}
