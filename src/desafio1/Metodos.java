
package desafio1;

public class Metodos {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int opcion = 0, botellas = 0, peso = 0, valor = 0, saldo = 0, intentos = 0;
        boolean login = false;
        String usuario = "", password = "";

        while (!login && intentos < 3) {
            System.out.println("Ingrese su usuario:");
            usuario = input.nextLine();
            if (usuario.equals("Albus_D")) {
                System.out.println("Ingrese su contraseña:");
                password = input.nextLine();
                if (password.equals("caramelosDeLimon")) {
                    login = true;
                } else {
                    System.out.println("Contraseña incorrecta, intentos restantes: " + (2 - intentos));
                    intentos++;
                }
            } else {
                System.out.println("Usuario incorrecto, intentos restantes: " + (2 - intentos));
                intentos++;
            }
        }

        if (login) {
            do {
                System.out.println("Bienvenido " + usuario);
                System.out.println("1. Ingresar botellas");
                System.out.println("2. Consultar saldo");
                System.out.println("3. Salir");
                opcion = input.nextInt();
                input.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántas botellas desea ingresar?");
                        botellas = input.nextInt();
                        input.nextLine();

                        for (int i = 1; i <= botellas; i++) {
                            peso = (int) (Math.random() * (3000 - 100 + 1) + 100);
                            if (peso < 500) {
                                valor += 50;
                            } else if (peso >= 501 && peso <= 1500) {
                                valor += 125;
                            } else if (peso > 1500) {
                                valor += 200;
                            }
                        }

                        if (valor > 0) {
                            System.out.println("El valor que se le ofrece es $" + valor + ". ¿Desea aceptarlo? (s/n)");
                            String respuesta = input.nextLine();
                            if (respuesta.equals("s")) {
                                saldo += valor;
                                System.out.println("Saldo acreditado: $" + saldo);
                            } else {
                                System.out.println("Devolviendo material");
                            }
                        } else {
                            System.out.println("No se ingresaron botellas");
                        }

                        valor = 0; // reiniciamos el valor de las botellas
                        break;
                    case 2:
                        System.out.println("Su saldo es: $" + saldo);
                        break;
                    case 3:
                        System.out.println("Gracias por utilizar la máquina de reciclaje.");
                        break;
                    default:
                        System.out.println("Opción inválida, intente nuevamente.");
                }
            } while (opcion != 3);
        } else {
            System.out.println("Ha superado el límite de intentos, intente nuevamente más tarde.");
        }

        input.close();
    }
    
    
    
    public static void usuario(){
       
        Scanner leer=new Scanner(System.in);
       String usuario="Albus_D",rta;
        System.out.println("Ingrese su usuario");
         rta=leer.next(); 
        while (rta.equals(usuario)==false){
            System.out.println("Usuario incorrecto.Ingrese nuevamente");
            rta=leer.next();
        }
    }
    public static boolean contrasenas(){
       Scanner leer=new Scanner(System.in);
       int i=2;
       String contraseña="caramelosDeLimon",rta2;
        System.out.println("Ingrese su contraseña");
         rta2=leer.next(); 

             while (rta2.equals(contraseña)==false){
            if (i==0) {
               
                break;   
            }
            System.out.println("Contraseña incorrecta. Le quedan "+i+" intentos.Ingrese nuevamente");
            rta2=leer.next();
            i--;}
           if (i==0) {
            return false;
        }else {return true;}
        
}
    
   public static void menu(boolean login){
          int op,saldo=0,botellas,pesot,dinero;
     Scanner leer=new Scanner(System.in);
      String rta3;
   
             do {
                 
                 System.out.println("Seleccione una opcion");
                 System.out.println("Menu");
                 System.out.println("1-Ingresar botellas ");
                 System.out.println("2-Consultar saldo ");
                 System.out.println("3-Salir");
                 op=leer.nextInt();
                 switch (op) {
                     case 1:
                         pesot=0;
                         System.out.println("Ingrese la cantridad de botellas que desea introducir.");
                         botellas=leer.nextInt();
                         for (int i = 0; i < botellas; i++) {
                             pesot+=+(int)(Math.random()*2901+100);
                         }
                         if (pesot<=500) {
                             dinero=50;
                         }else if(501<=pesot && pesot<=1500) {
                             dinero=125;
                         }else{
                              dinero=200;
                         }
                         System.out.println("Se le ofrecen "+dinero+" por "+pesot+" gramos. ¿Los acepta?(Si/No)");
                         rta3=leer.next();
                         if (rta3.equals("Si")) {
                             saldo+=+dinero;
                         }else{
                             System.out.println("Devolviendo material");
                         }
                         break;
              case 2:
                  System.out.println("Su saldo es de "+saldo);
                             break;
              case 3: 
                  login=false;
                             break;
                         
                     default:
                         System.out.println("Ingrese una opcion valida");
                 }
                 
                 
        } while (login);      
        } 
    
    
}
    

