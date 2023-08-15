package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.FileFilter;

public class FilterFile {

    public static void main(String[] args) {
        String directoryPath = FileConstants.BASE_PATH;
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory doesn't exist.");
        }
        else {
            FileFilter textFileFilter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String fileName = file.getName();
                    if (fileName.endsWith(".txt")) {
                        return true;
                    }
                    return false;
                }
            };

            File[] textFiles = directory.listFiles(textFileFilter);
            if (textFiles.length == 0) {
                System.out.println("No text file found.");
            }
            else {
                int i = 1;
                for (File file : textFiles) {
                    System.out.println(i++ + ". File name: " + file.getName());
                }
            }
        }
    }

}
