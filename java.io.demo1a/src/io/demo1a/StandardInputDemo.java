package io.demo1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputDemo {
    
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.println("Enter name: ");
            String name = reader.readLine();
            System.out.println("Hello " + name);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        
        try {
            if (reader != null) {
                reader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

