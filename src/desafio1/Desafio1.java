
package desafio1;


public class Desafio1 {

    
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
       boolean login=false;
     
              Metodos.usuario();
    login=Metodos.contrasenas();
            if (login) {
            Metodos.menu(login);
        }
  
        System.out.println("Gracias por usar nuestros servicios.");         
                 
                 
                 
                 
                 
                 
             }
    }
    

