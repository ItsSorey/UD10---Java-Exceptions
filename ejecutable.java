package excepciones;

import java.util.Scanner;

public class ejecutable {
	public static void main(String [] args) {
		int longitud;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Tamaño del Array?:");
		password[] passwords=new password[teclat.nextInt()];
		
		System.out.println("Longitud de la contraseña?:");
		longitud=teclat.nextInt();
		
		boolean[] booleanos = new boolean[passwords.length];
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]=new password(longitud); //crea la contraseña con la longitud dada dentro del array passwords
			booleanos[i]=passwords[i].esFuerte();
			
			passwords[i].mostrarContraseña(); //mostramos la contraseña
			System.out.println(booleanos[i]); //mostramos si es fuerte o no
	    }
		teclat.close();
	}
}
