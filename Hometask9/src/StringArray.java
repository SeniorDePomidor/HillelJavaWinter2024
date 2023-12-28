import java.util.Arrays;

public class StringArray {
    private int size=10;
    private String[]strings=new String[size];
    private int components;

    public StringArray(int size) {
        this.size = size;
        this.strings=new String[size];
    }

    public StringArray() {
    }

    @Override
    public String toString() {
        return "StringArray{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }

    private boolean isFull(){
       return components==size;
    }

    public String[] increase(){
        String[]tmp=new String[components];
        for (int i = 0; i <components ; i++) {
            tmp[i]=strings[i];
        }
        size= (int) (strings.length*1.67);
        strings=new String[size];
        for (int i = 0; i <tmp.length ; i++) {
            strings[i]=tmp[i];
        }
        return strings;
    }
    public String[]trimToSize(){
        String[]tmp=new String[components];
        for (int i = 0; i <components ; i++) {
            tmp[i]=strings[i];
        }
        strings=new String[components];
        for (int i = 0; i <components; i++) {
            strings[i]=tmp[i];
        }
        return strings;
    }

    public boolean add(int index, String value){
        if(index<0||index>components)return false;
        if(isFull()){
            increase();
        }
        for (int i = strings.length-1; i >index ; i--) {
            strings[i]=strings[i-1];
        }
        strings[index]=value;
        components++;
        return true;
    }
    public boolean add(String value){
        if(isFull()){
            this.increase();
        }
        this.strings[components++]=value;
        return true;
    }
    public boolean delete(int index){
        if(index<0||index>=components)return false;
        for (int i = index; i<components-1 ; i++) {
            strings[i]=strings[i+1];
        }
        strings[components-1]=null;
        components--;
        return true;
    }
    public boolean delete(String value){
        for (int i = 0; i <components ; i++) {
            if(value.equals(strings[i])){
                delete(i);
            }
        }
        return true;
    }
    public String get(int index){
        return strings[index];
    }

    public static void main(String[] args) {
        StringArray stringArray=new StringArray();
        stringArray.add("Something");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.add("Hi");
        stringArray.add("One");
        stringArray.add("2");

        stringArray.delete("2");

        stringArray.delete(1);

        stringArray.add(0,"First");

        stringArray.add(15,"15");

        stringArray.add(11,"11");

        stringArray.delete(50);

        stringArray.delete(-154);

        System.out.println(stringArray);
        System.out.println(Arrays.toString(stringArray.trimToSize()));
        System.out.println(stringArray.get(1));

        StringArray stringArray1=new StringArray(5);
        stringArray1.add("New ");
        stringArray1.add("StringArray");
        System.out.println(stringArray1);
        System.out.println(Arrays.toString(stringArray1.trimToSize()));
    }
}
