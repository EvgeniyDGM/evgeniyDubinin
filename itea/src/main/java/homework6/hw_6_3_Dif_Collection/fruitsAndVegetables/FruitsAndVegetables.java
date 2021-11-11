package homework6.hw_6_3_Dif_Collection.fruitsAndVegetables;

import java.util.*;

public class FruitsAndVegetables {

    public static Map<String, String> deleteTheSameValuesFromTheMap(Map<String, String>  map) {

        Set<String> valuesList = new HashSet<>();
        Map<String, Integer> mapCopy = new HashMap<>();
        Map<String, String> mapOut = new HashMap<>();


        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            valuesList.add(value);
        }

        for (String item : valuesList) {
            int amount = 1;
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (item.equals(pair.getValue())) {
                    mapCopy.put(pair.getValue(), amount++);
                }
            }
        }

        for (Map.Entry<String, Integer> pair: mapCopy.entrySet() ) {
            for (Map.Entry <String, String> pairs : map.entrySet()) {
                if (pair.getValue() < 2 && pairs.getValue().equals(pair.getKey())) {
                    mapOut.put(pairs.getKey(), pair.getKey());
                }
            }
        }

        for (Map.Entry <String, String> pair : mapOut.entrySet()) {
            System.out.println(pair.getKey() + " is a/an " + pair.getValue());

        }
        return mapOut;
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Apple", "Fruit");
        map.put("Peach", "Fruit");
        map.put("Coconut", "Fruit");
        map.put("Corn", "Vegetable");
        map.put("Cabbage", "Vegetable");
        map.put("Cucumber", "Vegetable");
        map.put("Carrot", "Vegetable");
        map.put("Pear", "Fruit");
        map.put("Apricot", "Fruit");
        map.put("Cherry", "Fruit");
        map.put("Watermelon", "Berry");
        map.put("Car", "BMW");

        FruitsAndVegetables.deleteTheSameValuesFromTheMap(map);

    }
}
