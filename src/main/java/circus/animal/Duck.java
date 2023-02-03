<<<<<<<< HEAD:src/main/java/circus/animals/Duck.java
package circus.animals;
========
package circus.animal;
>>>>>>>> improvecode:src/main/java/circus/animal/Duck.java

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public int getValue() {
        return 10;
    }
}
