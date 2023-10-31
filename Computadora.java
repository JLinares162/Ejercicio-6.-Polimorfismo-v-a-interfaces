/**
 * La clase Computadora representa un dispositivo electrónico que tiene
 * características específicas de una computadora, como memoria RAM, procesador,
 * almacenamiento interno y capacidades de video.
 */
public class Computadora extends DispositivoElectronico {

    private int memoriaRAM;
    private String procesador;
    private int almacenamientoInterno;
    private String tipoDiscoDuro;
    private double velocidadCPU;
    private double velocidadGPU;
    private int nivelVolumen;
    private int nivelBrillo;
    private int videoActual;

    /**
     * Constructor para inicializar una instancia de Computadora con sus atributos.
     * 
     * @param nombre              El nombre de la computadora.
     * @param estado              El estado de la computadora (encendida o apagada).
     * @param precio              El precio de la computadora.
     * @param numeroCuotasVisa    El número de cuotas Visa disponibles.
     * @param marca               La marca de la computadora.
     * @param modelo              El modelo de la computadora.
     * @param memoriaRAM          La cantidad de memoria RAM en gigabytes.
     * @param procesador          El tipo de procesador de la computadora.
     * @param almacenamientoInterno La capacidad de almacenamiento interno en gigabytes.
     * @param tipoDiscoDuro       El tipo de disco duro de la computadora.
     * @param velocidadCPU        La velocidad de la CPU en gigahercios (GHz).
     * @param velocidadGPU        La velocidad de la GPU en gigahercios (GHz).
     * @param nivelVolumen        El nivel de volumen del dispositivo.
     * @param nivelBrillo         El nivel de brillo de la pantalla (si es aplicable).
     * @param videoActual         El número del video actualmente reproducido.
     */
    public Computadora(String nombre, boolean estado, double precio, int numeroCuotasVisa, String marca, String modelo,
            int memoriaRAM, String procesador, int almacenamientoInterno, String tipoDiscoDuro, double velocidadCPU,
            double velocidadGPU, int nivelVolumen, int nivelBrillo, int videoActual) {
        super(nombre, estado, precio, numeroCuotasVisa, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.almacenamientoInterno = almacenamientoInterno;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.nivelVolumen = nivelVolumen;
        this.nivelBrillo = nivelBrillo;
        this.videoActual = videoActual;
    }

    // Métodos getter y setter para otros atributos...

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamientoInterno() {
        return almacenamientoInterno;
    }

    public void setAlmacenamientoInterno(int almacenamientoInterno) {
        this.almacenamientoInterno = almacenamientoInterno;
    }

    public String getTipoDiscoDuro() {
        return tipoDiscoDuro;
    }

    public void setTipoDiscoDuro(String tipoDiscoDuro) {
        this.tipoDiscoDuro = tipoDiscoDuro;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public void setVelocidadCPU(double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public double getVelocidadGPU() {
        return velocidadGPU;
    }

    public void setVelocidadGPU(double velocidadGPU) {
        this.velocidadGPU = velocidadGPU;
    }

    public int getNivelVolumen() {
        return nivelVolumen;
    }

    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }

    public int getNivelBrillo() {
        return nivelBrillo;
    }

    public void setNivelBrillo(int nivelBrillo) {
        this.nivelBrillo = nivelBrillo;
    }

    public int getVideoActual() {
        return videoActual;
    }

    public void setVideoActual(int videoActual) {
        this.videoActual = videoActual;
    }

    /**
     * Representación de cadena de la instancia de Computadora.
     *
     * @return Una cadena que describe los atributos de la computadora.
     */
    @Override
    public String toString() {
        return "Computadora [nombre=" + nombre + ", estado=" + estado + ", precio=" + precio + ",  numeroCuotasVisa="
                + numeroCuotasVisa + ", marca=" + marca + ", modelo=" + modelo + "memoriaRAM=" + memoriaRAM
                + "procesador=" + procesador + "almacenamientoInterno=" + almacenamientoInterno + ", tipoDiscoDuro="
                + tipoDiscoDuro + ", velocidadCPU=" + velocidadCPU + ", velocidadGPU=" + velocidadGPU
                + ", nivelVolumen=" + nivelVolumen + ", nivelBrillo=" + nivelBrillo + ", videoActual=" + videoActual + "]";
    }

    /**
     * Muestra información adicional específica de la computadora, como la memoria RAM,
     * el tipo de disco duro y las velocidades de CPU y GPU.
     */
    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Información de la computadora: ");
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Tipo de Disco Duro: " + tipoDiscoDuro);
        System.out.println("Velocidad de CPU: " + velocidadCPU + " GHz");
        System.out.println("Velocidad de GPU: " + velocidadGPU + " GHz");
    }

    @Override
    public void subirVolumen() {
        nivelVolumen = Math.min(100, nivelVolumen + 10);
    }

    @Override
    public void bajarVolumen() {
        nivelVolumen = Math.max(0, nivelVolumen - 10);
    }

    @Override
    public void aumentarBrillo() {
        nivelBrillo = Math.min(100, nivelBrillo + 5);
    }

    @Override
    public void disminuirBrillo() {
        nivelBrillo = Math.max(0, nivelBrillo - 5);
    }

    public void mostrarEstado() {
        System.out.println("Estado de la computadora: ");
        System.out.println("Encendida: " + (estado ? "Sí" : "No"));
        System.out.println("Video actual: " + videoActual);
        System.out.println("Niveles de volumen y brillo: "); // Mostrar niveles actuales
    }

    /**
     * Controla la selección de videos disponibles en la computadora, mostrando un menú.
     */
    @Override
    public void controlarVideos() {
        System.out.println("Menú de Selección de Video:");
        System.out.println("1. Video 1");
        System.out.println("2. Video 2");
        System.out.println("3. Video 3");
        System.out.println("4. Video 4");
        System.out.println("5. Video 5");
        System.out.println("Seleccione una opción: ");
    }
}
