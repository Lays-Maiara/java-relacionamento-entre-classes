package associacao;

public class Principal {

	public static void main(String[] args) {

		Departamento departamento = new Departamento();
		departamento.setNome("Tecnologia e Inova��o");

		Empregado empregado = new Empregado();
		empregado.setNome("Lays Maiara Assun��o Alves");
		empregado.setDepartamento(departamento);

		System.out.println(
				empregado.getNome() + " faz parte do departamento de " + empregado.getDepartamento().getNome());
	}

}
