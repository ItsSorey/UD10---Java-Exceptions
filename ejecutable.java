package excepciones;

import java.util.Scanner;

public class ejecutable {
	public static void main(String [] args) {
		int longitud;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Tama�o del Array?:");
		password[] passwords=new password[teclat.nextInt()];
		
		System.out.println("Longitud de la contrase�a?:");
		longitud=teclat.nextInt();
		
		boolean[] booleanos = new boolean[passwords.length];
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]=new password(longitud); //crea la contrase�a con la longitud dada dentro del array passwords
			booleanos[i]=passwords[i].esFuerte();
			
			passwords[i].mostrarContrase�a(); //mostramos la contrase�a
			System.out.println(booleanos[i]); //mostramos si es fuerte o no
	    }
		teclat.close();
	}
}
