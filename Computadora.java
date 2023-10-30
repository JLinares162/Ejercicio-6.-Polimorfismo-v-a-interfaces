public class Computadora extends DispositivoElectronico {
    
    private int memoriaRAM;
    private String tipoDiscoDuro;
    private double velocidadCPU;
    private double velocidadGPU;
    private int nivelVolumen;
    private int nivelBrillo;
    private int videoActual;

    public Computadora(String nombre, double precio, int numeroCuotasVisa, String marca, String modelo, int memoriaRAM,
            String tipoDiscoDuro, double velocidadCPU, double velocidadGPU, int nivelVolumen, int nivelBrillo,
            int videoActual) {
        super(nombre, precio, numeroCuotasVisa, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.nivelVolumen = nivelVolumen;
        this.nivelBrillo = nivelBrillo;
        this.videoActual = videoActual;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
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

    @Override
    public String toString() {
        return "Computadora [memoriaRAM=" + memoriaRAM + ", tipoDiscoDuro=" + tipoDiscoDuro + ", velocidadCPU="
                + velocidadCPU + ", velocidadGPU=" + velocidadGPU + ", nivelVolumen=" + nivelVolumen + ", nivelBrillo="
                + nivelBrillo + ", videoActual=" + videoActual + "]";
    }

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

    @Override
    public void controlarVideos() {
        if (estado) {
            // Implementar la lógica para controlar la reproducción de videos
            // Aquí puedes cambiar el video actual, pausar, parar, etc.
        } else {
            System.out.println("La computadora está apagada. Enciéndela para controlar los videos.");
        }
    }
}
