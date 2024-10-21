import java.util.Date;

// Clase que simula el sistema de clonación de contratos
public class SistemaContratos {
    public static void main(String[] args) {
        // Prototipo original del contrato de préstamo
        ContratoPrestamo prototipoContrato = new ContratoPrestamo("Cliente Base", 10000.0, new Date(), new Date(), 5.0);
        System.out.println("Detalles del prototipo de contrato:");
        prototipoContrato.mostrarDetalles();

        // Clonación del contrato para un cliente nuevo
        ContratoPrestamo contratoCliente1 = prototipoContrato.clonar();
        contratoCliente1.setNombreCliente("Juan Pérez");
        contratoCliente1.setMontoPrestamo(15000.0);
        contratoCliente1.setInteres(4.5);
        System.out.println("\nDetalles del contrato personalizado para Juan Pérez:");
        contratoCliente1.mostrarDetalles();

        // Clonación del contrato para otro cliente
        ContratoPrestamo contratoCliente2 = prototipoContrato.clonar();
        contratoCliente2.setNombreCliente("María García");
        contratoCliente2.setMontoPrestamo(20000.0);
        contratoCliente2.setInteres(3.8);
        System.out.println("\nDetalles del contrato personalizado para María García:");
        contratoCliente2.mostrarDetalles();
    }
}
