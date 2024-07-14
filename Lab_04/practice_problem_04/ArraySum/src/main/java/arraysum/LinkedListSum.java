/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysum;
import java.util.LinkedList;
/**
 *
 * @author ANIK
 */
public class LinkedListSum {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        int sum = 0;
        for (int value : linkedList) {
            sum += value;
        }
        System.out.println("Sum of LinkedList elements: " + sum);
    }
}