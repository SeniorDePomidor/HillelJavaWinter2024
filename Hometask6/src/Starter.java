public class Starter {
    public static void main(String[] args) {
        Dog dog1=new Dog("Mukhtar");
        Dog dog2=new Dog();
        dog2.setName("Roy");
        Animal animal=new Animal("Some Animal");
        Cat cat1=new Cat("Murzik");
        Cat cat2=new Cat();
        cat2.setName("Shani");
        dog1.run(50);
        dog2.swim(400);
        animal.run(150);
        cat1.swim(90);
        cat2.run(100);
        System.out.println("Total animals "+ Animal.numberAnimals);
        System.out.println("Total dogs "+ Dog.numberDogs);
        System.out.println("Total cats "+ Cat.numberCats);
    }
}
