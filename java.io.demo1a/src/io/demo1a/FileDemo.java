package io.demo1a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\tenne\\Documents\\HELL-O.txt");
        System.out.println(String.format("Read=%s, Write=%s, Execute=%s",
                                         myFile.canRead(),
                                         myFile.canWrite(),
                                         myFile.canExecute()));
       
        try {
            if(myFile.exists()) {
                System.out.println("File: " + myFile.getCanonicalPath());
                myFile.delete();
            } else {
                myFile.createNewFile();
                System.out.println("File: " + myFile.getCanonicalPath() + " successfully created");
            }
            
            File myDir = new File("C:\\Users\\tenne\\Documents\\test");
            if(myDir.mkdir()) {
                System.out.println("Dir " + myDir.getCanonicalPath() + " successfully created");
            } else {
                System.out.println("Dir " + myDir.getCanonicalPath() + " found");
                myDir.deleteOnExit();
            }
                
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        File homeDirectory = new File("C:\\Users\\tenne\\Documents");
        String [] resources = homeDirectory.list();
        Arrays.sort(resources);
        for(String resource: resources) {
            System.out.println("~~" + resource);
        }
            
    }
}
