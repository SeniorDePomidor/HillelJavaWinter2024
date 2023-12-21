package Competition;

public class Participant {
    private static int numberOfParticipants;
    private int id;
    private int runningEndurance;
    private int jumpingAbility;
    public int distance;
    public int barriersOvercome;

    public Participant(int runningEndurance, int jumpingAbility) {
        ++numberOfParticipants;
        id=numberOfParticipants;
        this.runningEndurance = runningEndurance;
        this.jumpingAbility = jumpingAbility;
    }

    public int getId() {
        return id;
    }

    public boolean run(int d){
        boolean result=false;
        if(runningEndurance>=d){
            System.out.println("A participant "+id+" is running "+d+" feet");
            runningEndurance-=d;
            distance+=d;
            result = true;
        }else{
            distance+=runningEndurance;
            runningEndurance=0;
            System.out.println("A participant "+id+" is out of power and has ran "+distance+" feet");
        }
        return result;
    }
    public boolean jump(int h){
        boolean result = false;
        if(jumpingAbility>=h){
            System.out.println("A participant "+id+" is jumping "+h+" feet.");
            ++barriersOvercome;
            result=true;
        }else{
            System.out.println("A participant "+id+" is not able to jump over "+h+" feet wall.");
        }
        return result;
    }
    public boolean overcome(Barrier barrier){
        boolean result=true;
        if(barrier.getClass()==Track.class){
            if(!run(((Track) barrier).getDistance())){
                System.out.println("A participant "+id+" has overcome "+barriersOvercome+ " and covered a distance of "+distance);
                result=false;
            }
        }else{
            if(!jump(((Wall)barrier).getHeight())){
                System.out.println("A participant "+id+" has overcome "+barriersOvercome+ " and covered a distance of "+distance);
                result=false;
            }
        }
        return result;
    }

}
