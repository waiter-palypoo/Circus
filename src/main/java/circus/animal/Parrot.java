<<<<<<<< HEAD:src/main/java/circus/animals/Parrot.java
package circus.animals;
========
package circus.animal;
>>>>>>>> improvecode:src/main/java/circus/animal/Parrot.java

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public int getValue() {
        return 20;
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    public int getValue() {
        return 20;
    }
}
