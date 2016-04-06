package lab3_1_3;

import java.io.*;

/**
 * Created by m18 on 06.04.2016.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        File fileOut = new File("fileOut.txt");
        File sss = new File("ddd.txt");
        try {
            fileOut.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new FileInputStream("fileIn.txt");
             OutputStream outputStream = new FileOutputStream("fileOut.txt")) {
            int byteTranslator;
            while ((byteTranslator = inputStream.read()) != -1) {
                System.out.print((char) byteTranslator);
                outputStream.write(byteTranslator);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
