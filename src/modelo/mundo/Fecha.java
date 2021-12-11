package modelo.mundo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	//Constructor
	public Fecha (int pDia, int pMes, int pAnio) {
		dia = pDia;
		mes = pMes;
		anio = pAnio;
	}
	/*public Fecha () {

		dia= 0;
		mes= 0;
		anio= 0;
	}*/
	//Metodos analizadores getters
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}

	//Metodos funcionales
	//fecha1 23/04/2000   fecha2 15/08/2008
	public int darDiferenciaEnMeses (Fecha pFecha) {
		int numeroMeses = 0;
		int difAnios =  pFecha.getAnio();
		int difMes = pFecha.getMes( );
        int difDia = pFecha.getDia( );

		numeroMeses = 12 * (difAnios - anio) + (difMes - mes);
		if(difDia < dia ) {
			numeroMeses --;
		}
			
		return numeroMeses;
	}


	//Formato Fecha dd-mm--aaaa || dd/mm/aaaa || aaaa-mm-dd
	//dd-mm-aaaa
	public String toString() {
		return dia + "-"  + mes +"-" + anio;
	}

}
