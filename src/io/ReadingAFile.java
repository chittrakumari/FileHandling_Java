package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fobj=new FileInputStream("C:/Users/ChittraKumari/Desktop/inputfilestramPractice.txt");
        System.out.println("Contents of a File");
        int ch;
        while((ch=fobj.read())!=-1){
            System.out.print((char)ch);
        }
        fobj.close();
    }
}
