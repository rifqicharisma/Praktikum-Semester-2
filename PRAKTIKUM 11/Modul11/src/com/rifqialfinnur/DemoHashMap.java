package com.rifqialfinnur;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        // HashMap <Key, Value> objectName = new Instance()
        HashMap<String, String> stringHashMap = new HashMap<>();
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        // insert element
        stringHashMap.put("INA","Rupiah");
        stringHashMap.put("USA", "USD");
        stringHashMap.put("MYA","Ringgit");

        // if stringHashMap is not empty then get All of key and value
        if(!stringHashMap.isEmpty()){
            System.out.println("HashMap Element");
            for (Map.Entry entry: stringHashMap.entrySet()) {
                System.out.println("Key: "+entry.getKey()+" \t Value: "+entry.getValue());
            }
        }else{
            System.out.println("HashMap is Empty");
        }
        // array declaration
        int[] key = {11,12,13};
        String[] value = {"File A", "File B", "File C"};
        // practice print data with for each
        for (int i = 0; i < key.length; i++) {
            integerStringHashMap.put(key[i], value[i]);
        }

        System.out.println("File Data : ");
        for (Map.Entry entry: integerStringHashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("We replace file B with file D");
        // replace value dari data
        integerStringHashMap.replace(12, "File D");
        System.out.println("File Data : ");
        for (Map.Entry entry: integerStringHashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap<String, String> stringHashMapTwo = new HashMap<>();
        // add all data from stringHashMap to stringHashMapTwo
        stringHashMapTwo.putAll(stringHashMap);
        // replace data INA wich have rupiah to Dollar Indonesia
        stringHashMapTwo.replace("INA", "Dollar Indonesia");
        if(stringHashMap.equals(stringHashMapTwo)){
            System.out.println("Yes it's equal");
        }else{
            System.out.println("Hmmm, am not sure");
        }
        // get size from hashMap
        System.out.println("\nSize of stringHashMap: "+stringHashMap.size());

        // now we want to delete malaysia from the list
        System.out.println("MYA was deleted from the map list");
        stringHashMap.remove("MYA");
        System.out.println("\nData adter MYA was deleted");

        for (Map.Entry entry: stringHashMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" \t Value: "+entry.getValue());
        }
    }
}
