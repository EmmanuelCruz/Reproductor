/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reproductor;

import java.io.File;

/**
 *
 * @author Emmanuel Cruz
 * @author Adrian Bonilla
 */
public class Cancion {
    
    /** Archivo que almacena la canción. */
    private final File archivo;
    
    /**
     * Construye una nueva cancion. 
     * @param archivo el archivo que almacena la canción.
     */
    public Cancion(File archivo){
        this.archivo = archivo;
    }
    
    /**
     * Regresa el archivo asociado a la canción.
     * @return el archivo de la canción.
     */
    public File getArchivo(){
        return archivo;
    }

}
