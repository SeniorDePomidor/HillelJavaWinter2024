public class Dog extends Animal{
    public static int numberDogs;
    private static final int limitRunningDistance=500;
    private static final int limitSwimmingDistance=10;
    private String name;

    @Override
    public void run(int n) {
        if(n<=limitRunningDistance) {
            System.out.println("Dog " + name + " is running " + n + " metres");
        }
        else {
            System.out.println("Dog "+ name+" is not able to run so much");
        }
    }

    @Override
    public void swim(int n) {
        if (n <= limitSwimmingDistance) {
            System.out.println("Dog " + name + " is swimming " + n + " metres");
        }else{
            System.out.println("Dog "+ name+" is not able to swim so much");
        }
    }

    public Dog(String name) {
        super(name);
        this.name = name;
        ++numberDogs;
    }

    public Dog() {
        super();
        ++numberDogs;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        this.name=name;
    }

}
