package fileCopyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopy2 {
    public static void main(String[] args) throws IOException {

        File sourceFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt");
        File targetFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\target.txt");

        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        byte[] b = new byte[8];
        int len = fis.read(b);
        while(len != -1){
            //fos.write(b);
            fos.write(b, 0, len);//将这个b数组的从【0， len）输出
            len = fis.read(b);
        }

        fos.close();
        fis.close();

    }
}
