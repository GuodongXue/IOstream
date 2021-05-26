package fileCopyTest;

import java.io.*;

public class fileCopy {

    public static void main(String[] args) throws IOException {

        File sourceFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt");
        File targetFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\target.txt");

        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        int n = fis.read();
        while(n!= -1){
            fos.write(n);
            n = fis.read();
        }

        fos.close();
        fis.close();

    }
}
