import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Impresora", "111");
        agenda.agregarContacto("Microprosesador", "222");
        agenda.agregarContacto("Fuente de poder", "333");
        agenda.agregarContacto("Placa Madre", "444");
        agenda.agregarContacto("Cooler", "555");
        agenda.agregarContacto("Tarjeta de video", "666");
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
    
        menu(); 
        opcion = sc.nextInt();
    
        while(opcion != 0){
        
            //INGRESO
            if (opcion == 1){
                System.out.println("Ingrese el producto");
                String nombre = sc.next();
                System.out.println("Ingrese el precio");
                String fono = sc.next();
            
                agenda.agregarContacto(nombre, fono);                          
            }
            //Buscar
            
            if (opcion == 2){
                System.out.println("Ingrese producto a buscar"); 
                String nombre = sc.next();
                
                System.out.println(agenda.buscarContacto(nombre));
                       
            }
            //Eliminar
            if (opcion == 3){
                System.out.println(agenda.obtenerListado());
                System.out.println("Ingrese el numero del Producto a eliminar.");
                int numero = sc.nextInt();
                
                String datos = agenda.buscarContacto(numero);
                    if (!datos.equals("Prodcuto no encontrado")){
                        System.out.println("Se dispone a eliminar a" + datos);
                        System.out.println("Estas seguro? [1]Si [2]No");
                
                    int seguro = sc.nextInt();
                    if (seguro == 1){
                        agenda.eliminarContacto(numero);
                    System.out.println("Producto Eliminado.");
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
        System.out.println("--------------------");
        System.out.println(" PRODUCTOS EN STOCK ");
        System.out.println("--------------------");
        System.out.println("[1] Agregar");
        System.out.println("[2] Buscar");
        System.out.println("[3] Eliminar");
        System.out.println("[4] Mostrar");
        System.out.println("[0] Salir");
 
    }
}