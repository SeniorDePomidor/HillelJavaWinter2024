public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephoneNumber;
    private int age;

    public Employee(String name, String position, String email, String telephoneNumber, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("Name ="+name+
                " ,Position ="+position+
                " ,Email ="+email+
                " ,telephoneNumber ="+telephoneNumber
                +" ,Age ="+age);
    }
}
