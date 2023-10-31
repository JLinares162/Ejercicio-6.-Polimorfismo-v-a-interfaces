/**
 * La interfaz Controlable define un conjunto de métodos que representan
 * acciones que pueden realizarse en un dispositivo controlable, como una
 * televisión o un reproductor de medios.
 */
public interface Controlable {

    /**
     * Enciende el dispositivo controlable.
     */
    void encender();

    /**
     * Apaga el dispositivo controlable.
     */
    void apagar();

    /**
     * Sube el volumen del dispositivo controlable.
     */
    void subirVolumen();

    /**
     * Baja el volumen del dispositivo controlable.
     */
    void bajarVolumen();

    /**
     * Aumenta el brillo de la pantalla del dispositivo controlable
     */
    void aumentarBrillo();

    /**
     * Disminuye el brillo de la pantalla del dispositivo controlable
     */
    void disminuirBrillo();

    /**
     * Muestra el estado actual del dispositivo controlable, como el canal actual o
     * la fuente de entrada seleccionada.
     */
    void mostrarEstado();

    /**
     * Permite controlar la reproducción de videos en el dispositivo, como reproducir,
     * pausar o detener un video.
     */
    void controlarVideos();
}
