package excepciones;

@SuppressWarnings("serial")
public class miExcepcion extends Exception {
	private int codigoException;
	
	//Constructor de clase
    public miExcepcion(int codigoError) {
        super();
        this.codigoException=codigoError;
    }
    
    //Metodo propio
    public String getMessage() {
    	
    	String msg="";
    	
    	switch(codigoException) {
    		case 1:
    			msg="Esto es un objeto Exception";
    			break;
    		case 2:
    			msg="Es impar";
    			break;
    		case 3:
    			msg="Es par";
    			break;
    		case 4:
    			msg="Numero de menú incorrecto";
    			break;
    	}
    	
    	return msg;
    }
    
}