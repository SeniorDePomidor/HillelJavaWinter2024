public class Cat extends Animal{
    public static int numberCats;
    private static final int limitRunningDistance=200;
    private static final int limitSwimmingDistance=0;
    private String name;

    @Override
    public void run(int n) {
        if(n<=limitRunningDistance) {
            System.out.println("Cat " + name + " is running " + n + " metres");
        }
        else {
            System.out.println("Cat "+ name+" is not able to run so much");
        }
    }

    @Override
    public void swim(int n) {
        if (n <= limitSwimmingDistance) {
            System.out.println("Cat " + name + " is swimming " + n + " metres");
        }else{
            System.out.println("Cat "+ name+" is not able to swim so much");
        }
    }

    public Cat(String name) {
        super(name);
        this.name = name;
        ++numberCats;
    }

    public Cat() {
        super();
        ++numberCats;
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
