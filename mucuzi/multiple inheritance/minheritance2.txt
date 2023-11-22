
public class minheritance2{
    public static void main(String[] args) {
        // Creating an object of Bird
        Bird myBird = new Bird();

        // Calling methods from both interfaces
        myBird.fly();
        myBird.swim();

        // Calling an additional method in Bird
        myBird.chirp();
    }
}
interface Flying {
    void fly();
}
interface Swimming {
    void swim();
}

class Bird implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("A bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("A bird is swimming.");
    }
    void chirp() {
        System.out.println("Chirp chirp!");
    }
}
