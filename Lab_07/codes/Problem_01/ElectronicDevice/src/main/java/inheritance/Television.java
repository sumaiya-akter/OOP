/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ANIK
 */
 public class Television extends ElectronicDevice {
    private int screenSize;

    public Television(String company, String model, double price, String color, int screenSize) {
        super(company, model, price, color);
        this.screenSize = screenSize; 
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen size: " + screenSize + " inches";
    }
}
