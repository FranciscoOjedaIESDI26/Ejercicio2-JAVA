public class Principal {
    public static void main(String[] args){
        Libro[] biblioteca = new Libro[3];
        biblioteca[0] = new Libro();
        biblioteca[1] = new Libro();
        biblioteca[2] = new Libro();

        biblioteca[0].titulo = "Harry Potter";
        biblioteca[0].paginas = 600;

        biblioteca[1].titulo = "Las Cronicas de Narnia";
        biblioteca[1].paginas = 1000;

        biblioteca[2].titulo = "El Principito";
        biblioteca[2].paginas = 200;

        for(int i = 0; i < biblioteca.length; i++) {
            biblioteca[i].MostrarDatos();
            if(biblioteca[i].esLargo()) {
                System.out.println("El libro es largo");
            } else {
                System.out.println("El libro es corto");
            }
        }
    
    }
}
