public class binterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();

        Cat myCat = new Cat();
        myCat.sound(); 
    }
}
interface Animal {
    void sound();
}


class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

