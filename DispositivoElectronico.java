/**
 * La clase abstracta DispositivoElectronico es la base para representar dispositivos electrónicos
 * con propiedades generales como nombre, estado, precio, número de cuotas Visa, marca y modelo.
 * Esta clase implementa la interfaz Controlable y es comparable por precio.
 */
public abstract class DispositivoElectronico implements Controlable, Comparable<DispositivoElectronico> {

    protected String nombre;
    protected boolean estado;
    protected double precio;
    protected int numeroCuotasVisa;
    protected String marca;
    protected String modelo;

    /**
     * Constructor para inicializar una instancia de DispositivoElectronico con sus atributos.
     *
     * @param nombre           El nombre del dispositivo electrónico.
     * @param estado           El estado del dispositivo (encendido o apagado).
     * @param precio           El precio del dispositivo.
     * @param numeroCuotasVisa El número de cuotas Visa disponibles.
     * @param marca            La marca del dispositivo.
     * @param modelo           El modelo del dispositivo.
     */
    public DispositivoElectronico(String nombre, boolean estado, double precio, int numeroCuotasVisa, String marca, String modelo) {
        this.nombre = nombre;
        this.estado = estado;
        this.precio = precio;
        this.numeroCuotasVisa = numeroCuotasVisa;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene el nombre del dispositivo electrónico.
     *
     * @return El nombre del dispositivo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del dispositivo electrónico.
     *
     * @param nombre El nuevo nombre del dispositivo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el estado del dispositivo electrónico.
     *
     * @return El estado del dispositivo (encendido o apagado).
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del dispositivo electrónico.
     *
     * @param estado El nuevo estado del dispositivo (true para encendido, false para apagado).
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el precio del dispositivo electrónico.
     *
     * @return El precio del dispositivo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del dispositivo electrónico.
     *
     * @param precio El nuevo precio del dispositivo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el número de cuotas Visa disponibles para el dispositivo electrónico.
     *
     * @return El número de cuotas Visa disponibles.
     */
    public int getNumeroCuotasVisa() {
        return numeroCuotasVisa;
    }

    /**
     * Establece el número de cuotas Visa disponibles para el dispositivo electrónico.
     *
     * @param numeroCuotasVisa El nuevo número de cuotas Visa disponibles.
     */
    public void setNumeroCuotasVisa(int numeroCuotasVisa) {
        this.numeroCuotasVisa = numeroCuotasVisa;
    }

    /**
     * Obtiene la marca del dispositivo electrónico.
     *
     * @return La marca del dispositivo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del dispositivo electrónico.
     *
     * @param marca La nueva marca del dispositivo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del dispositivo electrónico.
     *
     * @return El modelo del dispositivo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del dispositivo electrónico.
     *
     * @param modelo El nuevo modelo del dispositivo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Muestra el precio del dispositivo electrónico.
     */
    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }

    /**
     * Método abstracto para mostrar información adicional específica de cada dispositivo.
     */
    public abstract void mostrarInformacionAdicional();

    @Override
    public void encender() {
        estado = true;
    }

    @Override
    public void apagar() {
        estado = false;
    }

    @Override
    public int compareTo(DispositivoElectronico other) {
        return Double.compare(this.precio, other.precio);
    }
}