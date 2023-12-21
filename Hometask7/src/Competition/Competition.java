package Competition;

import java.util.Random;

public class Competition {
    public static void main(String[] args) {
        int numberOfParticipants=5;
        int numberOfBarriers=15;
        Participant[]participants=new Participant[numberOfParticipants];
        Barrier[]barriers=new Barrier[numberOfBarriers];
        for (int i = 0; i < numberOfParticipants; i++) {
            Random random=new Random();
            int k=random.nextInt(3);
            switch (k){
                case 0:
                    participants[i]=new Human(random.nextInt(5000),random.nextInt(20));
                    System.out.println(participants[i]);
                    break;
                case 1:
                    participants[i]=new Cat(random.nextInt(2500),random.nextInt(4));
                    System.out.println(participants[i]);
                    break;
                case 2:
                    participants[i]=new Robot(random.nextInt(Integer.MAX_VALUE),random.nextInt(100));
                    System.out.println(participants[i]);
                    break;
            }
        }
        for (int i = 0; i < numberOfBarriers; i++) {
            Random random=new Random();
            int k=random.nextInt(2);
            switch (k){
                case 0:
                    barriers[i]=new Track(random.nextInt(500));
                    break;
                case 1:
                    barriers[i]=new Wall(random.nextInt(5));
                    break;
            }
        }
        for (Participant p:participants) {
            for(int i=0;i<numberOfBarriers;++i){
                if(!p.overcome(barriers[i])) {
                    break;
                }
                if(i==numberOfBarriers-1){
                    System.out.println("A participant "+p+ " has passed all the barriers.");
                }
            }
        }
    }
    }

