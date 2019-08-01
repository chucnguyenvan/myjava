package Kethua.Baitap_thietkevatrienkhailopTriangle;

import Kethua.Thuchanh_Hecacdoituonghinhhoc.HinhHoc;

public class Triangle extends HinhHoc {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double p = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        return Math.sqrt(p * (p - this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        double p = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        if (this.getSide1() <= 0 || this.getSide2() <= 0 || this.getSide3() <= 0
                || p - this.getSide1() <= 0 || p - this.getSide2() <= 0 || p - this.getSide3() <= 0) {
            return this.getSide1() + " " + this.getSide2() + " " + this.getSide3() + " khong phai la 3 canh tam giac";
        } else {
            return "3 canh Tam giac : " + " canh a: " + this.getSide1() + " canh b: "
                    + this.getSide2() + " canh c: " + this.getSide3() + " mau sac: " + this.getColor()
                    + " Dien tich tam giac: " + this.getArea() + " Chu vi Tam giac: " + this.getPerimeter();
        }
    }
}