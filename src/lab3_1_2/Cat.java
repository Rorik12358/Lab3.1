package lab3_1_2;

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
            int ch;
            while ((ch = file.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char c = 300;
        System.out.println(c);
    }
}
