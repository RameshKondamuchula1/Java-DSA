package org.java.dsa.arrays.own_array;


public class DynamicDataStorageTest {


   static void addItemTest() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(16);
        dataStorage.add("Mansi");
        dataStorage.add("Ram");
        dataStorage.add("Meenu");
        dataStorage.add("ITI");
        System.out.println("The current data length is : " +dataStorage.length());

    }

    static void addItemWithIndex() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(4);
        dataStorage.add("Mansi");
        dataStorage.add("Ram");
        dataStorage.add("Meenu");
        dataStorage.add("ITI");
        dataStorage.add("Bangalore");
        dataStorage.add("Karnataka");
        System.out.println("The current data length is : " +dataStorage.length());
        dataStorage.add("Central Govt", 3);
        System.out.println("The current data length is : " +dataStorage.length());
        System.out.println("The item at index is : " + dataStorage.get(3));
        System.out.println("The item at index is : " + dataStorage.get(4));
        System.out.println("The item at index is : " + dataStorage.get(5));
        System.out.println("The item at index is : " + dataStorage.get(6));
        System.out.println("The current data length is : " +dataStorage.length());
        dataStorage.add("Communication Ministry", 7);
        System.out.println("The current data length is : " +dataStorage.length());
        System.out.println(dataStorage);
    }

    static void addItemTestExceedsLength() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(4);
        dataStorage.add("Mansi");
        dataStorage.add("Ram");
        dataStorage.add("Meenu");
        dataStorage.add("ITI");
        dataStorage.add("C71");
        dataStorage.add("KR Puram");
        dataStorage.add("Bangalore");
        dataStorage.add("Karnataka");
        System.out.println("The current data length is : " +dataStorage.length());
        dataStorage.add("PIN");
        System.out.println("The current data length is : " +dataStorage.length());
    }

    static void printItem() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(16);
        dataStorage.add("Mansi");
        dataStorage.add("Ram");
        dataStorage.add("Meenu");
        dataStorage.add("ITI");
        System.out.println("The item at index is : " + dataStorage.get(2));

    }

    static void deleteItem() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(16);
        dataStorage.add("Mansi");//0
        dataStorage.add("Ram");//1
        dataStorage.add("Meenu");//2
        dataStorage.add("ITI");//3
        System.out.println("The current data length is : " + dataStorage.length());
        System.out.println("The item at last index is : " + dataStorage.delete());
        System.out.println("The length of data post delete is : " + (dataStorage.length() + 1));
        System.out.println("The item at index is : " + dataStorage.get(dataStorage.length()));

    }

    static void deleteItemWithIndex() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(16);
        dataStorage.add("Mansi");//0
        dataStorage.add("Ram");//1
        dataStorage.add("Meenu");//2
        dataStorage.add("ITI");//3
        dataStorage.add("C71");//4
        dataStorage.add("KR Puram");//5
        dataStorage.add("Bangalore");//6
        dataStorage.add("Karnataka");//7
        System.out.println(dataStorage);
        System.out.println("The current data length is : " + dataStorage.length());
        System.out.println("The item at last index is : " + dataStorage.delete(3));
        System.out.println("The length of data post delete is : " + (dataStorage.length()));
        System.out.println("The item at index is : " + dataStorage.get(3));

        System.out.println(dataStorage);
        dataStorage.add("ITI");//7
        System.out.println(dataStorage);
    }

    static void checkLength() {
        DynamicDataStorage dataStorage = new DynamicDataStorage(16);
        dataStorage.add("Mansi");//0
        dataStorage.add("Ram");//1
        dataStorage.add("Meenu");//2
        dataStorage.add("ITI");//3
        dataStorage.add("C71");//4
        dataStorage.add("KR Puram");//5
        dataStorage.add("Bangalore");//6
        dataStorage.add("Karnataka");//7
        System.out.println("The current data length is : " + dataStorage.length());
    }

    public static void main(String[] args) {
        //addItemTest();
        //printItem();
        //deleteItem();
        //addItemTestExceedsLength();
        //deleteItemWithIndex();
        //addItemWithIndex();
        checkLength();
    }

}
