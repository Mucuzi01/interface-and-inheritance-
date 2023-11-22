public class hinheritance1 {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Square mySquare = new Square();

        myCircle.draw(); // Overrides draw() in Shape
        mySquare.draw(); // Overrides draw() in Shape
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

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
