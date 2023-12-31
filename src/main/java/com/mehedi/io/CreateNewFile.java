package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "NewFile4.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File already exists. File path: " + file.getPath());
        }
        else {
            try {
                boolean isFileCreated = file.createNewFile();
                if (isFileCreated) {
                    System.out.println("File is created. File path: " + file.getPath());
                }
                else {
                    System.out.println("File is created. File path: " + file.getPath());
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
    }

}
