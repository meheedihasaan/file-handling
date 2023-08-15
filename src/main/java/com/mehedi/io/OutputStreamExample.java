package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    //Write data to file. If file doesn't exist then first create a new file and then writes byte data into the new file

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "OutputFile.txt";
        String data = "Hello. I'm Mehedi Hasan. I'm from Rangpur city. Currently, I'm working as a Junior Software Engineer at Dhrubok Infotech Services Limited.";
        byte[] bytes = data.getBytes();
        OutputStream stream = null;
        try {
            stream = new FileOutputStream(filePath);
            stream.write(bytes);
            System.out.println("Data written in the file.");

            stream.flush();
            stream.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

}
