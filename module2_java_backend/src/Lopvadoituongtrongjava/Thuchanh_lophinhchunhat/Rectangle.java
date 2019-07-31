package Lopvadoituongtrongjava.Thuchanh_lophinhchunhat;

public class Rectangle {
    private  int  width;
    private  int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
