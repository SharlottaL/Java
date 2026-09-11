public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void makeSound()
    {
        System.out.println("Животное издаёт звук");
    }
}
