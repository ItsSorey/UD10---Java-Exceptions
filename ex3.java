package excepciones;

public class ex3 {
	public static void main(String[] args) {
        
        try {
        	System.out.println("Generando número aleatorio...");
        	int numeroRandom = (int) (Math.random() * 1000);//numero random de 0-999
        	
        	System.out.println("El numero aleatorio generado es: " +numeroRandom);
        	if(numeroRandom%2!=0) { throw new miExcepcion(2);}
        	else {throw new miExcepcion(3);}
        	
		}catch (miExcepcion ex) { //excepcion personalizada
            System.out.println("Excepcion capturada con mensaje: "+ex.getMessage());
		}
	}
}