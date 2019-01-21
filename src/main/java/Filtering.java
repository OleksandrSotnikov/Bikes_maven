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

    public static Bike theFastesIndian(List<Bike> MyList) {
        Bike fastest = MyList.get(0);
        for (Bike bike : MyList) {
            if (fastest.getMaxSpeed() < bike.getMaxSpeed()) {
                fastest = bike;
            }
        }

        return fastest;
    }

    public static ArrayList<Bike> filteringByManyParam (List<Bike> MyList, String brand, String model) {
        ArrayList <Bike> allbikes = new ArrayList<>();
        for (Bike bike: MyList){
            if (bike.getBrand().equals(brand) && bike.getModel().contains(model)){
                allbikes.add(bike);
            }
        }

        return allbikes;
    }
}



