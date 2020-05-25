
import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> listado;
    
    
    public Agenda(){
        this.listado = new ArrayList<>();
    }
    public void agregarContacto(String nombre, String fono){
        Contacto c = new Contacto(nombre, fono);
        this.listado.add(c);
        
    }
    
    public void agregarContacto(Contacto c){
        this.listado.add(c);
    }
    public String buscarContacto(int numero){
        numero--;
        if (numero >= this.listado.size() || numero < 0) 
            return "Contacto no encontrado";
        
        Contacto c = this.listado.get(numero);
        return c.getNombre();
        
    }
    
    public void eliminarContacto(int numero){
        numero--;
        if (numero >= this.listado.size() || numero < 0) 
            return;
        
        this.listado.remove(numero);
    }
    public String buscarContacto(String nombreBuscado){
        String s = "";
        for (Contacto c : listado){
            //if (c.getNombre().equals(nombreBuscado)){
            if (c.getNombre().toUpperCase().contains(nombreBuscado.toUpperCase())){
            s += "\n" + c.getNombre() + " [FONO:" + c.getFono() +"]";
        }
       }
        return s;
    }
    public String obtenerListado(){
        String s = "";
        int idx = 1;
        for (Contacto c : listado){
            s += "\n ("+ idx++ + ")" + c.getNombre();
        }
        return s;
    }
}
