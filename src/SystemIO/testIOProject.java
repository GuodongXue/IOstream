package SystemIO;

import java.io.*;

public class testIOProject {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        //将字节流转成字符流
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);//只能单项转换， 只能字节转字符
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo1.txt")));

        //开始动作
        String str = br.readLine();
        while(!str.equals("byebye")){
            bw.write(str);
            bw.newLine();
            str = br.readLine();
        }

        //关闭流
        bw.close();
        br.close();
        isr.close();
        is.close();
    }
}
