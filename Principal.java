/**
 * Clase Principal que gestiona la interacción con dispositivos electrónicos.
 *
 * @author Javier Alexander Linares Chang - carnet 231135
 * @version 1.0
 * @since 2023-10-29
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de ElectroTechController
        ElectroTechController electroTechController = new ElectroTechController();
        // Nombre del archivo CSV con los datos de los dispositivos
        String archivoCSV = "ElectroTech.csv";
        System.out.println("Cargando Datos...");
         // Cargar datos desde el archivo CSV
        electroTechController.cargarDatosDesdeCSV(archivoCSV);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---------Menú Principal---------");
            System.out.println("1. Información de un dispositivo");
            System.out.println("2. Controlar un dispositivo");
            System.out.println("3. Encontrar Dispositivo más Caro");
            System.out.println("4. Encontrar Dispositivo más Barato");
            System.out.println("5. Todos los dispositivos");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            System.out.println(" ");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del dispositivo: ");
                    scanner.nextLine(); // Consumir la nueva línea
                    String nombreDispositivo = scanner.nextLine();
                    DispositivoElectronico dispositivo = electroTechController.seleccionarDispositivo(nombreDispositivo);
                    if (dispositivo != null){
                        if (dispositivo.getNombre().equalsIgnoreCase(nombreDispositivo)) {
                            System.out.println("---Información del dispositivo seleccionado:---");
                            System.out.println("Nombre: " + dispositivo.getNombre());
                            System.out.println("Estado: " + (dispositivo.estado ? "Encendido" : "Apagado"));
                            
                            if (dispositivo.estado == true) {
                                if (dispositivo instanceof Telefono) {
                                    Telefono telefono = (Telefono) dispositivo;
                                    System.out.println("Número del video actual: " + telefono.getVideoActual());
                                    System.out.println("Nivel de Volumen: " + telefono.getNivelVolumen());
                                    System.out.println("Nivel de Brillo: " + telefono.getNivelBrillo());
                                } else if (dispositivo instanceof Computadora) {
                                    Computadora computadora = (Computadora) dispositivo;
                                    System.out.println("Número del video actual: " + computadora.getVideoActual());
                                    System.out.println("Nivel de Volumen: " + computadora.getNivelVolumen());
                                    System.out.println("Nivel de Brillo: " + computadora.getNivelBrillo());
                                }
                            }
                        }
                    }else{
                        System.out.println("El dispositivo no se encontró en la lista.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del dispositivo: ");
                    scanner.nextLine(); // Consumir la nueva línea
                    String nombreDispositivo2 = scanner.nextLine();
                    DispositivoElectronico dispositivo2 = electroTechController.seleccionarDispositivo(nombreDispositivo2);
                    if (dispositivo2 != null){
                        if (dispositivo2.getNombre().equalsIgnoreCase(nombreDispositivo2)) {
                            System.out.println("---Información del dispositivo seleccionado:---");
                            System.out.println("Nombre: " + dispositivo2.getNombre());
                            System.out.println("Estado: " + (dispositivo2.estado ? "Encendido" : "Apagado"));
                            if (dispositivo2.estado == true) {
                                if (dispositivo2 instanceof Telefono) {
                                    Telefono telefono = (Telefono) dispositivo2;
                                    System.out.println("Número del video actual: " + telefono.getVideoActual());
                                    System.out.println("Nivel de Volumen: " + telefono.getNivelVolumen());
                                    System.out.println("Nivel de Brillo: " + telefono.getNivelBrillo());
                                } else if (dispositivo2 instanceof Computadora) {
                                    Computadora computadora = (Computadora) dispositivo2;
                                    System.out.println("Número del video actual: " + computadora.getVideoActual());
                                    System.out.println("Nivel de Volumen: " + computadora.getNivelVolumen());
                                    System.out.println("Nivel de Brillo: " + computadora.getNivelBrillo());
                                }
                            }

                            System.out.println("\nMenú de Control de Dispositivo:");
                            System.out.println("1. Encender");
                            System.out.println("2. Apagar");
                            System.out.println("3. Subir Volumen");
                            System.out.println("4. Bajar Volumen");
                            System.out.println("5. Aumentar Brillo");
                            System.out.println("6. Disminuir Brillo");
                            System.out.println("7. Controlar Videos");
                            System.out.println("0. Volver al Menú Principal");
                            System.out.print("Ingrese su opción: ");
                            int opcion2 = scanner.nextInt();
                            System.out.println(" ");

                            switch (opcion2) {
                                case 1:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            telefono.setEstado(true);
                                            System.out.println("Dispositivo Encendido");
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            computadora.setEstado(true);
                                            System.out.println("Dispositivo Encendido");
                                        }
                                    }
                                    break;
                                case 2:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            telefono.setEstado(false);
                                            System.out.println("Dispositivo Apagado");
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            computadora.setEstado(false);
                                            System.out.println("Dispositivo Apagado");
                                        }
                                    }
                                    break;
                                case 3:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            System.out.println("Volumen del dispositivo antes: " + telefono.getNivelVolumen());
                                            telefono.subirVolumen();
                                            System.out.println("Volumen del dispositivo ahora: " + telefono.getNivelVolumen());
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            System.out.println("Volumen del dispositivo antes: " + computadora.getNivelVolumen());
                                            computadora.subirVolumen();
                                            System.out.println("Volumen del dispositivo ahora: " + computadora.getNivelVolumen());
                                        }
                                    }
                                    break;
                                case 4:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            System.out.println("Volumen del dispositivo antes: " + telefono.getNivelVolumen());
                                            telefono.bajarVolumen();
                                            System.out.println("Volumen del dispositivo ahora: " + telefono.getNivelVolumen());
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            System.out.println("Volumen del dispositivo antes: " + computadora.getNivelVolumen());
                                            computadora.bajarVolumen();
                                            System.out.println("Volumen del dispositivo ahora: " + computadora.getNivelVolumen());
                                        }
                                    }
                                    break;
                                case 5:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            System.out.println("Brillo del dispositivo antes: " + telefono.getNivelBrillo());
                                            telefono.aumentarBrillo();
                                            System.out.println("Brillo del dispositivo ahora: " + telefono.getNivelBrillo());
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            System.out.println("Brillo del dispositivo antes: " + computadora.getNivelBrillo());
                                            computadora.aumentarBrillo();
                                            System.out.println("Brillo del dispositivo ahora: " + computadora.getNivelBrillo());
                                        }
                                    }
                                    break;
                                case 6:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            System.out.println("Brillo del dispositivo antes: " + telefono.getNivelBrillo());
                                            telefono.disminuirBrillo();
                                            System.out.println("Brillo del dispositivo ahora: " + telefono.getNivelBrillo());
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            System.out.println("Brillo del dispositivo antes: " + computadora.getNivelBrillo());
                                            computadora.disminuirBrillo();
                                            System.out.println("Brillo del dispositivo ahora: " + computadora.getNivelBrillo());
                                        }
                                    }
                                    break;
                                case 7:
                                    if (dispositivo2.estado == true) {
                                        if (dispositivo2 instanceof Telefono) {
                                            Telefono telefono = (Telefono) dispositivo2;
                                            System.out.println("Video antes: " + telefono.getVideoActual());
                                            telefono.controlarVideos();
                                            int video = scanner.nextInt();
                                            telefono.setVideoActual(video);
                                            System.out.println("Video Ahora: " + telefono.getVideoActual());
                                        } else if (dispositivo2 instanceof Computadora) {
                                            Computadora computadora = (Computadora) dispositivo2;
                                            System.out.println("Video antes: " + computadora.getVideoActual());
                                            computadora.controlarVideos();
                                            int video = scanner.nextInt();
                                            computadora.setVideoActual(video);
                                            System.out.println("Video Ahora: " + computadora.getVideoActual());
                                        }
                                    }
                                    break;
                                case 0:
                                    // Volver al Menú Principal
                                    break;
                                default:
                                    System.out.println("Opción no válida. Intente de nuevo.");
                            }
                        }
                    }else{
                        System.out.println("El dispositivo no se encontró en la lista.");
                    }
                    break;
                case 3:
                    DispositivoElectronico dispositivoMasCaro = electroTechController.encontrarDispositivoMasCaro();
                    if (dispositivoMasCaro != null) {
                        System.out.println("El dispositivo más barato es: " + dispositivoMasCaro.getNombre());
                        System.out.println("Con un precio de: " + dispositivoMasCaro.getPrecio());
                    } else {
                        System.out.println("La lista de dispositivos está vacía.");
                    }
                    break;
                case 4:
                    DispositivoElectronico dispositivoMasBarato = electroTechController.encontrarDispositivoMasBarato();
                    if (dispositivoMasBarato != null) {
                        System.out.println("El dispositivo más barato es: " + dispositivoMasBarato.getNombre());
                        System.out.println("Con un precio de: " + dispositivoMasBarato.getPrecio());
                    } else {
                        System.out.println("La lista de dispositivos está vacía.");
                    }
                    break;
                case 5:
                    System.out.println("Lista de dispositivos en exhibición:");
                    electroTechController.imprimirTodosLosProductos();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
