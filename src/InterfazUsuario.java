public class InterfazUsuario {
    private Pantalla pantalla;
    private Teclado teclado;

    public InterfazUsuario() {
        this.pantalla = new Pantalla();
        this.teclado = new Teclado();
    }

    public void mostrarMensaje(String mensaje) {
        pantalla.mostrarMensaje(mensaje);
    }

    public String recibirEntrada() {
        return teclado.obtenerEntrada();
    }
}
