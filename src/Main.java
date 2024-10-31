public class Main {
    public static void main(String[] args) {
        // Crear el zoológico
        Zoologico zoologico = new Zoologico();

        // Crear instancias de 2 Perro y 2 Gato
        Animal gato1 = new Gato("Simón", 3);
        Animal gato2 = new Gato("Ron", 2);
        Animal perro1 = new Perro("Paco", 5);
        Animal perro2 = new Perro("Rex", 4);

        // Agregar animales al zoológico
        zoologico.agregarAnimal(gato1);
        zoologico.agregarAnimal(gato2);
        zoologico.agregarAnimal(perro1);
        zoologico.agregarAnimal(perro2);

        // Mostrar sonidos de todos los animales
        zoologico.mostrarSonidos();

        // Mostrar el conteo de animales por tipo
        zoologico.mostrarConteoPorTipo();
    }
}
