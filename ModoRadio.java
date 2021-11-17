public interface ModoRadio {
    void Switch();
    void cambiarEmisora(boolean sentido);
    void guardarEmisora(String nombre);
    void cargarEmisora(Vista v);
}
