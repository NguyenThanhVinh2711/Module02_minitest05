package bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readAndWrite implements Serializable {

    public static List<Person> readFile(String path ) {
        List<Person> hotelList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hotelList = (List<Person>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hotelList;
    }

    public static void writeFile (String path, List<Person> hotelList ){

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hotelList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}