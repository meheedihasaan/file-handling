package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class DeleteFileOnExit {

    //This will delete the file when JVM terminates

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "NewFile.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
        }
        else {
            file.deleteOnExit();
            System.out.println("File will be deleted when JVM will be terminated.");
        }
    }

}
