/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reproductor;

import java.util.ArrayList;

/**
 *
 * @author Emmanuel Cruz Hernández
 * @author Adrián Bonilla Ruiz
 * @author Cristobal Morales Karen
 */
public class Playlist {
    
    /** Nombre de la playlist */
    public String nombre;
    
    /** Numero de canciones de la playlist */
    public int numeroCanciones;
    
    /** Lista de canciones que guarda la playlist */
    public ArrayList<Cancion> lista; 
    
    /**
     * Construye una nueva playlist. 
     * @param nombre el nombre de la playlist.
     */   
    public Playlist(String nombre ){
        this.nombre = nombre;
        lista = new ArrayList<>();  
    }
    
    /**
     * Agrega una cancion a la playlist.
     * @param cancion
     */
    public void agrega(Cancion cancion){
        lista.add(cancion);
        numeroCanciones++;   
    }
    
    /**
     * Elimina una cancion a la playlist.
     * @param cancion
     */
    public void elimina(Cancion cancion){
        lista.remove(cancion);
        numeroCanciones--;
    }
    
    /**
     * Agrega una cancion a la playlist.
     */
    public void Limpiar(){
        lista.clear();
        numeroCanciones = 0;
    }
    
    
    
    
    
            
}
