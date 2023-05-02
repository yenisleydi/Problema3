public class Operacion implements Operacion1 {

    @Override
    public void operacion(double montoDeAdeudo, int fecha, String estadoDeAdeudo, String tipoAdeudo, int diasSinPagar, int cantidadAdeudos) {
        double montoAPagar = 0.0;
        if (estadoDeAdeudo=="pendiente"){
            if (tipoAdeudo=="comida") {
                if (cantidadAdeudos == 1 && diasSinPagar <= 15) {
                    montoAPagar = montoDeAdeudo;
                } else {
                    double impuestos = 0.0;
                    if (diasSinPagar > 15) {
                        impuestos = 0.2;
                    } else {
                        impuestos = 0.1;
                    }
                    montoAPagar = montoDeAdeudo * (1 + impuestos);
                }
            } else if (tipoAdeudo=="renta") {
                if (cantidadAdeudos == 1 && diasSinPagar <= 15) {
                    montoAPagar = montoDeAdeudo * 1.05;
                } else {
                    double impuestos = 0.0;
                    if (cantidadAdeudos <= 3) {
                        impuestos = 0.2;
                    } else {
                        impuestos = 0.4;
                    }
                    montoAPagar = montoDeAdeudo * (1 + impuestos);
                }
            }
            System.out.println("El monto a pagar es: " + montoAPagar);
        }
        else {
            System.out.println("No tiene adeudos");
        }
    }
}