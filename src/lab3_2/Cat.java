package lab3_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by m18 on 04.04.2016.
 */
public class Cat {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader(args[0]);
            while (file.read() != -1){
                System.out.println(file.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
