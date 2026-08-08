package org.java.dsa.arrays.own_array;

import java.util.Arrays;

public class DynamicDataStorage {

    private String[] strArray;

    private int index;

    public DynamicDataStorage(int size) {
        this.strArray = new String[size];
        this.index = 0;
    }

    public DynamicDataStorage() {
        this.strArray = new String[16];
        this.index = 0;
    }

    public void add(String item) {
        if (index == this.strArray.length) {
            String[] tempArray = new String[this.strArray.length * 2];
            System.arraycopy(strArray, 0, tempArray, 0, strArray.length);
            strArray = tempArray;
            tempArray = new String[0];
        }
        this.strArray[index] = item;
        this.index++;
    }

    public void add(String item, int index) {
        if (this.index == this.strArray.length) {
            String[] tempArray = new String[this.strArray.length * 2];
            System.arraycopy(strArray, 0, tempArray, 0, strArray.length);
            strArray = tempArray;
            tempArray = new String[0];
        }
        if (this.index == index) {
            this.strArray[this.index] = item;
        } else {
            String temp = this.strArray[index];
            this.strArray[index] = item;
            for (int i = index + 1; i < this.index; i++) {
                String tempNew = this.strArray[i];
                this.strArray[i] = temp;
                temp = tempNew;
            }
            this.strArray[this.index] = temp;
        }
        this.index++;
    }

    public String get(int index) {
        return this.strArray[index];
    }

    public String delete() {
        String item = this.strArray[this.index - 1];
        String[] tempArray = new String[this.index - 1];
        System.arraycopy(strArray, 0, tempArray, 0, tempArray.length);
        strArray = tempArray;
        tempArray = new String[0];
        this.index = strArray.length - 1;
        return item;
    }

    public String delete(int index) {
        if (this.index == index + 1) {
            return delete();
        }
        String item = this.strArray[index];
        for (int i = index; i < this.index; i++){
             this.strArray[i] = this.strArray[i+1];
        }
        this.index--;
        return item;
    }

    public String update(String item, int index) {
        if (this.index < index) {
            throw new RuntimeException("Index is out of bounds : " + index);
        }
        this.strArray[index] = item;
        return item;
    }

    public int length() {
        return this.index;
    }

    @Override
    public String toString() {
        return "DynamicDataStorage{" +
                "strArray=" + Arrays.toString(strArray) +
                ", index=" + index +
                '}';
    }
}
