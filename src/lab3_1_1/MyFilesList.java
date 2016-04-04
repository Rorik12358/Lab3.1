package lab3_1_1;

import java.io.File;
import java.util.Arrays;

/**
 * Created by m18 on 04.04.2016.
 */
public class MyFilesList {
    public static void main(String[] args) {
        File file = new File("D:\\JavaLabs\\Lab3.1\\NewFolder");
        String[] filesInFile = file.list();
        System.out.println(Arrays.toString(filesInFile));
    }
}
