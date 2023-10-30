import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

// Clase ElectroTechController
public class ElectroTechController {
    private ArrayList<DispositivoElectronico> dispositivosEnExhibicion = new ArrayList<>();

    public void cargarDatosDesdeCSV(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Salta la primera línea (encabezados)
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println("Dispotivo Agregado: " + line);

                String[] parts = line.split(",");
                
                String nombre = parts[0];
                boolean estado = Boolean.parseBoolean(parts[1]);
                double precio = Double.parseDouble(parts[2]);
                int numeroCuotasVisa = Integer.parseInt(parts[3]);
                String marca = parts[4];
                String modelo = parts[5];

                // Verifica el tipo de dispositivo (teléfono o computadora) y crea el objeto correspondiente
                if (parts.length == 14) {
                    int memoriaRAM = Integer.parseInt(parts[6]);
                    String procesador = parts[7];
                    int almacenamientoInterno = Integer.parseInt(parts[8]);
                    boolean extiendeMemoria = Boolean.parseBoolean(parts[9]);
                    boolean cuboCargadorIncluido = Boolean.parseBoolean(parts[10]);
                    boolean es5g = Boolean.parseBoolean(parts[11]);
                    int nivelVolumen = Integer.parseInt(parts[12]);
                    int nivelBrillo = Integer.parseInt(parts[13]);
                    int videoActual = Integer.parseInt(parts[14]);

                    dispositivosEnExhibicion.add(new Telefono(nombre, precio, numeroCuotasVisa, marca, modelo,
                            memoriaRAM, procesador, almacenamientoInterno, extiendeMemoria, cuboCargadorIncluido,
                            es5g, nivelVolumen, nivelBrillo, videoActual));
                    
                } else if (parts.length == 19) {
                    int memoriaRAM = Integer.parseInt(parts[6]);
                    String tipoDiscoDuro = parts[17];
                    double velocidadCPU = Double.parseDouble(parts[18]);
                    double velocidadGPU = Double.parseDouble(parts[19]);
                    int nivelVolumen = Integer.parseInt(parts[14]);
                    int nivelBrillo = Integer.parseInt(parts[15]);
                    int videoActual = Integer.parseInt(parts[16]);

                    dispositivosEnExhibicion.add(new Computadora(nombre, precio, numeroCuotasVisa, marca, modelo,
                            memoriaRAM, tipoDiscoDuro, velocidadCPU, velocidadGPU, nivelVolumen, nivelBrillo, videoActual));
                           
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public DispositivoElectronico seleccionarDispositivo(int seleccion) {
        // Verifica si hay dispositivos en la lista
        if (dispositivosEnExhibicion.isEmpty()) {
            return null;
        }
    
        // Verifica si la selección está en el rango válido
        if (seleccion >= 1 && seleccion <= dispositivosEnExhibicion.size()) {
            return dispositivosEnExhibicion.get(seleccion - 1); // Restamos 1 porque los índices comienzan desde 0
        } else {
            return null;
        }
    }

    public DispositivoElectronico mostrarDispositivoCaro() {
        if (dispositivosEnExhibicion.isEmpty()) {
            return null;
        }
    
        DispositivoElectronico dispositivoMasCaro = dispositivosEnExhibicion.get(0);  // Inicialmente, el primer dispositivo es el más caro
    
        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            if (dispositivo.getPrecio() > dispositivoMasCaro.getPrecio()) {
                dispositivoMasCaro = dispositivo;  // Si encontramos un dispositivo más caro, actualizamos el dispositivo más caro
            }
        }
    
        return dispositivoMasCaro;
    }
    
    public DispositivoElectronico mostrarDispositivoBarato() {
        // Implementa la búsqueda y muestra del dispositivo más barato
        return Collections.min(dispositivosEnExhibicion);
    }

    public void imprimirTodosLosProductos() {
        if (dispositivosEnExhibicion.isEmpty()) {
            System.out.println("No hay dispositivos en exhibición.");
            return;
        }
    
        System.out.println("Lista de dispositivos en exhibición:");
        for (DispositivoElectronico dispositivo : dispositivosEnExhibicion) {
            System.out.println(dispositivo);
        }
    }
}
