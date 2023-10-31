/**
 * La clase Telefono representa un dispositivo electrónico con características
 * específicas de un teléfono, como memoria RAM, procesador, almacenamiento interno
 * y funciones relacionadas con la conectividad y multimedia.
 */
public class Telefono extends DispositivoElectronico {

    private int memoriaRAM;
    private String procesador;
    private int almacenamientoInterno;
    private boolean extiendeMemoria;
    private boolean cuboCargadorIncluido;
    private boolean es5G;
    private int nivelVolumen;
    private int nivelBrillo;
    private int videoActual;

    /**
     * Constructor para inicializar una instancia de Teléfono con sus atributos.
     * 
     * @param nombre              El nombre del teléfono.
     * @param estado              El estado del teléfono (encendido o apagado).
     * @param precio              El precio del teléfono.
     * @param numeroCuotasVisa    El número de cuotas Visa disponibles.
     * @param marca               La marca del teléfono.
     * @param modelo              El modelo del teléfono.
     * @param memoriaRAM          La cantidad de memoria RAM en gigabytes.
     * @param procesador          El tipo de procesador del teléfono.
     * @param almacenamientoInterno La capacidad de almacenamiento interno en gigabytes.
     * @param extiendeMemoria      Indica si el teléfono admite la extensión de memoria.
     * @param cuboCargadorIncluido Indica si el cubo cargador está incluido.
     * @param es5G                Indica si el teléfono es compatible con 5G.
     * @param nivelVolumen        El nivel de volumen del dispositivo.
     * @param nivelBrillo         El nivel de brillo de la pantalla (si es aplicable).
     * @param videoActual         El número del video actualmente reproducido.
     */
    public Telefono(String nombre, boolean estado, double precio, int numeroCuotasVisa, String marca, String modelo,
            int memoriaRAM, String procesador, int almacenamientoInterno, boolean extiendeMemoria,
            boolean cuboCargadorIncluido, boolean es5G, int nivelVolumen, int nivelBrillo, int videoActual) {
        super(nombre, estado, precio, numeroCuotasVisa, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.almacenamientoInterno = almacenamientoInterno;
        this.extiendeMemoria = extiendeMemoria;
        this.cuboCargadorIncluido = cuboCargadorIncluido;
        this.es5G = es5G;
        this.nivelVolumen = nivelVolumen;
        this.nivelBrillo = nivelBrillo;
        this.videoActual = videoActual;
    }

    /**
     * Obtiene la cantidad de memoria RAM del teléfono.
     *
     * @return La cantidad de memoria RAM en gigabytes.
     */
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    /**
     * Establece la cantidad de memoria RAM del teléfono.
     *
     * @param memoriaRAM La cantidad de memoria RAM en gigabytes.
     */
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    /**
     * Obtiene el tipo de procesador del teléfono.
     *
     * @return El tipo de procesador del teléfono.
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * Establece el tipo de procesador del teléfono.
     *
     * @param procesador El tipo de procesador del teléfono.
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Obtiene la capacidad de almacenamiento interno del teléfono.
     *
     * @return La capacidad de almacenamiento interno en gigabytes.
     */
    public int getAlmacenamientoInterno() {
        return almacenamientoInterno;
    }

    /**
     * Establece la capacidad de almacenamiento interno del teléfono.
     *
     * @param almacenamientoInterno La capacidad de almacenamiento interno en gigabytes.
     */
    public void setAlmacenamientoInterno(int almacenamientoInterno) {
        this.almacenamientoInterno = almacenamientoInterno;
    }

    /**
     * Verifica si el teléfono admite la extensión de memoria.
     *
     * @return true si el teléfono admite la extensión de memoria, false en caso contrario.
     */
    public boolean isExtiendeMemoria() {
        return extiendeMemoria;
    }

    /**
     * Establece si el teléfono admite la extensión de memoria.
     *
     * @param extiendeMemoria true si el teléfono admite la extensión de memoria, false en caso contrario.
     */
    public void setExtiendeMemoria(boolean extiendeMemoria) {
        this.extiendeMemoria = extiendeMemoria;
    }

    /**
     * Verifica si el teléfono incluye un cubo cargador.
     *
     * @return true si el teléfono incluye un cubo cargador, false en caso contrario.
     */
    public boolean isCuboCargadorIncluido() {
        return cuboCargadorIncluido;
    }

    /**
     * Establece si el teléfono incluye un cubo cargador.
     *
     * @param cuboCargadorIncluido true si el teléfono incluye un cubo cargador, false en caso contrario.
     */
    public void setCuboCargadorIncluido(boolean cuboCargadorIncluido) {
        this.cuboCargadorIncluido = cuboCargadorIncluido;
    }

    /**
     * Verifica si el teléfono es compatible con 5G.
     *
     * @return true si el teléfono es compatible con 5G, false en caso contrario.
     */
    public boolean isEs5G() {
        return es5G;
    }

    /**
     * Establece si el teléfono es compatible con 5G.
     *
     * @param es5G true si el teléfono es compatible con 5G, false en caso contrario.
     */
    public void setEs5G(boolean es5G) {
        this.es5G = es5G;
    }

    /**
     * Obtiene el nivel de volumen actual del teléfono.
     *
     * @return El nivel de volumen del dispositivo.
     */
    public int getNivelVolumen() {
        return nivelVolumen;
    }

    /**
     * Establece el nivel de volumen del teléfono.
     *
     * @param nivelVolumen El nivel de volumen del dispositivo.
     */
    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }

    /**
     * Obtiene el nivel de brillo actual de la pantalla del teléfono.
     *
     * @return El nivel de brillo de la pantalla.
     */
    public int getNivelBrillo() {
        return nivelBrillo;
    }

    /**
     * Establece el nivel de brillo de la pantalla del teléfono.
     *
     * @param nivelBrillo El nivel de brillo de la pantalla.
     */
    public void setNivelBrillo(int nivelBrillo) {
        this.nivelBrillo = nivelBrillo;
    }

    /**
     * Obtiene el número del video actualmente reproducido en el teléfono.
     *
     * @return El número del video actualmente reproducido.
     */
    public int getVideoActual() {
        return videoActual;
    }

    /**
     * Establece el número del video actualmente reproducido en el teléfono.
     *
     * @param videoActual El número del video actualmente reproducido.
     */
    public void setVideoActual(int videoActual) {
        this.videoActual = videoActual;
    }

    /**
     * Representación de cadena de la instancia de Teléfono.
     *
     * @return Una cadena que describe los atributos del teléfono.
     */
    @Override
    public String toString() {
        return "Telefono [nombre=" + nombre + ", estado=" + estado + ", precio=" + precio + ", numeroCuotasVisa=" + numeroCuotasVisa
                + ", marca=" + marca + ", modelo=" + modelo + "memoriaRAM=" + memoriaRAM + "procesador=" + procesador + "almacenamientoInterno="
                + almacenamientoInterno + ", extiendeMemoria=" + extiendeMemoria + ", cuboCargadorIncluido="
                + cuboCargadorIncluido + ", es5G=" + es5G + ", nivelVolumen=" + nivelVolumen + ", nivelBrillo="
                + nivelBrillo + ", videoActual=" + videoActual + "]";
    }

    /**
     * Muestra información adicional específica del teléfono, como la memoria RAM,
     * el procesador y las capacidades de conectividad.
     */
    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Información del teléfono: ");
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Procesador: " + procesador);
        System.out.println("Almacenamiento Interno: " + almacenamientoInterno + " GB");
        System.out.println("Extiende Memoria: " + (extiendeMemoria ? "Sí" : "No"));
        System.out.println("Cubo Cargador Incluido: " + (cuboCargadorIncluido ? "Sí" : "No"));
        System.out.println("Compatible con 5G: " + (es5G ? "Sí" : "No"));
    }

    /**
     * Aumenta el nivel de volumen del teléfono en 2 unidades.
     */
    @Override
    public void subirVolumen() {
        nivelVolumen = Math.min(100, nivelVolumen + 2);
    }

    /**
     * Disminuye el nivel de volumen del teléfono en 2 unidades.
     */
    @Override
    public void bajarVolumen() {
        nivelVolumen = Math.max(0, nivelVolumen - 2);
    }

    /**
     * Aumenta el nivel de brillo de la pantalla del teléfono en 3 unidades.
     */
    @Override
    public void aumentarBrillo() {
        nivelBrillo = Math.min(100, nivelBrillo + 3);
    }

    /**
     * Disminuye el nivel de brillo de la pantalla del teléfono en 3 unidades.
     */
    @Override
    public void disminuirBrillo() {
        nivelBrillo = Math.max(0, nivelBrillo - 3);
    }

    /**
     * Muestra el estado del teléfono, incluyendo si está encendido o apagado, el
     * video actualmente reproducido y los niveles de volumen y brillo.
     */
    @Override
    public void mostrarEstado() {
        System.out.println("Estado del teléfono: ");
        System.out.println("Encendido: " + (estado ? "Sí" : "No"));
        System.out.println("Video actual: " + videoActual);
        System.out.println("Niveles de volumen y brillo: ");
        System.out.println("Volumen: " + nivelVolumen + " Brillo: " + nivelBrillo);
    }

    /**
     * Controla la selección de videos disponibles en el teléfono, mostrando un menú.
     */
    @Override
    public void controlarVideos() {
        System.out.println("Menú de Selección de Video:");
        System.out.println("1. Video 1");
        System.out.println("2. Video 2");
        System.out.println("3. Video 3");
        System.out.println("Seleccione una opción: ");
    }
}
