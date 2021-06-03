package examen;

import java.util.Scanner;

public class GestionVacunas {

public static void main(String[] args) {
	
	String nombre,dni,nv="",v1="",v2="",d1="",d2="";

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduzca el nombre del paciente:");
	nombre = teclado.next();
	System.out.println("Introduzca el dni del paciente:");
	dni = teclado.next();
	System.out.println("¿Vacuna 1 o 2?");
	nv = teclado.next();
	
	if(nv.equals("1")) {
		System.out.println("Introduzca la vacuna 1: ");
		v1 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 1:");
		d1 = teclado.next();
		
	}else if(nv.equals("2")) {
		
		System.out.println("Introduzca la vacuna 2: ");
		v2 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 2:");
		d2 = teclado.next();
		
	}else {
		System.out.println("Error");
	}
					
	datos_info(nombre, dni, v1, v2, d1, d2);
	
	if_vacunacion(nombre, v1, v2);		
	}












public static void datos_info(String nombre, String dni, String v1, String v2, String d1, String d2) {
	System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
	System.out.println("Vacuna 1 "+ v1 +" Fecha:"+d1);
	System.out.println("Vacuna 2 "+ v2 +" Fecha:"+d2);
}




public static void if_vacunacion(String nombre, String v1, String v2) {
	if(v2.equals("")) {
		if(v1.equals("Moderna")) {
			System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
		}else if(v1.equals("Pfizer")) {
			System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
		}else if(v1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		}else {
			System.out.println("El paciente "+ nombre + " está ya vacunado ");
		}
	}
}
}