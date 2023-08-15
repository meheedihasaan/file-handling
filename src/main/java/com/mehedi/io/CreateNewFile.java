package com.mehedi.io;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {
        String filePath = "D:" + File.separator + "mehedi" + File.separator + "files" + File.separator + "NewFile1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File already exists. File path: " + file.getPath());
        }
        else {
            try {
                file.createNewFile();
                System.out.println("File is created. File path: " + file.getParent());
            }
            catch (IOException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
    }

}
