package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class DeleteDirectoryOnExit {

    //This will delete the directory when JVM terminates but the directory must be empty

    public static void main(String[] args) {
        String directoryPath = FileConstants.BASE_PATH + File.separator + "New Folder";
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory doesn't exist.");
        }
        else {
            directory.deleteOnExit();
            System.out.println("Directory will be deleted when JVM will be terminated.");
        }
    }

}
