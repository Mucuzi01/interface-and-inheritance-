public class sinheritance2 {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw(); // Overrides draw() in Shape
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

