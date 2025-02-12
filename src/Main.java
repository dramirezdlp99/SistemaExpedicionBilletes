public class Main {
    public static void main(String[] args) {
        // Seleccionar destino
        String destino = SeleccionDestino.seleccionar();
        double precio = SeleccionDestino.obtenerPrecio(destino);

        // Mostrar información en la interfaz
        InterfazUsuario.mostrarMensaje("Destino seleccionado: " + destino);
        InterfazUsuario.mostrarMensaje("Precio: $" + precio);

        // Validar tarjeta
        if (LectorTarjeta.validar()) {
            // Procesar pago
            if (ProcesadorPago.realizarPago(precio)) {
                // Imprimir boleto
                ImpresorBoletos.imprimir(destino);
                InterfazUsuario.mostrarMensaje("✅ Boleto emitido con éxito. ¡Buen viaje!");
            } else {
                InterfazUsuario.mostrarMensaje("⚠ Error en el pago. Inténtalo de nuevo.");
            }
        } else {
            InterfazUsuario.mostrarMensaje("⚠ Validación de tarjeta fallida.");
        }
    }
}
