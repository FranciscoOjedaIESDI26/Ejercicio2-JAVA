public class Principal {
    public static void main(String[] args){
        Libro Libro1 = new Libro();
        Libro Libro2 = new Libro();
        Libro Libro3 = new Libro();

        Libro1.titulo = "Harry Potter";
        Libro1.paginas = 600;

        Libro2.titulo = "Las Cronicas de Narnia";
        Libro2.paginas = 1000;

        Libro3.titulo = "El Principito";
        Libro3.paginas = 200;

        Libro1.MostrarDatos();
        System.out.println("Es largo? " + Libro1.esLargo());
        Libro2.MostrarDatos();
        System.out.println("Es largo? " + Libro2.esLargo());
        Libro3.MostrarDatos();
        System.out.println("Es largo? " + Libro3.esLargo());

    
    }
}
