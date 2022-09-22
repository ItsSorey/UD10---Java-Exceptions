package excepciones;

import java.security.SecureRandom;

public class password {
	//Atributos de la clase
	private int longitud;
	private String contrase�a;
	private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private StringBuilder sb = new StringBuilder();
	private SecureRandom random = new SecureRandom();
	boolean fuerte;
	
	public password() {//contrase�a por defecto
		this.longitud = 8;
		this.contrase�a = "1A3b5C7d";
	}
	
	public password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarPassword(longitud);
	}
	
	public String generarPassword(int longitud) {//generamos una contrase�a random con longitud definidos por nosotros
		for (int i = 0; i < longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
		return sb.toString();
	}
	
	public boolean esFuerte() {
		int mayus=0,minus=0,numeros=0;
		boolean esFuerte=false;
		String contrase�a = getcontrase�a(); //pillamos la contrase�a del objeto
		
		for (int i = 0; i < contrase�a.length(); i++) { 
			if (Character.isUpperCase(contrase�a.charAt(i))) { //calculamos las mayusculas que tiene la cadena
				mayus=mayus+1;
			}
			else if (Character.isLowerCase(contrase�a.charAt(i))) { //calculamos las minusculas que tiene la cadena
				minus=minus+1;
			}else if (Character.isDigit(contrase�a.charAt(i))) { //calculamos los numeros que tiene la cadena
				numeros=numeros+1;
			} 
		}
		/*System.out.println(mayus);
		System.out.println(minus);
		System.out.println(numeros);*/ //Comprobaciones, funciona todo correctamente
		if(mayus>2 && minus>1 && numeros>5) { //si se cumplen todas las condiciones es una contrase�a fuerte
			esFuerte=true;
		}
		return esFuerte;
	}
	
	public int getLongitud() {return longitud;} //get Longitud
	public String getcontrase�a() {return contrase�a;} //get Contrase�a
	
	public void mostrarDatos() { //mostramos el default
		System.out.println("Longitud: "+ getLongitud()+
				"\nContrase�a: "+getcontrase�a());
	}
	
	public void mostrarContrase�a() { //mostramos el default
		System.out.println("Contrase�a: "+getcontrase�a());
	}
	
	public static void main(String[] args) {
		//Asignamos los valores que queremos
		int longitud=20;
		String contrase�a;
		//generamos una contrase�a default
		System.out.println("Contrase�a default");
		password kilian = new password();
		kilian.mostrarDatos();
		
		//generamos cotnrase�a random
		contrase�a=kilian.generarPassword(longitud); //asignamos la contrase�a a la generada aleatoriamente
		System.out.println("\n"+contrase�a); //mostramos la contrase�a
	 }
}
