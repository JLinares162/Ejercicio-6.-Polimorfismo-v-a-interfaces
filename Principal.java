public class Principal {
    public static void main(String[] args) {
        ElectroTechController electroTechController = new ElectroTechController();

        String filePath = "ElectroTech.csv";
        electroTechController.cargarDatosDesdeCSV(filePath);
        
        DispositivoElectronico dispositivoCaro = electroTechController.mostrarDispositivoCaro();

        if (dispositivoCaro != null) {
            System.out.println("Dispositivo más caro:");
            System.out.println(dispositivoCaro);
        } else {
            System.out.println("No hay dispositivos en exhibición.");
        }

        
        electroTechController.imprimirTodosLosProductos();
    
    }
}