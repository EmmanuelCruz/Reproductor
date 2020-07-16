/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reproductor;

/**
 *
 * @author Emmanuel Cruz
 * @author Adrian Bonilla
 */
public class Cancion {
    
    /** Artista de la cancion. */
    public String artista;
    
    /** Nombre de la cancion. */
    public String nombre;
    
    /** Album de la cacion. */
    public String album;
    
    /** Duracion de la cancion. */
    public String duracion;
    
    /** Anio de la cancion. */
    public int anio;
    
    /**
     * Construye una nueva cancion. 
     * @param artista el artista de la cancion.
     * @param nombre el nombre de la cancion.
     * @param album el album de la cancion.
     * @param duracion la duracion de la cancion.
     * @param anio el anio de la cancion.
     */
    public Cancion(String artista, String nombre, String album,
            String duracion, int anio){
        this.artista = artista;
        this.nombre = nombre;
        this.album = album;
        this.duracion = duracion;
        this.anio = anio;
    }
    
    /**
     * Reproduce la cancion.
     */
    public void reproduce(){
        
    }
    
    /**
     * Detiene la cancion.
     */
    public void detiene(){
        
    }
    
    /**
     * Pausa la cancion.
     */
    public void pausa(){
        
    }
}
