package IU;


public class Msg {

	/*
	 *      ____      __          _                      
	 *     | __ )    /_/_   ___  (_)   ___    ___    ___ 
	 *     |  _ \   / _` | / __| | |  / __|  / _ \  / __|
	 *     | |_) | | (_| | \__ \ | | | (__  | (_) | \__ \
	 *     |____/   \__,_| |___/ |_|  \___|  \___/  |___/
	 *                                                   
	 */

	public static void simple(String msg) {
		System.out.println(" " + msg + "\n");
	}

	public static void error(String msg) {
		System.out.println(" " + Icono.ERROR + " Error: " + msg + "\n");
	}

	public static void advertencia(String msg) {
		System.out.println(" " + Icono.ADVERTENCIA + " Advertencia: " + msg + "\n");
	}

	public static void exito(String msg) {
		System.out.println(" " + Icono.EXITO + " Éxito: " + msg + "\n");
	}

	public static void info(String msg) {
		System.out.println(" " + Icono.INFO + " " + msg + "\n");
	}

	public static void conversacion(String personaje, String msg) {
		System.out.println(" " + Icono.CONVERSACION + " " + personaje + ": " + msg + "\n");
	}

	/*
	 *         _                    _                              
	 *        / \      ___    ___  (_)   ___    _ __     ___   ___ 
	 *       / _ \    / __|  / __| | |  / _ \  | '_ \   / _ \ / __|
	 *      / ___ \  | (__  | (__  | | | (_) | | | | | |  __/ \__ \
	 *     /_/   \_\  \___|  \___| |_|  \___/  |_| |_|  \___| |___/
	 *                                                             
	 */

	public static void construir(String estructura) {
		System.out.println(" " + Icono.CONSTRUIR + " Construyendo " + estructura + "...\n");
	}

	public static void recolectar(String recurso) {
		String icono = "";
		
		switch(recurso.toLowerCase()) {
		case "madera":
			icono = Icono.MADERA;
			break;
		case "comida":
			icono = Icono.COMIDA;
			break;
		case "piedra":
			icono = Icono.PIEDRA;
			break;
		case "oro":
			icono = Icono.ORO;
			break;
		case "gemas":
			icono = Icono.GEMAS;
			break;
		default:
			icono = Icono.RECURSO_POR_DEFECTO;
			break;
		}
		
		System.out.println(" " + icono + " Recolectando " + recurso + "...\n");
	}

	/*
	 *      ____                   _     _       _         
	 *     |  _ \    __ _   _ __  | |_  (_)   __| |   __ _ 
	 *     | |_) |  / _` | | '__| | __| | |  / _` |  / _` |
	 *     |  __/  | (_| | | |    | |_  | | | (_| | | (_| |
	 *     |_|      \__,_| |_|     \__| |_|  \__,_|  \__,_|
	 *                                                     
	 */


	public static void victoria() {
		System.out.println(" " + Icono.VICTORIA + " ¡VICTORIA! ¡Has vencido!\n");
	}

	public static void derrota(String nombre) {
		System.out.println(" " + Icono.DERROTA + " ¡DERROTA! Has sido derrotado por " + nombre + ".\n");
	}

}
