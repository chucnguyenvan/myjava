package Kethua.Baitap_ClassCircleandclassCylinder;

public class Cylinder extends Circle {
    private double height=1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
    public double getSurroundingArea(){
        return super.getPerimeter()*this.height;
    }
    public double getTotalarea(){
        return this.getSurroundingArea()+super.getArea();
    }

    @Override
    public String toString() {
        return ""+super.toString()+"Chieu cao :"+this.getHeight()+" The tich :"+ this.getVolume()
                +"Dien tich xung quanh: "+this.getSurroundingArea()+" Dien tich toan phan "+this.getTotalarea();
    }
}
