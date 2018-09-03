package ocjp.java.fundamentals.chapter_002;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_02_DataTypes {
    public static void main(String[] args) {
        int x = 10;
        int y = -10;

        double z = -12.50;

        float I = 3;

//        char XYZ = - 'a' ;  #Not Signed data type

//        byte b = 10;

        /** Compile time error */
//        byte b = 128 ; //#java: incompatible types: possible lossy conversion from int to byte
//        byte b = 12.5 ; //#java: incompatible types: possible lossy conversion from double to byte
//        byte b = true ; //#java: incompatible types: boolean cannot be converted to byte
//        byte b = "rahul" ; //#java: incompatible types: java.lang.String cannot be converted to byte

        try {
            FileOutputStream fout=new FileOutputStream("../testout.txt");
            String s="Welcome to java byte Concept ..";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Success...");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
