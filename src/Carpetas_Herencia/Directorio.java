
package Carpetas_Herencia;
//clase hija

import java.util.ArrayList;


public class Directorio extends Objeto {
    //hereda clases del padre
    
    String permisos; //Para ver si el usuario quiere Read, Write o Cancelar
    private ArrayList <Objeto> directorio;

    public Directorio(String permisos, ArrayList<Objeto> directorio, String nombre, int tamaño) {
        super(nombre, tamaño);
        this.permisos = permisos;
        this.directorio = directorio;
    }

    public String getPermisos() {
        return permisos;
    }
    
    public void buscarCarpeta(){
        
    }
    
    public void agregarCarpeta(){
        
    }
    
    public void agregarArchivo(){
        
    }

    public void setPermisos(int permisos) {
        System.out.println("1 - Read");
        System.out.println("2 - Write");
        System.out.println("3 - Cancel");
        if(permisos == 1)
            this.permisos = "read";
        if(permisos == 2)
            this.permisos = "write";
        if(permisos == 3)
            this.permisos = "cancel";
    }
    
    public void crearArchivo(){
        Objeto x = new Archivo_Sistema(nombre, nombre, tamaño);
    }
    
}
