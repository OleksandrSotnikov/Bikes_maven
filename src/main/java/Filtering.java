import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Filtering {

    public static ArrayList<Bike> filterByCapasity(List<Bike> MyList, int capacity) {
        ArrayList<Bike> allbikes = new ArrayList<>();
        for (Bike bike : MyList) {
            if (bike.getCapacity() > capacity) {
                allbikes.add(bike);
            }
        }
        return allbikes;
    }


    public static ArrayList<Bike> filterByHPRange(List<Bike> MyList, int lowerData, int higherData) {
        ArrayList<Bike> allbikes = new ArrayList<>();
        for (Bike bike : MyList) {
            if (bike.getHp() >= lowerData && bike.getHp() <= higherData) {
                allbikes.add(bike);
            }
        }
        return allbikes;
    }

    public static ArrayList<Bike> theFastesIndian(List<Bike> MyList) {
        ArrayList<Bike> allbikes = new ArrayList<>();
        int maxspeed = 0;
        for (Bike bike : MyList) {
            if (maxspeed < bike.getMaxSpeed()) {
                int i = 0;
                allbikes.add(bike);
                i++;
            }


        }
        return allbikes;
    }
}


