package SS4_Kethua.Thuchanh_Hecacdoituonghinhhoc;

public class HinhHoc {
    private String color;
    private boolean filled;

    public HinhHoc() {
        this.color="green";
        this.filled=true;
    }

    public HinhHoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of" +this.getColor()+  "and"+ this.isFilled();
    }
}
