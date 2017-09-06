
public class Restaurante {

	Prato pratos[] = new Prato[3];

	public void mostrarCardapio() {
		String mostra;
		for (int i = 0; i <= 2; i++) {
			mostra = pratos[i].getNome() + ": " + pratos[i].getPreco() + "\n" + pratos[i].getDescricao();
			System.out.println(mostra);

		}

	}

}
