import java.io.*;
import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void anadirLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){
        for (Libro libro : libros){
            System.out.println(libro);
        }
    }

    public void serializarLibro() {
        try (FileOutputStream fos = new FileOutputStream("biblioteca.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(libros);
                System.out.println("Lista de libros ha sido serializada!");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo biblioteca.ser: " + e.getMessage());
        }
    }

    public void deserializarLibro() {
        try (FileInputStream fileInput = new FileInputStream("biblioteca.ser");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
                libros = (ArrayList<Libro>) objectInput.readObject();
                System.out.println(libros.toString());
                System.out.println("\nLista de libros deserializada!");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo biblioteca.ser: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}