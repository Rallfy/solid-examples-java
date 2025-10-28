package solid_principles;

// Open/Closed Principle: Add new, don’t break old

// Bad: We modify existing code to add new shapes
class AreaCalculatorBAD {
    double area(Object shape) {
        if (shape instanceof Circle c) return Math.PI * c.radius * c.radius;
        else if (shape instanceof Square s) return s.side * s.side;
        return 0;
    }
}

// Good: Extend via polymorphism
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { this.radius = r; }
    public double area() { return Math.PI * radius * radius; }
}

class Square implements Shape {
    double side;
    Square(double s) { this.side = s; }
    public double area() { return side * side; }
}

class AreaCalculatorGood {
    double area(Shape shape) { return shape.area(); }
}