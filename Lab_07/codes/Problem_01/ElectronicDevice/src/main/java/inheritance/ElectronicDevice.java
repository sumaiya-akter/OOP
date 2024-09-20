/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inheritance;

/**
 *
 * @author ANIK
 */
class ElectronicDevice {
    private String company;
    private String model;
    private double price;
    private String color;

    public ElectronicDevice(String company, String model, double price, String color) {
        this.company = company;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Company: " + company + ", Model: " + model + ", Price: " + price + ", Color: " + color;
    }
}