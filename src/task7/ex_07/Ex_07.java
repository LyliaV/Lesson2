package task7.ex_07;

public class Ex_07 {
    /**
     * Реализуйте Enum класс Animal. Реализуйте его поля: Dog, Cat, Cow.
     * Каждое из полей должно содержать свое имя животного и свою реализацию метода makeSound().
     * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
     * Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow" или "moo".
     * В main() создать и наполнить в произвольном порядке объектами разных инстанций массив типа Animal.*
     * в цикле вызвать у каждого элемента его метод makeSound
     */


    public static void main(String[] args) {
        new Ex_07().run();
    }

    public void run() {

        Animals[] Animals = new Animals[]{
                new Animals(Animal.DOG),
                new Animals(Animal.CAT),
                new Animals(Animal.COW),
        };

        for (int i = 0; i < Animals.length; i++) {
            if (i == 0) {
                System.out.print(Animals[i].name + " говорит " + Animals[i].sound);
            } else {
                System.out.print("\n" + Animals[i].name + " говорит " + Animals[i].sound);
            }
        }
    }


}

