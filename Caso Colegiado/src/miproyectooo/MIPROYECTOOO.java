/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyectooo;

/**
 *
 * @author POLG
 */
public class MIPROYECTOOO {

    /**
     * @param args
     */
     
    public static void main(String[] args) {
        // Crear el arreglo de objetos Cancion (top 10)
        Cancion[] top10Canciones = new Cancion[10];
        // Llenar el arreglo con información de las canciones
        // (Asumiendo que los datos están disponibles)
        
        int anioActual = 2023;
        
        Cancion[] cancionesAnteriores = Cancion.cancionesAnterioresAlAnioActual(top10Canciones, anioActual);
        System.out.println("Canciones anteriores al año actual:");
        Cancion.mostrarTodasLasCanciones(cancionesAnteriores);
        
        Cancion[] cancionesAnioActual = Cancion.cancionesDelAnioActual(top10Canciones, anioActual);
        System.out.println("Canciones del año actual:");
        Cancion.mostrarTodasLasCanciones(cancionesAnioActual);
        
        Cancion[] cancionesPosteriores = Cancion.cancionesPosterioresAlAnioActual(top10Canciones, anioActual);
        System.out.println("Canciones posteriores al año actual:");
        Cancion.mostrarTodasLasCanciones(cancionesPosteriores);
        
        Cancion cancionMasLarga = Cancion.cancionDeMayorDuracion(top10Canciones);
        System.out.println("Canción de mayor duración:");
        System.out.println(cancionMasLarga);
        
        String autorPrimeraCancion = Cancion.autorPrimeraCancion(top10Canciones);
        System.out.println("Autor de la canción en la primera posición:");
        System.out.println(autorPrimeraCancion);
        
        System.out.println("Todas las canciones en el top:");
        Cancion.mostrarTodasLasCanciones(top10Canciones);
    }
}

    

