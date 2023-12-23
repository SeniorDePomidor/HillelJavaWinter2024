import java.util.Arrays;
import java.util.Random;

public class Subscriber implements SubscriberService{
    public static int numberOfSubscribers;
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private String contactNumber;
    private double balance;
    private double cityCallDuration;
    private double interCityCallDuration=0.0;
    private double internetTraffic;

    public Subscriber(String lastName, String firstName, String city, String phoneNumber, String contactNumber, double balance, double cityCallDuration, double interCityCallDuration, double internetTraffic) {
        ++numberOfSubscribers;
        this.id = numberOfSubscribers;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contactNumber = contactNumber;
        this.balance = balance;
        this.cityCallDuration = cityCallDuration;
        this.interCityCallDuration = interCityCallDuration;
        this.internetTraffic = internetTraffic;
    }

    public Subscriber() {
        ++numberOfSubscribers;
        this.id = numberOfSubscribers;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCityCallDuration() {
        return cityCallDuration;
    }

    public void setCityCallDuration(double cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public double getInterCityCallDuration() {
        return interCityCallDuration;
    }

    public void setInterCityCallDuration(double interCityCallDuration) {
        this.interCityCallDuration = interCityCallDuration;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDuration=" + cityCallDuration +
                ", interCityCallDuration=" + interCityCallDuration +
                ", internetTraffic=" + internetTraffic +
                "}\n";
    }

    public static void main(String[] args) {
        int n=10;
        Subscriber[] subs=new Subscriber[n];
        for (int i = 0; i < n; i++) {
            subs[i]=new Subscriber();
            Random random=new Random();
            int k=random.nextInt(3);
            int j=random.nextInt(5);
            int l=random.nextInt(4);
            switch (k){
                case 0:
                    subs[i].setLastName("Ivanov");
                    subs[i].setPhoneNumber("101");
                    subs[i].setContactNumber("101");
                    subs[i].setInterCityCallDuration(random.nextDouble()*100);
                    break;
                case 1:
                    subs[i].setLastName("Petrov");
                    subs[i].setPhoneNumber("102");
                    subs[i].setContactNumber("102");
                    break;
                case 2:
                    subs[i].setLastName("Sydorov");
                    subs[i].setPhoneNumber("103");
                    subs[i].setContactNumber("103");
                    break;

            }
            switch (j){
                case 0:
                    subs[i].setFirstName("Ivan");
                    subs[i].setBalance(random.nextDouble()*500-250);
                    subs[i].setCityCallDuration(random.nextDouble()*100);
                    break;
                case 1:
                    subs[i].setFirstName("Petro");
                    subs[i].setBalance(random.nextDouble()*1500-750);
                    subs[i].setCityCallDuration(random.nextDouble()*200);
                    break;
                case 2:
                    subs[i].setFirstName("Vasyl");
                    subs[i].setBalance(random.nextDouble()*2500-1250);
                    subs[i].setCityCallDuration(random.nextDouble()*300);
                    break;
                case 3:
                    subs[i].setFirstName("Dmytro");
                    subs[i].setBalance(random.nextDouble()*5000-2500);
                    subs[i].setCityCallDuration(random.nextDouble()*400);
                    break;
                case 4:
                    subs[i].setFirstName("Semen");
                    subs[i].setBalance(random.nextDouble()*50000-25000);
                    subs[i].setCityCallDuration(random.nextDouble()*500);
                    break;
            }
            switch (l){
                case 0:
                    subs[i].setCity("Odessa");
                    subs[i].setInternetTraffic(random.nextDouble()*50);
                    break;
                case 1:
                    subs[i].setCity("Kyiv");
                    subs[i].setInternetTraffic(random.nextDouble()*50);
                    break;
                case 2:
                    subs[i].setCity("Kharkiv");
                    subs[i].setInternetTraffic(random.nextDouble()*50);
                    break;
                case 3:
                    subs[i].setCity("Kherson");
                    subs[i].setInternetTraffic(random.nextDouble()*50);
                    break;
            }
        }

        System.out.println(Arrays.toString(subs));

        System.out.println(Arrays.toString(SubscriberService.subscriberServiceCityCall(subs, 60)));
        System.out.println(Arrays.toString(SubscriberService.subscriberServiceInterCityCall(subs)));
        System.out.println(Arrays.toString(SubscriberService.subscriberServiceSearch(subs, "IVA")));
        System.out.println((SubscriberService.subscriberServiceCityTraffic(subs, "KYIV")));
        System.out.println(SubscriberService.subscriberServiceNegativeBalance(subs));
    }
}
