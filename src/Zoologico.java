import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Zoologico {
    private List<Animal> animales;
    private Map<String, Integer> conteoPorTipo;

    // Constructor de Zoologico
    public Zoologico() {
        animales = new ArrayList<>();
        conteoPorTipo = new HashMap<>();
    }

    // Metodo para agregar un animal y actualizar el conteo por tipo
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        String tipo = animal.getClass().getSimpleName();
        conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1);
    }

    // Metodo para mostrar los sonidos de todos los animales
    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.print(animal.getNombre() + ": ");
            animal.hacerSonido();
        }
    }

    // Metodo para mostrar el conteo de animales por tipo
    public void mostrarConteoPorTipo() {
        System.out.println("Conteo de animales por tipo:");
        for (Map.Entry<String, Integer> entry : conteoPorTipo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
