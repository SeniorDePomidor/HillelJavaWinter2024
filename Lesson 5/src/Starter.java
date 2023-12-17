public class Starter {
    public static void main(String[] args) {
        Employee employee1=new Employee("Vasylenko Vasyl Vasylyovych", "Commandante", "iamboss@gmail.com", "911", 25);
        System.out.println(employee1.getName());
        Employee employee2=new Employee();
        employee2.setName("Mykolenko Mykola Mykolayovych");
        System.out.println(employee1);
        System.out.println(employee2);

        SomePackage.SomeClass someClass1= new SomePackage.SomeClass();
        someClass1.print();
        SomeClass someClass2=new SomeClass();
        someClass2.print();

        Car car=new Car();
        car.start();
    }
}
