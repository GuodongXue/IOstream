package ioStramTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        //要把程序的什么弄出去

        File file = new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt");

        //搭管子
        FileOutputStream fos = new FileOutputStream(file);
        FileOutputStream fos2 = new FileOutputStream(file, true);

        //将内容写出去
        String str = "猫子🐱";
        byte[] bytes = str.getBytes();
        for( byte b : bytes){
            fos.write(b);
        }

        //关闭流
        fos.close();
    }
}
