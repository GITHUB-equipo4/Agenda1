import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Lucas", "111");
        agenda.agregarContacto("Luis", "222");
        agenda.agregarContacto("Ivan", "333");
        agenda.agregarContacto("Flavia", "444");
        agenda.agregarContacto("Patricio", "555");
        agenda.agregarContacto("Ronal", "666");
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
    
        menu(); 
        opcion = sc.nextInt();
    
        while(opcion != 0){
        
            //INGRESO
            if (opcion == 1){
                System.out.println("Ingrese el nombre");
                String nombre = sc.next();
                System.out.println("Ingrese el fono");
                String fono = sc.next();
            
                agenda.agregarContacto(nombre, fono);                          
            }
            //Buscar
            
            if (opcion == 2){
                System.out.println("Ingrese nombre a buscar"); 
                String nombre = sc.next();
                
                System.out.println(agenda.buscarContacto(nombre));
                       
            }
            //Eliminar
            if (opcion == 3){
                System.out.println(agenda.obtenerListado());
                System.out.println("Ingrese el numero del contacto a eliminar.");
                int numero = sc.nextInt();
                
                String datos = agenda.buscarContacto(numero);
                    if (!datos.equals("Contacto no encontrado")){
                        System.out.println("Se dispone a eliminar a" + datos);
                        System.out.println("Estas seguro? [1]Si [2]No");
                
                    int seguro = sc.nextInt();
                    if (seguro == 1){
                        agenda.eliminarContacto(numero);
                    System.out.println("Contacto Eliminado.");
                    }
                }else{
                        System.out.println(datos);
                     }
            } 
            if (opcion == 4){
                System.out.println(agenda.obtenerListado());
            }
        
        menu(); 
        opcion = sc.nextInt();
        
    }
    }      
    public static void menu(){
        System.out.println("---------------");
        System.out.println("  A G E N D A  ");
        System.out.println("---------------");
        System.out.println("[1] Agregar");
        System.out.println("[2] Buscar");
        System.out.println("[3] Eliminar");
        System.out.println("[4] Mostrar");
        System.out.println("[0] Salir");
 
    }
}