package com.company.lesson5.io;

import java.io.*;

public class FileReader {

    public static void main(String[] args) {
        try (InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\test\\test.txt"))) {
            while (bufferedInputStream.available() > 0) {
                char ch = (char) bufferedInputStream.read();
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
