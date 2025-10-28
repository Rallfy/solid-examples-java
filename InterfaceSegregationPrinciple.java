package solid_principles;


// Interface Segregation Principle: Small, focused interfaces

//  Bad: Too many methods in one interface
interface Worker {
    void work();
    void eat();
}

//Good: Split interfaces
interface Workable { void work(); }
interface Eatable { void eat(); }

class Robot implements Workable {
    public void work() { System.out.println("Working 24/7!"); }
}

class Human implements Workable, Eatable {
    public void work() { System.out.println("Working..."); }
    public void eat() { System.out.println("Eating..."); }
}

