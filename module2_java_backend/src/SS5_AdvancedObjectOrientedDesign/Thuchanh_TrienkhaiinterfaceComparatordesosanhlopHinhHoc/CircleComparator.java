package SS5_AdvancedObjectOrientedDesign.Thuchanh_TrienkhaiinterfaceComparatordesosanhlopHinhHoc;


import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        return 0;
    }
}
