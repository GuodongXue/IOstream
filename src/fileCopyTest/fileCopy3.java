package fileCopyTest;

import java.io.*;

public class fileCopy3 {
    public static void main(String[] args) throws IOException {

        File sourceFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt");
        File targetFile = new File("C:\\Users\\Max_Win_Pro\\Desktop\\target.txt");

        FileReader fileReader = new FileReader(sourceFile);
        FileWriter fileWriter = new FileWriter(targetFile);

        /*int n = fileReader.read();
        while(n!=-1){
            System.out.println(n);
            fileWriter.write(n);
            n = fileReader.read();
        }

         */
        /*char[] ch = new char[5];
        int len = fileReader.read(ch);
        while(len!=-1){
            fileWriter.write(ch, 0, len);
            len = fileReader.read(ch);
        }

         */
        //利用缓冲流
        try (BufferedReader br = new BufferedReader(fileReader)) {
            BufferedWriter bw = new BufferedWriter(fileWriter);

            String str = br.readLine();
            while (str != null) {
                bw.write(str);
                bw.newLine();
                str = br.readLine();
            }





        /*
        char[] ch = new char[5];
        int len = br.read(ch);
        while(len!= -1){
            bw.write(ch);
            len = br.read(ch);
        }

         */


            //fileWriter.close();
            //fileReader.close();
            //fileWriter.flush();
            bw.close();
            br.close();
        }
    }
}
