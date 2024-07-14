/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysum;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int sum = 0;
        for (int value : arrayList) {
            sum += value;
        }
        System.out.println("Sum of ArrayList elements: " + sum);
    }
}