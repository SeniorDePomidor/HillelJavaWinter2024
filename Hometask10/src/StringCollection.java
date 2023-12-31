import java.util.Arrays;


public class StringCollection implements Collection {
        private int size=10;
        private String[]strings=new String[size];
        private int components;

        public StringCollection(int size) {
            this.size = size;
            this.strings=new String[size];
        }

        public StringCollection() {
        }

        @Override
        public String toString() {
            return "StringCollections{" +
                    "strings=" + Arrays.toString(this.trimToSize()) +
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
        @Override
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
        @Override
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
        @Override
        public boolean delete(String value){
            for (int i = 0; i <components ; i++) {
                if(value.equals(strings[i])){
                    delete(i);
                }
            }
            return true;
        }
        @Override
        public String get(int index){
            return strings[index];
        }

    @Override
    public boolean contain(String o) {
        boolean result=false;
        for (String s:strings) {
            if(o.equals(s)){
                result=true;
                break;
        }
        }
        return result;
    }

    @Override
    public boolean equals(StringCollection collection) {
            boolean result=false;
            int counter=0;
            if(this.components!=collection.components)return result;
        for (String s:this.strings) {
            if(!collection.contain(s))return result;
            counter++;
            if (counter==this.components)result=true;
        }
        return result;
    }

    @Override
    public boolean clear() {
            boolean result=true;
            this.strings=new String[10];
            this.components=0;
        return result;
    }

    @Override
    public int size() {
        return this.components;
    }

    public static void main(String[] args) {
        StringCollection collection=new StringCollection();
        collection.add(0,"Hi");
        collection.add("Aloha");
        System.out.println(collection);
        System.out.println("Size of collection is "+collection.size());
        StringCollection collection1=new StringCollection();
        collection1.add("Aloha");
        collection1.add("Hi");
        System.out.println("collection equals to collection1: "+collection.equals(collection1));
        System.out.println("collection contains \"Hi\""+collection.contain("Hi"));
        System.out.println("collection contains \"Barev\""+collection1.contain("Barev"));
        System.out.println("collection's item with index 1 is "+collection.get(1));
        collection.delete("Hi");
        System.out.println("deleting collection's item with value \"Hi\"");
        System.out.println(collection);
        System.out.println("collection equals to collection1: "+collection.equals(collection1));
        collection1.clear();
        System.out.println("deleting all the items of collection1 ");
        System.out.println(collection1);
        System.out.println("collection equals to collection1: "+collection.equals(collection1));
        System.out.println("collection1 contains \"Hi\" "+collection1.contain("Hi"));
        System.out.println("Size of collection is "+collection.size());
        System.out.println("Size of collection1 is "+collection1.size());
    }
}
