package com.rifqialfinnur;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DemoHashTable {
    public static void main(String[] args) {
        // create object of hashTable
        Hashtable<Integer, String> majorTable = new Hashtable<>();
        Hashtable<String, String> scheduleTable = new Hashtable<>();

        // check if the hashTable was empty
        if(majorTable.isEmpty() || scheduleTable.isEmpty()){
            System.out.println("Some or both table is empty");
        }
        // add data to majorTable
        majorTable.put(1, "Informatics Engineering");
        majorTable.put(2, "Computer Science");
        majorTable.put(3, "Information System");
        majorTable.put(4, "Software Engineering");

        // add data to scheduleTable
        scheduleTable.put("MON", "Progressive Web Apps");
        scheduleTable.put("TUE", "Agile Method");
        scheduleTable.put("WED", "Research Methodology");
        scheduleTable.put("THU", "Project Management");
        scheduleTable.put("FRI", "Data Analytics");
        scheduleTable.put("SAT", "Bobo");
        scheduleTable.put("SUN", "Bobo");

        // print data major
        System.out.println("Data Major");
        printData2(majorTable);

        // print schedule
        printData1(scheduleTable);

        // clone data
        Hashtable<Integer, String> majorTableClone
                = (Hashtable<Integer, String>) majorTable.clone();
        System.out.println("\nClone majorTable data to majorTableClone");
        // print data majorTableClone
        System.out.println("\nData majorTableClone");
        printData2(majorTableClone);

        // print data before addition
        System.out.println("Data scheduleTable before Addition");
        printData1(scheduleTable);

        // add new data in majorTableClone
        /* compute ifAbsent
        * will add data to hashTable wich key not exist
        * but if data was exist the addition was refused*/
        System.out.println("\n add new data with SUN as key and Bobo as value");
        scheduleTable.computeIfAbsent("SUN", s->"Bobo");

        // print data after addition
        System.out.println("\nData scheduleTable after Addition");
        printData1(scheduleTable);

        // check value in majorTable
        String value = "Software Engineering";
        // this is ternary operator
        String ans = majorTable.contains(value)? "Yes": "No";
        System.out.println("Is '"+value+"' exist in majorTable? "+ans);

        // chek by key in scheduleTable
        String key = "SUN";
        ans = scheduleTable.containsKey(key)? "Yes": "No";
        System.out.println("Is in '"+key+"' there's a schedule? "+ans);

        // create on enumeration element / value
        // just print value of map
        System.out.println("\nElement in scheduleTable : ");
        Enumeration enumeration = scheduleTable.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        // get set view from entry wich exist in hashTable
        Set set = majorTable.entrySet();
        System.out.println("\nSet Entry: "+set);

        // get object by key
        String mKey = "TUE";
        System.out.println("Map from "+mKey+" : "+scheduleTable.get(mKey));

        // print has code from map
        System.out.println("Hascode from scheduleTable: "+scheduleTable.hashCode());
        System.out.println("Hascode from majorTable: "+majorTable.hashCode());

        // remove some element
        System.out.println("Remove key 1 in majorTable");
        majorTable.remove(1);
        System.out.println("Data after remove key 1 in majorTable");
        printData2(majorTable);

        // replace element
        System.out.println("Replace key 4 to Tata Boga");
        majorTable.replace(4, "Tata Boga");
        printData2(majorTable);

        // clear data
        System.out.println("\nNow we will remove all scheduleTable");
        scheduleTable.clear();
        System.out.println("Data after clear, abviosly no data");
        printData1(scheduleTable);

    }

    // method for print data with String params
    private static void printData1(Map<String, String> map){
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());
        }
    }

    // method for print data with integer and string params
    private static void printData2(Map<Integer, String> map){
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
}
