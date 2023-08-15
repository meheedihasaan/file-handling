package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class GetFileList {

    public static void main(String[] args) {
        String directoryPath = FileConstants.BASE_PATH;
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory not exists.");
        }
        else {
            File[] files = directory.listFiles();
            if (files.length == 0) {
                System.out.println("No file found.");
            }
            else {
                int i = 1;
                for (File file : files) {
                    System.out.println(i++ + ". File name: " + file.getName());
                }
            }
        }
    }

}
