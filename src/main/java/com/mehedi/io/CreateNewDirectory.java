package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class CreateNewDirectory {

    public static void main(String[] args) {
        String directoryPath = FileConstants.BASE_PATH + File.separator + "New Folder1";
        File directory = new File(directoryPath);
        if (directory.exists()) {
            System.out.println("Directory already exists. Directory path: " + directory.getPath());
        }
        else {
            boolean isDirectoryCreated = directory.mkdir();
            if (isDirectoryCreated) {
                System.out.println("Directory is created. Directory path: " + directory.getPath());
            }
            else {
                System.out.println("Directory creation failed.");
            }
        }
    }

}
