package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        String oldFilePath = FileConstants.BASE_PATH + File.separator + "NewFile1.txt";
        String newFilePath = FileConstants.BASE_PATH + File.separator + "NewFile.txt";

        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);
        if (!oldFile.exists()) {
            System.out.println("Old file not exists.");
        }
        else {
            boolean isRenamed = oldFile.renameTo(newFile);
            if (isRenamed) {
                System.out.println("File is renamed. \nOld file name: " + oldFile.getName() + "\nNew file name: " + newFile.getName());
            }
            else {
                System.out.println("File rename failed.");
            }
        }
    }

}
