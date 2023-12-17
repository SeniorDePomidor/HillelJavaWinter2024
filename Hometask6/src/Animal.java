public class Animal {
    public static int numberAnimals;
    private static final int limitRunningDistance=500;
    private static final int limitSwimmingDistance=10;
    private String name;

    public void run(int n){
        if(n<=limitRunningDistance) {
            System.out.println("Animal " + name + " is running " + n + " metres");
        }
        else {
            System.out.println("Animal "+ name+" is not able to run so much");
        }
    }
    public void swim(int n) {
        if (n <= limitSwimmingDistance) {
            System.out.println("Animal " + name + " is swimming " + n + " metres");
        }else{
            System.out.println("Animal "+ name+" is not able to swim so much");
        }
    }

    public Animal(String name) {
        this.name = name;
        ++numberAnimals;
    }

    public Animal() {
        ++numberAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
