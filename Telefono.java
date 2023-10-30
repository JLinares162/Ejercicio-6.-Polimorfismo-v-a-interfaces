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

    public Telefono(String nombre, double precio, int numeroCuotasVisa, String marca, String modelo, int memoriaRAM,
            String procesador, int almacenamientoInterno, boolean extiendeMemoria, boolean cuboCargadorIncluido,
            boolean es5g, int nivelVolumen, int nivelBrillo, int videoActual) {
        super(nombre, precio, numeroCuotasVisa, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.almacenamientoInterno = almacenamientoInterno;
        this.extiendeMemoria = extiendeMemoria;
        this.cuboCargadorIncluido = cuboCargadorIncluido;
        es5G = es5g;
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

    public boolean isExtiendeMemoria() {
        return extiendeMemoria;
    }

    public void setExtiendeMemoria(boolean extiendeMemoria) {
        this.extiendeMemoria = extiendeMemoria;
    }

    public boolean isCuboCargadorIncluido() {
        return cuboCargadorIncluido;
    }

    public void setCuboCargadorIncluido(boolean cuboCargadorIncluido) {
        this.cuboCargadorIncluido = cuboCargadorIncluido;
    }

    public boolean isEs5G() {
        return es5G;
    }

    public void setEs5G(boolean es5g) {
        es5G = es5g;
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
        return "Telefono [memoriaRAM=" + memoriaRAM + ", procesador=" + procesador + ", almacenamientoInterno="
                + almacenamientoInterno + ", extiendeMemoria=" + extiendeMemoria + ", cuboCargadorIncluido="
                + cuboCargadorIncluido + ", es5G=" + es5G + ", nivelVolumen=" + nivelVolumen + ", nivelBrillo="
                + nivelBrillo + ", videoActual=" + videoActual + "]";
    }

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

    @Override
    public void subirVolumen() {
        nivelVolumen = Math.min(100, nivelVolumen + 2);
    }

    @Override
    public void bajarVolumen() {
        nivelVolumen = Math.max(0, nivelVolumen - 2);
    }

    @Override
    public void aumentarBrillo() {
        nivelBrillo = Math.min(100, nivelBrillo + 3);
    }

    @Override
    public void disminuirBrillo() {
        nivelBrillo = Math.max(0, nivelBrillo - 3);
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado de la computadora: ");
        System.out.println("Encendida: " + (estado ? "Sí" : "No"));
        System.out.println("Video actual: " + videoActual);
        System.out.println("Niveles de volumen y brillo: "); // Mostrar niveles actuales
    }

    @Override
    public void controlarVideos() {
        // Implementa la lógica de control de videos
    }
}
