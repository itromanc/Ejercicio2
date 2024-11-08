package Controlador;

import Modelo.BeanPersona;
import Modelo.Sexo;

public class LectorPersonas {
	public static BeanPersona[] leerPersonas() {
		BeanPersona personas[] = new BeanPersona[50];
		// aqui voy a hacer que se llene el array para que pueda funcionar
		for (int a = 0; a < 10; a++) {
			personas[a] = new BeanPersona(10, Sexo.HOMBRE);
		}
		for (int b = 10; b < 20; b++) {
			personas[b] = new BeanPersona(25, Sexo.HOMBRE);
		}
		for (int c = 20; c < 30; c++) {
			personas[c] = new BeanPersona(5, Sexo.MUJER);
		}
		for (int d = 30; d < 50; d++) {
			personas[d] = new BeanPersona(30, Sexo.MUJER);
		}
		return personas;
	}
}
