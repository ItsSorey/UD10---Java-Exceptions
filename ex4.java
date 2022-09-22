package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		double num1;
		double num2;
		int menu=0;
		Scanner teclat = new Scanner(System.in);
		
		do {
			try { //indicamos un Menu al Usuario
				System.out.println("CALCULADORA \nELIGE FUNCION \n1.Suma 2.Resta 3.Multiplicacion 4.Potencia 5.Raíz cuadrada 6.Raíz cubica 7.División 8.Exit");
	        	menu = teclat.nextInt();
	        	
	        	if(menu<1||menu>8) { throw new miExcepcion(4);}//si el numero no está dentro del menu enseñamos una excepcion personalizada
			}catch (miExcepcion ex) {
	            System.out.println(ex.getMessage());
			}
			try {
				if (menu==1) {
					System.out.println("SUMA");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	System.out.println("Escribe un segundo numero:");
		        	num2 = teclat.nextDouble();
		        		        	
		        	System.out.println("Resultado: "+(num1+num2)+"\n"); //formula SUMA
		        	
				}else if (menu==2) {
					System.out.println("RESTA");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	System.out.println("Escribe un segundo numero:");
		        	num2 = teclat.nextDouble();
		        	
		        	System.out.println("Resultado: "+(num1-num2)+"\n"); //formula RESTA
		        	
				}else if (menu==3) {
					System.out.println("MULTIPLICACION");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	System.out.println("Escribe un segundo numero:");
		        	num2 = teclat.nextDouble();
		        	
		        	System.out.println("Resultado: "+(num1*num2)+"\n"); //formula MULTIPLICACION
		        	
				}else if (menu==4) {
					System.out.println("POTENCIA");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	System.out.println("Escribe un segundo numero:");
		        	num2 = teclat.nextDouble();
		        	
		        	System.out.println("Resultado: "+(Math.pow(num1, num2))+"\n"); //formula POTENCIA
		        	
				}else if (menu==5) {
					System.out.println("RAIZ CUADRADA");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	
		        	System.out.println("Resultado: "+Math.sqrt(num1)+"\n"); //formula RAIZ CUADRADA
		        	
				}else if (menu==6) {
					System.out.println("RAIZ CUBICA");
					System.out.println("Escribe un numero:");
		        	num1 = teclat.nextDouble();
		        	
		        	System.out.println("Resultado: "+Math.cbrt(num1)+"\n"); //formula RAIZ CUBICA
		        	
				}else if (menu==7) {
					System.out.println("DIVISOR");
					System.out.println("Escribe un numero:");
			        num1 = teclat.nextDouble();
			        System.out.println("Escribe un segundo numero:");
			        num2 = teclat.nextDouble();
			        
			        System.out.println("Resultado: "+(num1/num2)+"\n"); //formula DIVISOR
			        
				}else if (menu==8){
					System.out.println("Adios"); //Msg de Adiós al usuario
				}
			}catch (InputMismatchException excepcion) { //excepcion por si utiliza un caracter incorrecto (no sea numero)
				 System.out.println("No ha introducido un numero correcto");
                 teclat.next(); // limpiamos el buffer
			}
		}while (menu!=8);//8 = exit
        teclat.close(); //cerramos el teclado al acabar el programa
	}
}