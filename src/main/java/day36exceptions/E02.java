package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        //2.Way
        try {
            FileInputStream fis=new FileInputStream("src/main/java/day36exceptions/TextFile");
            int i=0;
            while((i=fis.read())!=-1){
                System.out.print((char)i);//karakterleri alt alta yazmasin diye println degil print dedik

            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file doesn't exist");
        } catch (IOException e) {
            System.out.println("Some characters couldn't be read");
        }
    }
}
