package Core;

public class Main {
    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        for(int index = 0; index < 100; index++)
        {
            hm.put("" + index, new Dog("" + index, "" + index, index));
        }

        System.out.println(hm.getString());
        System.out.println(hm.get("57").getString());

        for(int index = 13; index < 76; index++)
        {
            hm.remove("" + index);
        }

        System.out.println(hm.getString());

        System.out.println(hm.get("57"));
    }
}