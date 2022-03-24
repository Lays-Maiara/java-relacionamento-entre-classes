package agregacao;

public class Principal {

	public static void main(String[] args) {

		Projetista projetista1 = new Projetista("Roberta Farias");
		Projetista projetista2 = new Projetista("Carolina Dias Branco");
		Projetista projetista3 = new Projetista("Carlos Alberto de Nobrega");

		Projeto proj1 = new Projeto("Financeiro");
		Projeto proj2 = new Projeto("Recursos Humanos");
		Projeto proj3 = new Projeto("Tecnologia e Inovação");

		projetista1.getProjetos()[0] = proj1;

		projetista2.getProjetos()[0] = proj2;

		projetista3.getProjetos()[0] = proj3;

		projetista1.getProjetos()[1] = proj3;

		proj1.getProjetistas()[0] = projetista1;

		proj2.getProjetistas()[0] = projetista2;

		proj3.getProjetistas()[0] = projetista3;
		proj3.getProjetistas()[1] = projetista1;

		System.out.println("Projetista: " + projetista1.getNome());
		for (Projeto projeto : projetista1.getProjetos()) {
			if (projeto != null) {
				System.out.println("Projeto " + projeto.getNome());
			}
		}
		System.out.println("-----------------------------");

		System.out.println("Projeto: " + proj3.getNome());
		for (Projetista projetista : proj3.getProjetistas()) {
			if (projetista != null) {
				System.out.println("Projetista: " + projetista.getNome());
			}
		}
		System.out.println("-----------------------------");
	}
}
