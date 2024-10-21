import java.util.Date;

// Interfaz Cloneable para el patrón Prototype
interface Contrato extends Cloneable {
    Contrato clonar();
    void mostrarDetalles();
}

// Implementación concreta del prototipo ContratoPrestamo
public class ContratoPrestamo implements Contrato {
    private String nombreCliente;
    private double montoPrestamo;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private double interes;

    public ContratoPrestamo(String nombreCliente, double montoPrestamo, Date fechaInicio, Date fechaVencimiento, double interes) {
        this.nombreCliente = nombreCliente;
        this.montoPrestamo = montoPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.interes = interes;
    }

    // Clonación del contrato de préstamo
    @Override
    public ContratoPrestamo clonar() {
        try {
            return (ContratoPrestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Personalización del contrato
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Contrato de Préstamo para: " + nombreCliente);
        System.out.println("Monto del Préstamo: $" + montoPrestamo);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        System.out.println("Interés: " + interes + "%");
    }
}

