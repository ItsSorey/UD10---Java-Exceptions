package excepciones;

import java.security.SecureRandom;

public class password {
	//Atributos de la clase
	private int longitud;
	private String contraseña;
	private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private StringBuilder sb = new StringBuilder();
	private SecureRandom random = new SecureRandom();
	boolean fuerte;
	
	public password() {//contraseña por defecto
		this.longitud = 8;
		this.contraseña = "1A3b5C7d";
	}
	
	public password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	public String generarPassword(int longitud) {//generamos una contraseña random con longitud definidos por nosotros
		for (int i = 0; i < longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
		return sb.toString();
	}
	
	public boolean esFuerte() {
		int mayus=0,minus=0,numeros=0;
		boolean esFuerte=false;
		String contraseña = getcontraseña(); //pillamos la contraseña del objeto
		
		for (int i = 0; i < contraseña.length(); i++) { 
			if (Character.isUpperCase(contraseña.charAt(i))) { //calculamos las mayusculas que tiene la cadena
				mayus=mayus+1;
			}
			else if (Character.isLowerCase(contraseña.charAt(i))) { //calculamos las minusculas que tiene la cadena
				minus=minus+1;
			}else if (Character.isDigit(contraseña.charAt(i))) { //calculamos los numeros que tiene la cadena
				numeros=numeros+1;
			} 
		}
		/*System.out.println(mayus);
		System.out.println(minus);
		System.out.println(numeros);*/ //Comprobaciones, funciona todo correctamente
		if(mayus>2 && minus>1 && numeros>5) { //si se cumplen todas las condiciones es una contraseña fuerte
			esFuerte=true;
		}
		return esFuerte;
	}
	
	public int getLongitud() {return longitud;} //get Longitud
	public String getcontraseña() {return contraseña;} //get Contraseña
	
	public void mostrarDatos() { //mostramos el default
		System.out.println("Longitud: "+ getLongitud()+
				"\nContraseña: "+getcontraseña());
	}
	
	public void mostrarContraseña() { //mostramos el default
		System.out.println("Contraseña: "+getcontraseña());
	}
	
	public static void main(String[] args) {
		//Asignamos los valores que queremos
		int longitud=20;
		String contraseña;
		//generamos una contraseña default
		System.out.println("Contraseña default");
		password kilian = new password();
		kilian.mostrarDatos();
		
		//generamos cotnraseña random
		contraseña=kilian.generarPassword(longitud); //asignamos la contraseña a la generada aleatoriamente
		System.out.println("\n"+contraseña); //mostramos la contraseña
	 }
}
