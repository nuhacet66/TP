package finca;

public class Finca {
	
	    private String nombre; // nombre de la finca
	    private String tipo;   // tipo de la finca: "Vivienda", "Local", "Garaje" o "Trastero"
	    private double cuota;  // cuota de participaci�n

	    /**
	     * Constructor al que se le pasa el nombre, 
	     * el tipo de finca y la cuota de participaci�n
	     * 
	     * @param nombre, nombre de la finca
	     * @param tipo, tipo de la finca
	     * @param cuota, cuota de participaci�n
	     */ 
	    public Finca(String nombre, String tipo, double cuota) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.cuota = cuota;
	    }

	    /**
	     * Devuelve el nombre de la finca
	     * 
	     * @return nombre de la finca
	     */ 
	    public String getNombre() { 
	        return nombre;
	    }

	    /**
	     * Devuelve el nombre el tipo de la finca
	     * 
	     * @return tipo de la finca
	     */ 
	    public String getTipo() {
	        return tipo;
	    }

	    /**
	     * Devuelve la cuota de participaci�n de la finca
	     * 
	     * @return cuota de participaci�n
	     */ 
	    public double getCuota() {
	        return cuota;
	    }

	    /**
	     * @return String con la concatenaci�n entre corchetes del nombre, 
	     * el tipo y la cuota de participaci�n.
	     */ 
	    public String toString() { 
	        return "[Nombre: " + nombre + " tipo: " + tipo + " cuota: " + cuota + "]";
	    }
	}


