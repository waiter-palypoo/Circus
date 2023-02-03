package circus;

<<<<<<< HEAD
import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;
import circus.animals.Parrot;
=======
import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;
>>>>>>> improvecode

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
<<<<<<< HEAD
        train(new Parrot());

        // Animal a2 = new Animal();
        // Bird b2 = new Bird();

=======
        // train(new animal.Parrot());
>>>>>>> improvecode
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
<<<<<<< HEAD
        } else {
            System.out.println("Not a duck! Not a duck!!");
=======
>>>>>>> improvecode
        }
    }
}
