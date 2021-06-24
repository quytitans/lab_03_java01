package LabAssignment;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(12);
        cylinder.setRadius(10);
        cylinder.setColor("Red");
        System.out.printf("the tich la: %.2f",cylinder.getVolume());

        System.out.printf("\nmau cua tui la: %s",cylinder.getColor());
    }
}
