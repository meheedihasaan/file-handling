package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;

public class DeleteFile {

    //This will immediately delete the file

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "NewFile.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
        }
        else {
            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File is deleted.");
            }
            else {
                System.out.println("File deletion failed.");
            }
        }
    }

}
