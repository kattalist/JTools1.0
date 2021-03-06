/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlists;

import java.util.ArrayList;

/**
 *
 * @author iamjf
 */
public class JArray {
    public int size = 0;
    public ArrayList<Integer> array = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public JArray (){
        
    }
    public void append(int element) { //Add element to JArray (element is int being added)
        array.add(element);
        size ++;
    }
    public String display() { //display JArray
        String dispReturn = "";
        for (int i = 0; i < array.size(); i++) {
            dispReturn += "\nItem "+i+": "+array.get(i);
        }
        return dispReturn;
    }
    public int getSize() { //Get size of JArray
        return array.size();
    }
    public int getSum(int... sumUntil) {//Get sum of JArray elements
        int sum = 0;
        if (sumUntil.length != 0 && sumUntil[0] <= array.size()) {
            for (int i = 0; i < sumUntil[0]; i++) {
                sum += array.get(i);
            }
        } else {
            for (int i = 0; i < array.size(); i++) {
                sum += array.get(i);
            }
        }
        return sum;
    }
    public int indexOf(int element) { //find index of JArray element
        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                index = i;
            }
        }
        return index;
    }
    public int get(int index) {
        return array.get(index);
    }
    public void edit(int index, int newElement) { //replace existing element
        if (index < array.size() && index >= 0) {
            array.set(index, newElement);
        }
    }
    public void clear() { //Clears JArray
        array.clear();
        size = 0;
    }
    public Object[] toArray() { //converts to array
        return array.toArray();
    }
    public double getAverage(JArray j) { //gets average of all elements
        double sumDouble = j.getSum();
        double sizeDouble = j.getSize();
        return sumDouble/sizeDouble;
    }
    public void addIncrement (JArray j, int lowNum, int highNum, int... increment) { //Enters all numbers in an increment from lowNum to highNum
        if (increment.length != 0 ) {
            for (int i = lowNum; i <= highNum; i += increment[0]) {
                j.append(i);
            }
        } else {
            for (int i = lowNum; i <= highNum; i ++) {
                j.append(i);
            }
        }
    }
} 
