package agregacao;

public class Projeto {

	private String nome;
	private Projetista[] projetistas;

	public Projeto(String nome) {
		this.nome = nome;
		this.projetistas = new Projetista[3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Projetista[] getProjetistas() {
		return projetistas;
	}

	public void setProjetistas(Projetista[] projetistas) {
		this.projetistas = projetistas;
	}
}
