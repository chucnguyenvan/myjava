package SS3_Lopvadoituongtrongjava.Baitap_xaydunglopfan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColour("Yellow");
        fan1.setOn(true);
        String status1 = fan1.toString();
        System.out.println(status1);
        Fan fan2= new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        String status2=fan2.toString();
        System.out.println(status2);
        System.out.println(fan2.getSpeed());
    }
}
