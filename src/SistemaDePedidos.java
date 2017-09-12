import java.util.*;

public class SistemaDePedidos {

	public static void main(String[] args) {
		Restaurante rest1 = new Restaurante();
		
		System.out.println("Gerando os Pratos: ");
		rest1.geraPrato();
		
		System.out.println("Gerando Cardápio: \n");
		rest1.mostrarCardapio();

	}

}
