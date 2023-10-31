import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La clase ElectroTechController se encarga de gestionar los dispositivos electrónicos
 * en exhibición y proporcionar funcionalidades como cargar datos desde un archivo CSV
 * y buscar dispositivos en la exhibición.
 */
public class ElectroTechController {
    private ArrayList<DispositivoElectronico> dispositivosEnExhibicion = new ArrayList<>();

    /**
     * Carga datos de dispositivos desde un archivo CSV y los agrega a la exhibición.
     *
     * @param archivoCSV El nombre del archivo CSV que contiene los datos de los dispositivos.
     */
    public void cargarDatosDesdeCSV(String archivoCSV) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoCSV));
            String linea;
            boolean primeraLinea = true; // Indicador para la primera línea

            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Saltar la primera línea de encabezados
                    continue;
                }
                String[] campos = linea.split(",");
                if (campos.length == 15) {
                    String nombre = campos[0];
                    boolean estado = Boolean.parseBoolean(campos[1]);
                    double precio = Double.parseDouble(campos[2]);
                    int numeroCuotasVisa = Integer.parseInt(campos[3]);
                    String marca = campos[4];
                    String modelo = campos[5];
                    int memoriaRAM = Integer.parseInt(campos[6]);
                    String procesador = campos[7];
                    int almacenamientoInterno = Integer.parseInt(campos[8]);
                    boolean extiendeMemoria = Boolean.parseBoolean(campos[9]);
                    boolean cuboCargadorIncluido = Boolean.parseBoolean(campos[10]);
                    boolean es5g = Boolean.parseBoolean(campos[11]);
                    int nivelVolumen = Integer.parseInt(campos[12]);
                    int nivelBrillo = Integer.parseInt(campos[13]);
                    int videoActual = Integer.parseInt(campos[14]);

                    Telefono telefono = new Telefono(nombre, estado, precio, numeroCuotasVisa, marca, modelo, memoriaRAM, procesador, almacenamientoInterno, extiendeMemoria, cuboCargadorIncluido, es5g, nivelVolumen, nivelBrillo, videoActual);
                    dispositivosEnExhibicion.add(telefono);
                    System.out.println(telefono.getNombre() + " Agregado Exitosamente");

                } else {
                    String nombre = campos[0];
                    boolean estado = Boolean.parseBoolean(campos[1]);
                    double precio = Double.parseDouble(campos[2]);
                    int numeroCuotasVisa = Integer.parseInt(campos[3]);
                    String marca = campos[4];
                    String modelo = campos[5];
                    int memoriaRAM = Integer.parseInt(campos[6]);
                    String procesador = campos[7];
                    int almacenamientoInterno = Integer.parseInt(campos[8]);
                    int nivelVolumen = Integer.parseInt(campos[12]);
                    int nivelBrillo = Integer.parseInt(campos[13]);
                    int videoActual = Integer.parseInt(campos[14]);
                    String tipoDiscoDuro = campos[15];
                    Double velocidadCPU = Double.parseDouble(campos[16]);
                    Double velocidadGPU = Double.parseDouble(campos[17]);

                    Computadora computadora = new Computadora(nombre, estado, precio, numeroCuotasVisa, marca, modelo, memoriaRAM, procesador, almacenamientoInterno, tipoDiscoDuro, velocidadCPU, velocidadGPU, nivelVolumen, nivelBrillo, videoActual);
                    dispositivosEnExhibicion.add(computadora);
                    System.out.println(computadora.getNombre() + " Agregada Exitosamente");
                }
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Busca un dispositivo en la exhibición por su nombre.
     *
     * @param nombreDispositivo El nombre del dispositivo a buscar.
     * @return El dispositivo encontrado o null si no se encuentra en la exhibición.
     */
    public DispositivoElectronico seleccionarDispositivo(String nombreDispositivo) {
        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            if (dispositivo.getNombre().equalsIgnoreCase(nombreDispositivo)) {
                return dispositivo;
            }
        }
        return null; // Devuelve null si el dispositivo no se encuentra en la lista.
    }

    /**
     * Encuentra el dispositivo con el precio más alto en la exhibición.
     *
     * @return El dispositivo más caro o null si la lista de dispositivos está vacía.
     */
    public DispositivoElectronico encontrarDispositivoMasCaro() {
        if (dispositivosEnExhibicion.isEmpty()) {
            return null; // Devuelve null si la lista de dispositivos está vacía.
        }

        DispositivoElectronico dispositivoMasCaro = dispositivosEnExhibicion.get(0);

        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            if (dispositivo.getPrecio() > dispositivoMasCaro.getPrecio()) {
                dispositivoMasCaro = dispositivo;
            }
        }
        return dispositivoMasCaro;
    }

    /**
     * Encuentra el dispositivo con el precio más bajo en la exhibición.
     *
     * @return El dispositivo más barato o null si la lista de dispositivos está vacía.
     */
    public DispositivoElectronico encontrarDispositivoMasBarato() {
        if (dispositivosEnExhibicion.isEmpty()) {
            return null; // Devuelve null si la lista de dispositivos está vacía.
        }

        DispositivoElectronico dispositivoMasBarato = dispositivosEnExhibicion.get(0);

        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            if (dispositivo.getPrecio() < dispositivoMasBarato.getPrecio()) {
                dispositivoMasBarato = dispositivo;
            }
        }
        return dispositivoMasBarato;
    }

    /**
     * Imprime información de todos los dispositivos en la exhibición.
     */
    public void imprimirTodosLosProductos() {
        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            System.out.println(dispositivo);
        }
    }
}