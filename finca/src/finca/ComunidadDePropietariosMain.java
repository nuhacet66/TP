package finca;

public class ComunidadDePropietariosMain {

	/**
	 * Método main: ejecuta la aplicación usando tanto la interfaz de consola
	 */
	public static void main(String[] args) {
		Finca finca1 = new Finca("garage1", "garage", 0.0);
		Finca finca2 = new Finca("garage2", "garage", 0.0);
		Finca finca3 = new Finca("garage3", "garage", 0.0);
		Finca finca7 = new Finca("pozo1", "pozo", 0.0);
		Finca finca8 = new Finca("pozo2", "pozo", 0.0);
		Finca finca9 = new Finca("pozo3", "pozo", 0.0);
		Finca finca4 = new Finca("finca1", "finca", 0.0);
		Finca finca5 = new Finca("finca2", "finca", 0.0);
		Finca finca6 = new Finca("finca3", "finca", 0.0);

		Propietario p1 = new Propietario("juan");
		Propietario p2 = new Propietario("pepe");

		p1.addFinca(finca1);
		p1.addFinca(finca2);
		p1.addFinca(finca7);
		p1.addFinca(finca9);
		p1.addFinca(finca3);
		p1.addFinca(finca4);
		p1.addFinca(finca8);
		p1.addFinca(finca5);
		p1.addFinca(finca6);

		ComunidadDePropietarios cp = new ComunidadDePropietarios("cm", 0.0);

		cp.addPropietario(p1);
		cp.addPropietario(p2);
		

		System.out.println(cp.toString());
	}

}
