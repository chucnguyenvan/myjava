package SS3_Lopvadoituongtrongjava.Baitap_XaydunglopQuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta=Math.pow(b,2)-4*a*c;
        return delta;
    }
    public  double getRoot1(){
            return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
            return ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
        }
}
