package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "UnicodeTextFile.txt";
        Reader reader = null;
        try {
            reader = new FileReader(filePath);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print(c + ", ");
                System.out.print((char) c + ", ");
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
    }

}
