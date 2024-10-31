abstract class Animal {
    private String nombre;
    private int edad;

    // Constructor de Animal
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo abstracto hacer sonido
    public abstract void hacerSonido();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

