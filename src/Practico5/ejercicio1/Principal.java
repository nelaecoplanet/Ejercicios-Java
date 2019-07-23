package Practico5.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) throws Exception {
		/*Persona p1; //referencia
		p1 = new Persona(); //objeto
		p1.setNombre("Pepita Rodriguez");
		p1.setEdad(19);
		p1.setSexo(true);
		p1.setCi("242348234823");
		p1.imprimirPersona();*/

		//p1.edad = -3; //esto esta mal

		List<Persona> lpers = new ArrayList();


		boolean salir = false;
		while(!salir) {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1- Ingresar nueva persona");
			System.out.println("2- Buscar persona");
			System.out.println("3- Imprimir todas");
			System.out.println("4- Salir");

			Scanner entrada = new Scanner(System.in);
			String op = entrada.nextLine();

			switch (op) {
			case "1":
				//pedir CI
				//decir si existe
				//si no existe agregarPersona(ci);
				Persona p = agregarPersona();
				lpers.add(p);
				if (buscarPersonas (lpers, p.getCi()) == null){
					lpers.add(p);
				} else {
					System.out.println("La persona ya est'a en la lista");
				}//fin del else
				break;
				
			case "2":
				String ci = solicitarCi();
				Persona q = buscarPersonas (lpers, ci);
				if (q == null) {
					System.out.println("La persona no se encuentra en la lista");
				} else {
					q.imprimirPersona();
				}// fin del else
				break;
				
			case "3":
				//imprimir personas
				if (lpers.size() == 0) {
					System.out.println("No hay personas en la lista");
				} else {
					/*for (int i = 0; i < lpers.size(); i++) {
						lpers.get(i).imprimirPersona();*/
					for (Persona x:lpers) {
						x.imprimirPersona();
					}//fin del for
				}//fin del else
				break;
				
			case "4":
				System.out.println("Chau!");
				salir = true;
				break;
			default:
				System.out.println("No es una opcion correcta");
				break;
			}//fin del switch

		}//fin del while

	}// fin del main

	public static Persona agregarPersona() throws Exception {
		//Solicitudes
		
		String nombre = solicitarNombre();
		String ci = solicitarCi();
		int edad = solicitarEdad();
		boolean sexo = solicitarSexo();

		Persona p = new Persona(nombre, edad, sexo, ci);
		
		return p;
		
		//String Nombre = solicitarNombre();
		//String Ci = solicitarCi;
		//Persona p = new Persona ();
		//p.setNombre(Nombre);
		//p.setCi(solicitarCi());
		//p.setEdad(solicitarEdad());
		//p.setSexo(solicitarSexo());
		//

	}//fin de persona

	public static String solicitarCi() {
		boolean correcta = false;
		while(!correcta) {
			System.out.println("Por favor ingrese la CI");
			Scanner e = new Scanner(System.in);
			String ci = e.nextLine();

			if (Persona.validarCi(ci) && !ci.equals("")) {
				//e.close();
				return ci;
			} else {
				System.out.println("La ci no es correcta");
			}
			//e.close();
		}//fin del while

		return null;
	}

	public static String solicitarNombre() {
		System.out.println("Por favor ingrese Nombre");
		Scanner e = new Scanner(System.in);
		String nombre = e.nextLine();
		//e.close();
		return nombre;
		//ejercicio
	}//fin solicitarNombre


	public static int solicitarEdad() {
		boolean correcta = false;
		int edad = 0;
		String error = "";

		while (!correcta) {
			System.out.println("Por favor ingrese Edad");

			try {
				Scanner e = new Scanner(System.in);
				edad = e.nextInt();
				//e.close();
				return edad;
			} catch (Exception e2) {
				error = "La edad no es correcta " + e2;

			}//fin del catch

			if (error == "") {
				correcta = true;
			} else {
				System.out.println(error);
				error = "";
			}

		}//fin del while

		return edad;

	}//fin solicitarEdad

	public static boolean solicitarSexo() {
		boolean incorrecta = true;
		boolean sexo = false;
		while(incorrecta) {
			System.out.println("Digite la opcion deseada");
			System.out.println("1 - Femenino");
			System.out.println("2 - Masculino");
			Scanner dato = new Scanner(System.in);
			String op = dato.nextLine();
			switch (op) {
			case "1":
				sexo = true;
				incorrecta = false;
				break;
			case "2":
				incorrecta = false;
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}

		return sexo;
	}//fin de solicitar sexo
	
	public static Persona buscarPersonas (List<Persona> lpers, String ci) {
		for (Persona p:lpers) {
			if (p.getCi().equals(ci)){
				return p;
			} //fin del if
		}//fin del for
		return null;
	}//fin de buscarPersonas

}//fin de la clase