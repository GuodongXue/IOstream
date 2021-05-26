package ioStramTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt");
        FileOutputStream fos = new FileOutputStream(file);


        String str="12345 abccc jiiii";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
    }
}
