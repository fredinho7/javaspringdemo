package com.example.domain;

/**
 * Created by Linux on 2016-10-15.
 */
public class Tire extends Product {

    String brand; //Märke
    String type; // Vinter/sommar däck.

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tire tire = (Tire) o;

        if (brand != null ? !brand.equals(tire.brand) : tire.brand != null) return false;
        return type != null ? type.equals(tire.type) : tire.type == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
