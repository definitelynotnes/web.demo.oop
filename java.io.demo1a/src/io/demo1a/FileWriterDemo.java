package io.demo1a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\tenne\\external-training-workspace\\java.io.demo1a\\files\\person.csv", true);
            /*            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            
            bufferWriter.write("1, John, Doe\n");
            bufferWriter.write("2, John, Doe\n");
            
            bufferWriter.flush();
*/
            PrintWriter out = new PrintWriter(fileWriter);
            
            out.println("1,John,Doe,Manila");
            out.println("2,John,Doe,Manila");
            out.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
