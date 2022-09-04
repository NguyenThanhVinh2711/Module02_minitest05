package bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readAndWrite implements Serializable {

    public static List<Receipt> readFile(String path ) {
        List<Receipt> receiptList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            receiptList = (List<Receipt>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return receiptList;
    }

    public static void writeFile (String path, List<Receipt> receiptList ){

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(receiptList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
