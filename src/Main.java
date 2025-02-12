public class Main {
    public static void main(String[] args) {
        InterfazUsuario interfaz = new InterfazUsuario();
        LectorTarjeta lectorTarjeta = new LectorTarjeta();
        ProcesadorPago procesadorPago = new ProcesadorPago();
        SeleccionProducto seleccionProducto = new SeleccionProducto();
        DispensadorBoletos dispensador = new DispensadorBoletos();
        RegistroTransacciones registro = new RegistroTransacciones();
        ImpresoraBoletos impresora = new ImpresoraBoletos();

        interfaz.mostrarMensaje("Bienvenido a la máquina expendedora de boletos.");
        interfaz.mostrarMensaje("Ingrese su destino:");
        String destino = interfaz.recibirEntrada();

        interfaz.mostrarMensaje("Inserte su tarjeta para procesar el pago...");
        if (lectorTarjeta.validarTarjeta("1234-5678-9012-3456")) {
            if (procesadorPago.procesarPago(50.0)) {
                registro.registrarCompra(destino, 50.0);
                seleccionProducto.seleccionarBoleto(destino);
                impresora.imprimirBoleto(destino);
                dispensador.dispensarBoleto(destino);
                interfaz.mostrarMensaje("Gracias por su compra.");
            }
        }
    }
}
