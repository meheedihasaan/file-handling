package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class DeleteDirectory {

    //It will delete the directory only if the directory exists and it contains zero file or directory

    public static void main(String[] args) {
        String directoryPath = FileConstants.BASE_PATH + File.separator + "New Folder";
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory doesn't exist.");
        }
        else {
            boolean isDeleted = directory.delete();
            if (isDeleted) {
                System.out.println("Directory is deleted.");
            }
            else {
                System.out.println("Directory deletion failed.");
            }
        }
    }

}
