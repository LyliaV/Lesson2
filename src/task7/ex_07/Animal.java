package task7.ex_07;

public enum Animal {

    DOG("Петр") {
        public String makeSound() {
            return "woof";
        }
    },

    CAT("Анфиса") {
        public String makeSound() {
            return "meow";
        }
    },

    COW("София") {
        public String makeSound() {
            return "moo";
        }
    };

    public final String name;

    Animal(final String name) {
        this.name = name;
    };

    public abstract String makeSound();

}
