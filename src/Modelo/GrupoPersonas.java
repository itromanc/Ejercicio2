package Modelo;

public class GrupoPersonas {
	private BeanPersona todasLasPersonas[];
	private int mayoresEdad,menoresEdad,hombresMayores,mujeresMenores;
	private double porcentajeMayores,porcentajeMujeres;
	public GrupoPersonas() {
		
	}
	public GrupoPersonas(BeanPersona[] todasLasPersonas, int mayoresEdad, int menoresEdad, int hombresMayores,
			int mujeresMenores, double porcentajeMayores, double porcentajeMujeres) {
		super();
		this.todasLasPersonas = todasLasPersonas;
		this.mayoresEdad = mayoresEdad;
		this.menoresEdad = menoresEdad;
		this.hombresMayores = hombresMayores;
		this.mujeresMenores = mujeresMenores;
		this.porcentajeMayores = porcentajeMayores;
		this.porcentajeMujeres = porcentajeMujeres;
	}
	public BeanPersona[] getTodasLasPersonas() {
		return todasLasPersonas;
	}
	public void setTodasLasPersonas(BeanPersona[] todasLasPersonas) {
		this.todasLasPersonas = todasLasPersonas;
	}
	public int getMayoresEdad() {
		return mayoresEdad;
	}
	public void setMayoresEdad(int mayoresEdad) {
		this.mayoresEdad = mayoresEdad;
	}
	public int getMenoresEdad() {
		return menoresEdad;
	}
	public void setMenoresEdad(int menoresEdad) {
		this.menoresEdad = menoresEdad;
	}
	public int getHombresMayores() {
		return hombresMayores;
	}
	public void setHombresMayores(int hombresMayores) {
		this.hombresMayores = hombresMayores;
	}
	public int getMujeresMenores() {
		return mujeresMenores;
	}
	public void setMujeresMenores(int mujeresMenores) {
		this.mujeresMenores = mujeresMenores;
	}
	public double getPorcentajeMayores() {
		return porcentajeMayores;
	}
	public void setPorcentajeMayores(double porcentajeMayores) {
		this.porcentajeMayores = porcentajeMayores;
	}
	public double getPorcentajeMujeres() {
		return porcentajeMujeres;
	}
	public void setPorcentajeMujeres(double porcentajeMujeres) {
		this.porcentajeMujeres = porcentajeMujeres;
	}
	
}
