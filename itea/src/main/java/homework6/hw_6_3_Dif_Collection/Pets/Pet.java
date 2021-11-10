package homework6.hw_6_3_Dif_Collection.Pets;

import java.util.HashSet;

public class Pet {

    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();

        myHashSet.add("dog1");
        myHashSet.add("dog2");
        myHashSet.add("dog3");
        myHashSet.add("cat1");
        myHashSet.add("cat2");
        myHashSet.add("cat3");

        System.out.println(myHashSet);

    }

}
