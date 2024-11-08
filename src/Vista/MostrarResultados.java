package Vista;

import Modelo.GrupoPersonas;

public class MostrarResultados {
	public static void Resultados(GrupoPersonas grupoPersonas) {
		System.out.println(
				"a.	Cantidad de personas mayores de edad (18 años o más). " + grupoPersonas.getMayoresEdad());
		System.out.println("b.	Cantidad de personas menores de edad. " + grupoPersonas.getMenoresEdad());
		System.out.println("c.	Cantidad de personas masculinas mayores de edad. " + grupoPersonas.getHombresMayores());
		System.out.println("d.	Cantidad de personas femeninas menores de edad. " + grupoPersonas.getMujeresMenores());
		System.out.println("e.	Porcentaje que representan las personas mayores de edad respecto al total de personas. "
				+ grupoPersonas.getPorcentajeMayores());
		System.out.println("f.	Porcentaje que representan las mujeres respecto al total de personas."
				+ grupoPersonas.getPorcentajeMujeres());
	}
}
