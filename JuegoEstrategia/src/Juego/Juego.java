package Juego;

import Estructuras.Casa;
import IU.Msg;
import Recursos.*;
import Unidades.Aldeano;

public class Juego {

	public void nuevo() {
		Msg.simple("¡Bienvenido/a a tu nueva aventura!");
		
		Reino reino = new Reino();
		
		Casa casa1 = new Casa();
		Casa casa2 = new Casa();
		
		Madera madera = new Madera();
		Comida comida = new Comida();
		Piedra piedra = new Piedra();
		Oro oro = new Oro();
		Gema gemas = new Gema();
	
		Aldeano aldeano = new Aldeano(reino);
		
		reino.agregarRecurso(madera, 140);
		reino.agregarRecurso(comida, 0);
		reino.agregarRecurso(piedra, 0);
		reino.agregarRecurso(oro, 0);
		reino.agregarRecurso(gemas, 0);
		
		reino.listarEstructuras();
		
		reino.listarRecursos();
		
		aldeano.construir(casa1);
		aldeano.construir(casa2);
		
		reino.listarEstructuras();
		
		reino.listarRecursos();
		
	}
	
}
