package com.mehedi.io;

import java.io.File;

public class CreateNewDirectory {

    public static void main(String[] args) {
        String folderPath = "D:" + File.separator + "mehedi" + File.separator + "files" + File.separator + "New Folder";
        File directory = new File(folderPath);
        if (directory.exists()) {
            System.out.println("Directory already exists. Directory path: " + directory.getPath());
        }
        else {
            directory.mkdir();
            System.out.println("Directory is created. Directory path: " + directory.getPath());
        }
    }

}
