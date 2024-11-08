package Controlador;

import Modelo.BeanPersona;
import Modelo.GrupoPersonas;
import Modelo.Sexo;
import Vista.MostrarResultados;

public class ManejadorDatos {
	private GrupoPersonas grupoPersonas;

	public ManejadorDatos() {
		grupoPersonas = new GrupoPersonas();
		LlenarGrupo();
		CalcularCantidadesPorcentajes();
		MostrarResultados.Resultados(grupoPersonas);
	}

	public void LlenarGrupo() {
		grupoPersonas.setTodasLasPersonas(LectorPersonas.leerPersonas());
	}

	public void CalcularCantidadesPorcentajes() {
		int totMayoresEdad = 0;
		int totMenores = 0;
		int totMascMayores = 0;
		int totFemMenores = 0;
		int totFem = 0;
		for (BeanPersona persona : grupoPersonas.getTodasLasPersonas()) {
			if (persona.getEdad() > 18) {
				totMayoresEdad++;
				if (persona.getSexo().equals(Sexo.HOMBRE)) {
					totMascMayores++;
				} else {
					totFem++;
				}
			} else {
				totMenores++;
				if (persona.getSexo().equals(Sexo.MUJER)) {
					totFemMenores++;
					totFem++;
				}
			}
		}
		grupoPersonas.setHombresMayores(totMascMayores);
		grupoPersonas.setMayoresEdad(totMayoresEdad);
		grupoPersonas.setMenoresEdad(totMenores);
		grupoPersonas.setMujeresMenores(totFemMenores);
		grupoPersonas.setPorcentajeMayores(((double)totMayoresEdad / grupoPersonas.getTodasLasPersonas().length)*100);
		grupoPersonas.setPorcentajeMujeres(((double)totFem / grupoPersonas.getTodasLasPersonas().length)*100);
	}
}
