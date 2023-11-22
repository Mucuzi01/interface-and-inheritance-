public class inheritance{
  public static void main(String[] args) {
    HomeDog myObject = new HomeDog();

    myObject.methodB();
    System.out.println();

    myObject.methodA(); 
    System.out.println();
    myObject.methodD(); 
    System.out.println();

    myObject.methodC(); 
    System.out.println(); 

    myObject.interfaceMethod();
  }
}
class GermanSheperd extends Bat implements E {
  void methodA() {
    System.out.println("GermanSheperd - I am a dog");
  }

  @Override
  public void interfaceMethod() {
    System.out.println("GermanSheperd - I bark");
  }
}

class GunDog extends GermanSheperd {
  void methodD() {
    System.out.println("GunDog - I am a golden retriever");
  }
}
class HomeDog extends GunDog implements E {
  void methodC() {
    System.out.println("HomeDog - I am Max");
  }
}

interface E {
    // Interface method declaration
  void interfaceMethod();
}

// Base class B
class Bat {
  void methodB() {
    System.out.println("Bat - I am a mammal");
  }
}

