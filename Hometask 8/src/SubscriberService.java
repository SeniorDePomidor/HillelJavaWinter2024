public interface SubscriberService {
    static Subscriber[] subscriberServiceCityCall(Subscriber[] subscribers, double calls) {
        Subscriber[]tmp=new Subscriber[subscribers.length];
        int i=0;
        for (Subscriber s:subscribers) {
            if(s.getCityCallDuration()>calls){
                tmp[i]=s;
                ++i;
            }
        }
        Subscriber[]result=new Subscriber[i];
        for (int j = 0; j < result.length; j++) {
            result[j]=tmp[j];
        }
        return result;
    }

    static Subscriber[] subscriberServiceInterCityCall(Subscriber[] subscribers) {
        Subscriber[]tmp=new Subscriber[subscribers.length];
        int i=0;
        for (Subscriber s:subscribers) {
            if(s.getInterCityCallDuration()>0){
                tmp[i]=s;
                ++i;
            }
        }
        Subscriber[]result=new Subscriber[i];
        for (int j = 0; j < result.length; j++) {
            result[j]=tmp[j];
        }
        return result;
    }

    static Subscriber[] subscriberServiceSearch(Subscriber[] subscribers, String str) {
        Subscriber[]tmp=new Subscriber[subscribers.length];
        int i=0;
        for (Subscriber s:subscribers) {
            if(s.getLastName().toLowerCase().startsWith(str.toLowerCase())){
                tmp[i]=s;
                ++i;
            }
        }
        Subscriber[]result=new Subscriber[i];
        for (int j = 0; j < result.length; j++) {
            result[j]=tmp[j];
        }
        return result;
    }

    static double subscriberServiceCityTraffic(Subscriber[] subscribers, String str) {
        double result=0.0;
        for (Subscriber s:subscribers) {
            if(s.getCity().toLowerCase().equals(str.toLowerCase())){
                result+=s.getInternetTraffic();
            }
        }
        return result;
    }

    static int subscriberServiceNegativeBalance(Subscriber[] subscribers) {
        int result=0;
        for (Subscriber s:subscribers) {
            if(s.getBalance()<0){
                ++result;
            }
        }
        return result;
    }
}
