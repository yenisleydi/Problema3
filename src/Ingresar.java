import java.util.Scanner;

public class Ingresar {
    private Deudor[] deudores;
    private int numDeudores;

    public Ingresar() {
        this.deudores = new Deudor[10];
        this.numDeudores = 0;
    }

    public void ingresarDeudor() {
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos del cliente
        System.out.print("Ingrese el id del cliente: ");
        int idCliente = scanner.nextInt();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidosCliente = scanner.next();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccionCliente = scanner.next();
        System.out.print("Ingrese el teléfono del cliente: ");
        int telefonoCliente = scanner.nextInt();
        System.out.print("Ingrese el correo del cliente: ");
        String correoCliente = scanner.next();


        System.out.print("Ingrese el id del deudor: ");
        int idDeudor = scanner.nextInt();
        System.out.print("Ingrese el monto de adeudo: ");
        double montoDeAdeudo = scanner.nextDouble();
        System.out.print("Ingrese la fecha de la deuda: ");
        int fecha = scanner.nextInt();
        System.out.print("Ingrese el estado de la deuda: ");
        String estadoDeAdeudo = scanner.next();
        System.out.print("Ingrese el tipo de adeudo: ");
        String tipoAdeudo = scanner.next();
        System.out.println("Ingrese la cantidad de adeudos:");
        int cantidadAdeudos=scanner.nextInt();
        System.out.print("Ingrese los días sin pagar: ");
        int diasSinPagar = scanner.nextInt();

        Deudor deudor;
        deudor = new Deudor(idDeudor,montoDeAdeudo,fecha,estadoDeAdeudo,tipoAdeudo,diasSinPagar,cantidadAdeudos,
                    idCliente,nombre,apellidosCliente,direccionCliente,telefonoCliente,correoCliente);
        deudores[numDeudores] = deudor;
        numDeudores++;

        System.out.println("Deudor agregado con éxito.");
        Operacion operacion = new Operacion();
        operacion.operacion(montoDeAdeudo,fecha,estadoDeAdeudo,tipoAdeudo,diasSinPagar,cantidadAdeudos);
    }
    public void mostrarDeudores() {
        System.out.println("Lista de deudores:");
        for (int i = 0; i < numDeudores; i++) {
            System.out.println("Deudor " + (i + 1));
            System.out.println("ID: " + deudores[i].getId_deudor());
            System.out.println("Monto de adeudo: " + deudores[i].getMontoDeAdeudo());
            System.out.println("Fecha: " + deudores[i].getFecha());
            System.out.println("Estado de adeudo: " + deudores[i].getEstadoDeAdeudo());
            System.out.println("Tipo de adeudo: " + deudores[i].getTipoAdeudo());
            System.out.println("Cantidad de adeusdos:"+deudores[i].getCantidadAdeudos());
            System.out.println("Días sin pagar: " + deudores[i].getDiasSinPagar());
            System.out.println(deudores[i].getCliente());
        }
    }
}