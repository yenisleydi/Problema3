public class Deudor{
    private Cliente cliente;
    private int id_deudor;
    private int cantidadAdeudos;
    private double montoDeAdeudo;
    private int fecha;
    private String estadoDeAdeudo;
    private String tipoAdeudo;
    private int diasSinPagar;
    public Deudor(int id_deudor, double montoDeAdeudo, int fecha,String estadoDeAdeudo, String tipoAdeudo, int diasSinPagar,int cantidadAdeudos,
                  int id_cliente, String nombre, String apellidos, String direccion, int telefono,String correo){
        this.id_deudor=id_deudor;
        this.montoDeAdeudo=montoDeAdeudo;
        this.fecha=fecha;
        this.estadoDeAdeudo=estadoDeAdeudo;
        this.tipoAdeudo=tipoAdeudo;
        this.diasSinPagar=diasSinPagar;
        this.cliente=new Cliente(id_cliente,nombre,apellidos,direccion,telefono,correo);

    }
    public Cliente getCliente() {
        return cliente;
    }

    public int getId_deudor() {
        return id_deudor;
    }

    public double getMontoDeAdeudo() {
        return montoDeAdeudo;
    }

    public int getFecha() {
        return fecha;
    }

    public String getEstadoDeAdeudo() {
        return estadoDeAdeudo;
    }

    public String getTipoAdeudo() {
        return tipoAdeudo;
    }

    public int getDiasSinPagar() {
        return diasSinPagar;
    }

    public int getCantidadAdeudos() {
        return cantidadAdeudos;
    }

    private class Cliente{
        private int id_cliente;
        private String nombre;
        private String apellidos;
        private String direccion;
        private  int telefono;
        private String correo;
        private Cliente(int id_cliente, String nombre, String apellidos, String direccion, int telefono,String correo){
            this.id_cliente=id_cliente;
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.direccion=direccion;
            this.telefono=telefono;
            this.correo=correo;
        }

        public int getId_cliente() {
            return id_cliente;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getDireccion() {
            return direccion;
        }

        public int getTelefono() {
            return telefono;
        }

        public String getCorreo() {
            return correo;
        }
        public String toString() {
            return "ID: " + id_cliente +"\n"+
                    " Nombre: " + nombre +"\n"+
                    " Apellidos: " + apellidos+"\n" +
                    " Dirección: " + direccion +"\n"+
                    " Teléfono: " + telefono +"\n"+
                    " Correo: " + correo;
        }

    }

}

