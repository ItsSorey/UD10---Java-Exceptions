package excepciones;

import java.util.Scanner;

public class ejecutable {
	public static void main(String [] args) {
		int longitud;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Tamaņo del Array?:");
		password[] passwords=new password[teclat.nextInt()];
		
		System.out.println("Longitud de la contraseņa?:");
		longitud=teclat.nextInt();
		
		boolean[] booleanos = new boolean[passwords.length];
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]=new password(longitud); //crea la contraseņa con la longitud dada dentro del array passwords
			booleanos[i]=passwords[i].esFuerte();
			
			passwords[i].mostrarContraseņa(); //mostramos la contraseņa
			System.out.println(booleanos[i]); //mostramos si es fuerte o no
	    }
		teclat.close();
	}
}
