
import java.util.ArrayList;
import java.util.Scanner;

public class Carpetas {
    
    //Dado el nombre de una carpeta, determinar la cantidad de elementos contenidos.
    
    private String nombre;
    private int tamaño;
    ArrayList <Carpetas> Crp;
    ArrayList <Archivo> Arc;
    
    
    
    public Carpetas(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
        Crp = null;
        Arc = null;
    }

    public ArrayList<Carpetas> getCrp() {
        return Crp;
    }

    public void setCrp(Carpetas nueva_carpeta) {
        if(Crp == null){
           Crp = new ArrayList<>(); 
           Crp.add(nueva_carpeta);
        }else{
           Crp.add(nueva_carpeta); 
        }
    }

    public ArrayList<Archivo> getArc() {
        return Arc;
    }

    public void setArc(Archivo nuevo_archivo ) {
        if(Arc == null)
        {
            Arc = new ArrayList<>();
            Arc.add(nuevo_archivo);
        }else
        {
            Arc.add(nuevo_archivo);
        }
    }
    
    
    
    public static void menu(int a){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Buscar Carpeta: ");
        System.out.println("2 - Ingresar/Crear Carpeta: ");
        System.out.println("3 - Ingresar/Crear Archivos: ");
        System.out.println("Ingrese la opción que desea buscar: ");
        a = input.nextInt();
        switch(a){
            case 1:
                
                 
                
                break;
        }
    }
    
    public String buscarCarpeta(String nombre, int y){
        if(y == Crp.size()){
            return "No se encontró el archivo.";
        }
        if(nombre.equals(Crp.get(y).getNombre())){
            return Crp.get(y).getNombre();
        }
        else{
            return buscarCarpeta(nombre, y++);
        }        
    }
    
    public void crearCarpetas(String nombre, int y){
        if(nombre.equals(Crp.get(y).getNombre())){
            System.out.println("Ya existe la carpeta.");
            return;
        }
        else{
           Crp.add(new Carpetas(nombre, 0));
            System.out.println("Carpeta agregada extitósamente!");
        }
        
    }
    
    public void crearArchivo(String nombre, String archivo, int y){
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Carpetas crp = null;
        
        System.out.println("Ingrese el nombre del archivo: ");
        String nombre = input.next();
        
        crp.Crp.add(new Carpetas(nombre, 0));
        
    }
}
