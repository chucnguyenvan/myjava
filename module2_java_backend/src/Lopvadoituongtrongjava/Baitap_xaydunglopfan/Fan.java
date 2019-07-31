package Lopvadoituongtrongjava.Baitap_xaydunglopfan;

public class Fan {
     final int SLOW=1;
     final int MEDIUM=2;
     final int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String colour="blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        if(this.on){
            return "speed: " +this.speed+" colour: "+ this.colour+" radius: "+this.radius+" fan is on";
        }else return " colour "+ this.colour+" radius "+this.radius+" fan is off";
    }
}
