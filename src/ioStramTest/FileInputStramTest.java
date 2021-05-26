package ioStramTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStramTest {
    public static void main(String[] args) throws IOException {
        //必须有一个源文件
        File file = new File("C:\\Users\\Max_Win_Pro\\Desktop\\a.txt");

        //将一个管搭在文件和程序
        FileInputStream fis = new FileInputStream(file);

        //开始吸取数据， 读取数据
        //int n = fis.read();
        //System.out.println(n);
        //int n2 = fis.read();
        //System.out.println(n2);
        ///////////int n = fis.read();
        /////while(n != -1){
          //  System.out.println((char) n);
          //  n= fis.read();
        //}

        //byte [] b = new byte[6];
        byte[] b = new byte[1024*4];
        //缓冲数组一般就是1024的倍数
        //int len = fis.read(b);
        //int len2 = fis.read(b);
        //int len3 = fis.read(b);
        //System.out.println(len);
        //System.out.println(len2);
        //System.out.println(len3);

        int len = fis.read(b);
        while (len!= -1){
            System.out.println(len);
            len = fis.read(b);
        }

        //关闭流
        fis.close();
    }
}
