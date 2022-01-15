package finca;

import java.util.LinkedList;
import java.util.List;

public class Propietario {

	// Atributos
	private String nombre;
	private LinkedList<Finca> fincas = new LinkedList<>();

	public Propietario(String name) {
		nombre = name;
	}

	public String getNombre() {
		return nombre;
	}

	public void addFinca(Finca finca) {
		if (!repetido(finca)) {
			fincas.add(finca);
		}
	}

	public void removeFinca(String nombre) {
		for (int i = 0; i < fincas.size(); i++) {
			if (nombre == fincas.get(i).getNombre()) {
				fincas.remove(i);
			}
		}
	}

	public List<Finca> getFincas() {
		return fincas;
	}

	public double cuotaTotal() {
		double sumatorio = 0.0;
		for (int i = 0; i < fincas.size(); i++) {
			sumatorio += fincas.get(i).getCuota();
		}
		return sumatorio;
	}

	private boolean repetido(Finca finca) {
		for (int i = 0; i < fincas.size(); i++) {
			if (finca.equals(fincas.get(i))) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String result = getNombre() + ":" + cuotaTotal() + "\n";
		for (int i = 0; i < fincas.size(); i++) {
			if (i == fincas.size() - 1) { // ultima vuelta
				result += (i + 1) + ") " + fincas.get(i).toString();
				break;
			}
			result += (i + 1) + ") " + fincas.get(i).toString() + "\n";
		}
		return result;
	}

}