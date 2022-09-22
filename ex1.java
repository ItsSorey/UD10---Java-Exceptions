package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numeroRandom = (int) (Math.random() * 500);//numero random de 1-500
        int numero = 0;
        int intentos = 0;
        boolean leido;
        do {
            do {
            	//System.out.println(numeroRandom); //comprobaciones del programa
                System.out.println("Introduce un numero entre 1 y 500");
                try {
                    intentos++; //sumamos cada try
                    numero = teclat.nextInt();
                    System.out.println("Numero introducido: " + numero);
                    leido = true;
                } catch (InputMismatchException excepcion) { //excepcion
                    System.out.println("No ha introducido un numero entero");
                    teclat.next(); // limpiamos el buffer
                    leido = false;
                }
            } while (leido == false);//bucle hasta tener un numero correcto

            if (numero < numeroRandom) {//mayor
                System.out.println("El numero es mayor");
            }
            else {//menor
                System.out.println("El numero es menor");
            }
        } while (numero != numeroRandom); //bucle hasta acertar el numero

        System.out.println("Has acertado el numero: " + numeroRandom);
        System.out.println("En: " + intentos+ " intentos");
        teclat.close();
    }
}