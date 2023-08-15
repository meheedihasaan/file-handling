package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

    //Read data from file. If file doesn't exist then throws exception

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "NewFile.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File doesn't exists.");
        }

        FileInputStream stream = null;
        try {
            stream = new FileInputStream(filePath);
            int c;
            while ((c = stream.read()) != -1) {
                System.out.print(c + ", ");
                //System.out.print((char)c + ", ");
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally {
            if (stream != null) {
                try {
                    stream.close();
                }
                catch (Exception e) {
                    System.out.println("Could not close input stream.");
                }
            }
        }
    }

}
