package LabAssignment;

public class Cylinder extends Circle{
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (height *getArea());
    }
}
