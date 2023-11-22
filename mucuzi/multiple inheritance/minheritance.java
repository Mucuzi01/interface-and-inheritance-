public class minheritance {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Calling methods from both interfaces
        myObject.methodA();
        myObject.methodB();

        // Calling an additional method in MyClass
        myObject.myClassMethod();
    }
}
// Interface for the first parent
interface A {
    void methodA();
}

// Interface for the second parent
interface B {
    void methodB();
}

// Class implementing both interfaces, achieving multiple inheritance
class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB");
    }

    // Additional methods in MyClass
    void myClassMethod() {
        System.out.println("Additional method in MyClass");
    }
}

