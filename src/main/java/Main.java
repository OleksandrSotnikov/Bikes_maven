import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bike> bikes = null;

        try {
            FileReader reader = new FileReader("D:\\Java\\Moto.csv");
            bikes = new CsvToBeanBuilder<Bike>(reader).withType(Bike.class).build().parse();
        } catch (Exception e) {
            System.out.println("ATTENTION! Fle was not found: " + e.getMessage());
            System.exit(1);
        }

       /* for (Bike b : bikes){
            System.out.println(b);
        }

        System.out.println("-----------------------");
*/

        ArrayList<Bike> myShinyBike = Filtering.filterByCapasity(bikes, 1000);

        try {
            PrintWriter writer = new PrintWriter("D:\\Java\\Filtered_Moto.csv");
            for (Bike y : myShinyBike) {
                writer.println(y);


            }
            writer.close();
        } catch (Exception x) {
            System.out.println("Something wrong with file storage " + x.getMessage());
            System.exit(1);
        }

        ArrayList<Bike> myShinyBike1 = Filtering.filterByHPRange(bikes, 100, 200);

        try {
            PrintWriter writer = new PrintWriter("D:\\Java\\Filtered_Moto_By_HP_Range.csv");
            for (Bike x : myShinyBike1) {
                writer.println(x);


            }
            writer.close();

        } catch (Exception x) {
            System.out.println("Something wrong with file storage " + x.getMessage());
            System.exit(1);

        }

        Bike myFastestBike = Filtering.theFastesIndian(bikes);
        System.out.println(myFastestBike);

        System.out.println("-----------------");


        ArrayList<Bike> mySortedBike = Filtering.filteringByManyParam(bikes, "Suzuki", "DL");
        for (Bike c : mySortedBike) {
            System.out.println(c);
        }

        Bike myPowerfullBIke = Filtering.theMostPowerfulBike(bikes);
        try {
            PrintWriter writer = new PrintWriter("D:\\Java\\Powerfull_Mother_Fucker.csv");
            writer.println(myPowerfullBIke);
            writer.flush();
            writer.close();
        } catch (Exception x) {
            System.out.println("Something wrong with file storage " + x.getMessage());
            System.exit(1);
        }

        System.out.println("---------------");
        System.out.println();
        System.out.println("The Oldest Bike is: ");

        Bike myOldestBike = Filtering.theOldesOne(bikes);
        System.out.println(myOldestBike);



    }
}










