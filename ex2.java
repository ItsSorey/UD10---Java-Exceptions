package excepciones;

public class ex2 {
	public static void main(String[] args) {
		String respuesta="";
        
        try {
        	System.out.println("Mensaje mostrado por pantalla");
        	if(respuesta.isEmpty()) { throw new miExcepcion(1);}
        	
		}catch (miExcepcion ex) { //excepcion personalizada
            System.out.println("Excepcion capturada con mensaje: "+ex.getMessage());
		}
        System.out.println("Programa terminado");
	}
}
