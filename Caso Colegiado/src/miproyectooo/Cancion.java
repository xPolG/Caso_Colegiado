/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miproyectooo;

/**
 *
 * @author POLG
 */
public class Cancion {
    private int id;
    private String titulo;
    private String autor;
    private double duracion;
    private int anioCreacion;

    // Constructor
    public Cancion(int id, String titulo, String autor, double duracion, int anioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    /**
     *
     * @return
     */
    
    public String String() {
        return "Cancion [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion
                + ", anioCreacion=" + anioCreacion + "]";
    }

    // Método para obtener canciones anteriores al año actual
    public static Cancion[] cancionesAnterioresAlAnioActual(Cancion[] canciones, int anioActual) {
        int count = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() >= anioActual) {
            } else {
                count++;
            }
        }
        Cancion[] result = new Cancion[count];
        int index = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() < anioActual) {
                result[index++] = cancion;
            }
        }
        return result;
    }

    // Método para obtener canciones del año actual
    public static Cancion[] cancionesDelAnioActual(Cancion[] canciones, int anioActual) {
        int count = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() == anioActual) {
                count++;
            }
        }
        Cancion[] result = new Cancion[count];
        int index = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() == anioActual) {
                result[index++] = cancion;
            }
        }
        return result;
    }

    // Método para obtener canciones posteriores al año actual
    public static Cancion[] cancionesPosterioresAlAnioActual(Cancion[] canciones, int anioActual) {
        int count = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() > anioActual) {
                count++;
            }
        }
        Cancion[] result = new Cancion[count];
        int index = 0;
        for (Cancion cancion : canciones) {
            if (cancion.getAnioCreacion() > anioActual) {
                result[index++] = cancion;
            }
        }
        return result;
    }

    // Método para obtener la canción de mayor duración
    public static Cancion cancionDeMayorDuracion(Cancion[] canciones) {
        Cancion longestSong = null;
        for (Cancion cancion : canciones) {
            if (longestSong == null || cancion.getDuracion() > longestSong.getDuracion()) {
                longestSong = cancion;
            }
        }
        return longestSong;
    }

    // Método para obtener el autor de la canción en la primera posición
    public static String autorPrimeraCancion(Cancion[] canciones) {
        if (canciones.length > 0) {
            return canciones[0].getAutor();
        } else {
            return "No hay canciones en el top.";
        }
    }

    // Método para mostrar todas las canciones
    public static void mostrarTodasLasCanciones(Cancion[] canciones) {
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }
}

