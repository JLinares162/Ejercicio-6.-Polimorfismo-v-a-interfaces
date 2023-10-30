public abstract class DispositivoElectronico implements Controlable, Comparable<DispositivoElectronico> {
    
    protected String nombre;
    protected boolean estado;
    protected double precio;
    protected int numeroCuotasVisa;
    protected String marca;
    protected String modelo;

    public DispositivoElectronico(String nombre, double precio, int numeroCuotasVisa, String marca, String modelo) {
        this.nombre = nombre;
        this.estado = false;
        this.precio = precio;
        this.numeroCuotasVisa = numeroCuotasVisa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroCuotasVisa() {
        return numeroCuotasVisa;
    }

    public void setNumeroCuotasVisa(int numeroCuotasVisa) {
        this.numeroCuotasVisa = numeroCuotasVisa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }

    @Override
    public String toString() {
        return "DispositivoElectronico [nombre=" + nombre + ", estado=" + estado + ", precio=" + precio
                + ", numeroCuotasVisa=" + numeroCuotasVisa + ", marca=" + marca + ", modelo=" + modelo + "]";
    }

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
