package com.mehedi.io;

import com.mehedi.constant.FileConstants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

    //Write character/text to file. If file doesn't exist then first create a new file and then writes character/text into the new file

    public static void main(String[] args) {
        String filePath = FileConstants.BASE_PATH + File.separator + "UnicodeOutputFile.txt";
        String data = "Hello. I'm Mehedi Hasan. I'm from Rangpur city. Currently, I'm working as a Junior Software Engineer at Dhrubok Infotech Services Ltd. হ্যালো. আমি মেহেদী হাসান। আমি রংপুর শহর থেকে এসেছি। বর্তমানে, আমি ধ্রুবক ইনফোটেক সার্ভিসেস লিমিটেডে জুনিয়র সফটওয়্যার ইঞ্জিনিয়ার হিসেবে কাজ করছি।";
        Writer writer = null;
        try {
            writer = new FileWriter(filePath);
            writer.write(data);
            System.out.println("Data written in the file.");

            writer.flush();
            writer.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

}
