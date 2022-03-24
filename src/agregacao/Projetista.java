package agregacao;

public class Projetista {

	private String nome;
	private Projeto[] projetos;

	public Projetista(String nome) {
		this.nome = nome;
		this.projetos = new Projeto[3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Projeto[] getProjetos() {
		return projetos;
	}

	public void setProjetos(Projeto[] projetos) {
		this.projetos = projetos;
	}
}
