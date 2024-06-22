/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t6atester;

/**
 *
 * @author ANIK
 */
public class FinalT6A  { 
  public  int temp = 4;
  private int sum;
  private int y = 1;
  public FinalT6A(int x, int p){
    temp+=1;
    y = temp - p;
    sum = temp + x;
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodA(){    
    y = y + this.y; 
  }
}