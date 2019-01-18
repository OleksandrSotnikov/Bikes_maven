import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bike> coolBikes = null;

        try {
            FileReader reader = new FileReader("D:\\Dropbox\\SeleniumStuff\\files\\moto.csv");
            coolBikes = new CsvToBeanBuilder<Bike>(reader).withType(Bike.class).build().parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        for (Bike b : coolBikes){
            System.out.println(b);
        }

        System.out.println("Test");
        System.out.println("Another test");
    }
}
