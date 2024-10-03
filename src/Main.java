public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "Orwell", "MSK876", 50.99, 30.99);
        Libro libro2 = new Libro("Atomic Habist", "James", "989OSK", 80.99, 36.99);
        Libro libro3 = new Libro("Padre Rico Padre Pobre", "Robert Kiyosaki", "6764SM", 12.99, 10.99);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.anadirLibro(libro1);
        biblioteca.anadirLibro(libro2);
        biblioteca.anadirLibro(libro3);

        System.out.println("Mostrar Libros antes de ser serializados:");
        biblioteca.mostrarLibros();

        System.out.println("Se procederá a serializar la lista de libros");
        biblioteca.serializarLibro();

        System.out.println("Iniciando deserialización de la lista de libros");
        biblioteca.deserializarLibro();
    }
}
