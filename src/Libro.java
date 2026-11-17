public class Libro {
    String titulo;
    int paginas;
    
    void MostrarDatos() {
        System.out.println(titulo);
        System.out.println(paginas);
    }

    boolean esLargo() {
        if(paginas > 300) {
            return true;
        } else {
            return false;
        }
    }
}
