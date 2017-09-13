import java.util.Scanner;

public class Pedido {
	Prato pratos[] = new Prato[3];
	private double valorTotal = 0;

	public void geraPrato() {
		for (int i = 0; i < pratos.length; i++) {
			System.out.println("Digite o nome do Prato: ");
			String nome = new Scanner(System.in).nextLine();
			System.out.println("Digite o preço do Prato: ");
			double preco = new Scanner(System.in).nextDouble();
			System.out.println("Digite a descrição do Prato: ");
			String descr = new Scanner(System.in).nextLine();
			pratos[i] = new Prato(nome, preco);
			pratos[i].setDescricao(descr);
			valorTotal += preco;
		}
	}

	public double getValorTotal() {
		return valorTotal;
	}

}
