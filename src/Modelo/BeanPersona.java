package Modelo;

public class BeanPersona {
	private int edad;
	private Sexo sexo;

	public BeanPersona() {
		super();
	}

	public BeanPersona(int edad, Sexo sexo) {
		super();
		this.edad = edad;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "BeanPersona [edad=" + edad + ", sexo=" + sexo + "]";
	}

}
