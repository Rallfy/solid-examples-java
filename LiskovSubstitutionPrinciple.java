package solid_principles;

// Liskov Substitution Principle: Subclasses must behave


class BirdBad {
    void fly() { System.out.println("Flying..."); }
}

class Penguin extends BirdBad {
    // Violates LSP — penguins can't fly!
    @Override void fly() { throw new UnsupportedOperationException(); }
}

// Fix by proper design
interface BirdGood {}
interface FlyingBird extends BirdGood { void fly(); }

class Eagle implements FlyingBird {
    public void fly() { System.out.println("Flying high!"); }
}

class PenguinProper implements BirdGood { }