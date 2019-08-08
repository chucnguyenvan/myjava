package SS4_Kethua.Baitap_PointandMoveablePoint;

public class MoveablePoint extends Point {
    private float xspeed;
    private float yspeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setSpeed(float xspeed,float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public float[] getSpeed(){
        float[] arr ={this.xspeed,this.yspeed};
        return arr;
    }

    @Override
    public String toString() {
        return "("+super.getXY()[0] +"," +super.getXY()[1]+"),speed=("+this.getSpeed()[0]+","+this.getSpeed()[1]+")";
    }
    public MoveablePoint move(){
        super.setX(xspeed+super.getX());
        super.setY(yspeed+super.getY());
        return this;
    }
}
