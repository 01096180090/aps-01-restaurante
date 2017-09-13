import java.util.Scanner;

public class Prato {
	private String nome, descricao;
	private double preco;
	private String legume = "legume", verdura = "verdura";
	


	public Prato(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		Ingrediente ingr = new Ingrediente(legume, verdura);
		System.out.println("Contém legume e verdura, escolha o terceiro ingrediente: \n1 - Acompanhamento\n2 - Tempero\n3 - Carne");
		int esc = new Scanner(System.in).nextInt();
		if (esc == 1)
			ingr.setAcompanhamento("Acompanhamento");
		else if (esc == 2)
			ingr.setTempero("Tempero");
		else if (esc == 3)
			ingr.setCarne("Carne");
		else
			System.out.println("Valor inválido");

	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}