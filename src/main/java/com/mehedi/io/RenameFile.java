package com.mehedi.io;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        String oldFilePath = "D:" + File.separator + "mehedi" + File.separator + "files" + File.separator + "NewFile1.txt";
        String newFilePath = "D:" + File.separator + "mehedi" + File.separator + "files" + File.separator + "NewFile.txt";

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
