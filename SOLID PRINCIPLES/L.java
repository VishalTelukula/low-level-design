// Superclass
class Bird {
    void fly() {
        System.out.println("This bird is flying");
    }
}

// Subclass that violates LSP
class Penguin extends Bird {
    // Penguins cannot fly, but we are forcing them to support fly()
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}

public class L {
    public static void main(String[] args) {
        Bird bird = new Penguin(); // LSP violation
        bird.fly(); // This will break the program at runtime
    }
}
//**************************/// we can solve the above bad example by a good one///******************************* */

// Superclass
class Bird {
    void eat() {
        System.out.println("This bird is eating");
    }
}

// Separate interface for birds that can fly
interface Flyable {
    void fly();
}

// Sparrow can fly, so it implements Flyable
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Penguin does NOT implement Flyable, avoiding LSP violation
class Penguin extends Bird {
    void swim() {
        System.out.println("Penguin is swimming");
    }
}

public class Main {
    public static void main(String[] args) {
        Flyable flyingBird = new Sparrow(); // Substituting a Sparrow where Flyable is expected
        flyingBird.fly(); // ✅ Works fine
        
        Bird penguin = new Penguin(); // Substituting a Penguin where Bird is expected
        penguin.eat(); // ✅ Works fine, no fly() method issues
    }
}

