public class Car {
    private boolean electricity;
    private boolean command;
    private boolean fuelSystem;
    private void startElectricity(){
        this.electricity=true;
        System.out.println("Electricity OK");
    }
    private void startCommand(){
        this.command=true;
        System.out.println("Command OK");
    }
    private void startFuelSystem()
    {
        this.fuelSystem=true;
        System.out.println("Fuel System OK");
    }
    public void start(){
        System.out.println("Start of Car initiated");
        startElectricity();
        startCommand();
        startFuelSystem();
        if(electricity == command == fuelSystem){
            System.out.println("Start OK");
        }
    }
}
