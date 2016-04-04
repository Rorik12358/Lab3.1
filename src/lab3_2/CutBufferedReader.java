package lab3_2;

import java.io.*;

/**
 * Created by m18 on 04.04.2016.
 */
public class CutBufferedReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            while (reader.read() != -1) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
