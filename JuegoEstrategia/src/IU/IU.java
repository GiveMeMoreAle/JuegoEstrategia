package IU;

public class IU {

	public static void listaOrdenada(String... elementos) {
		for(int i = 1; i <= elementos.length; i++) {
			System.out.println(" " + i + ". " + elementos[i - 1]);
		}
		
		System.out.println();
	}
	
}
