package SS4_Kethua.Baitap_lopPoint2DvalopPoint3D;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x= x;
        this.y=y;
    }
    public float[] getXY(){
        float[] array = new float[2];
        array[0]=this.x;
        array[1]=this.y;
        return array;
    }

    @Override
    public String toString() {
        return "("+this.getXY()[0] +"," +this.getXY()[1]+")";
    }
}
