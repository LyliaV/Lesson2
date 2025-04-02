package task7.ex_07;

final public class Animals {

    String name;
    String sound;

    Animals( Animal animal ){
        this.name = animal.name;
        this.sound = animal.makeSound();
    }
}
