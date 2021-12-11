
package modelo.mundo;

import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

public class Principal {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//Empleado empleado1;
		Empleado empleado1 = null;

		String nombreEmple;
		String apellidoEmple;
		int genero; // 1 Femenino || 2 Masculino
		String imagen;
		double salario;
		int dia, mes ,anio;
		Fecha fechaNac;
		Fecha fechaIngreso;

		// OPCIONES DEL SISTEMA

		Scanner sn = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("***************************************************************");
			System.out.println("|                      MENU PRINCIPAL                         |");
			System.out.println("|               ESCOJA UNA OPCION DEL 1 AL 6                  |");
			System.out.println("***************************************************************");
			System.out.println("|	1. Ingrese datos del empleado.                        |");
			System.out.println("|	2. Calcular la edad del empleado                      |");
			System.out.println("|	3. Calcular la antigüedad del empleado en la empresa  |");
			System.out.println("|	4. Calcular las prestaciones del empleado.            |");
			System.out.println("|	5. Visualizar la información del empleado             |");
			System.out.println("|	6. SALIR                                              |");
			System.out.println("***************************************************************");
			try {
				System.out.println("\nEscoja una de las opciones: ");
				opcion = sn.nextInt();
			}
			catch(InputMismatchException e) { 
				System.out.println("Ingresar solo numeros");
				opcion=6;
				e.printStackTrace();
			}

			switch(opcion){
			case 1:
				System.out.println("*****************************************************");
				System.out.println("|                    BIENVENIDO                     |");
				System.out.println("*****************************************************");
				System.out.println("|Ingrese su Nombre:                                 |");
				nombreEmple= entrada.nextLine();
				System.out.println("|Ingrese su Apellido:                               |");
				apellidoEmple= entrada.nextLine();
				System.out.println("|Ingrese su Imagen:                                 |");
				imagen= entrada.nextLine();

				do {
					try {
						System.out.println("|Ingrese Genero (1-Femenino, 2-Masculino):          |");
						//Colocar while
						genero= entrada.nextInt();

					}
					catch(InputMismatchException e) {
						System.out.println("Debe ingresar solo números ");
						genero = 0;
						//genero= scanner.nextInt();
						//e.printStackTrace();
						entrada.nextInt();
					}
				}while (genero<1 || genero>2);

				do {
					try {
						System.out.println("|Ingrese su Salario entre: |300|-|500|              |");
						salario = entrada.nextDouble();
					}
					catch(InputMismatchException e) {
						System.out.println("Ingrese el salario correcto: ");
						salario = 0;
						e.printStackTrace();	
					}
				}while (salario<300 || salario>500);

				do {
					System.out.println("|Ingrese su Dia de Nacimiento: |01|-|31|            |");
					dia = entrada.nextInt();
				}while (dia<01 || dia>31);

				do {
					System.out.println("|Ingrese su Mes |NUMERO| de Nacimiento: |01|-|12|   |");
					mes = entrada.nextInt();
				}while (mes<01 || mes>12);

				do {
					System.out.println("|Ingrese su Año de Nacimiento:|2000|-|2021|         |");
					anio = entrada.nextInt();
					fechaNac= new Fecha (dia, mes,anio);
				}while (anio<2000 || anio>2021);

				do {
					System.out.println("|Ingrese Dia de ingreso a la empresa: |01|-|31|     |");
					dia = entrada.nextInt();	
				}while (dia<01 || dia>31);

				do {
					System.out.println("|Ingrese Mes de ingreso a la empresa: |01|-|12|     |");
					mes = entrada.nextInt();	
				}while (mes<01 || mes>12);

				do {

					System.out.println("|Ingrese Año de ingreso a la empresa: |2000|-|2021| |");
					anio = entrada.nextInt();
				}while (anio<2000 || anio>2021);

				fechaIngreso= new Fecha (dia, mes,anio);
				empleado1=new Empleado(nombreEmple, apellidoEmple, genero,imagen, salario, fechaNac, fechaIngreso);
				break;

			case 2:
				System.out.println("*****************************************************");
				System.out.println("|                EDAD DEL EMPLEADO                  |");
				System.out.println("*****************************************************");
				System.out.println("Su edad es:" +empleado1.calcularEdad());
				break;

			case 3:
				System.out.println("*****************************************************");
				System.out.println("|            ANTIGUEDAD DEL EMPLEADO                |");
				System.out.println("*****************************************************");
				System.out.println("Su antiguedad en la empresa es:" +empleado1.calcularAntiguedad());
				break;

			case 4:
				System.out.println("*****************************************************");
				System.out.println("|          PRESTACIONES DEL EMPLEADO                |");
				System.out.println("*****************************************************");
				System.out.println("Sus prestaciones son:" +empleado1.calcularPrestaciones());
				break;

			case 5:
				System.out.println("*****************************************************");
				System.out.println("|           INFORMACION DEL EMPLEADO                |");
				System.out.println("*****************************************************");
				empleado1.mostrarInformaicón();
				break;

			case 6:
				System.out.println("*****************************************************");
				System.out.println("|              GRACIAS POR SU VISITA                |");
				System.out.println("*****************************************************");
				break;

			default:
				System.out.println("*****************************************************");
				System.out.println("|                OPCION INCORRECTA                  |");
				System.out.println("|         INGRESE UNA OPCION ENTRE 1 Y 6            |");
				System.out.println("*****************************************************");
			}
		}while(opcion!=6);

	}	
}
