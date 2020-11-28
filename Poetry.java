package PoetryCount;

import java.io.*;
import java.util.Scanner;

public class Poetry {
    public static String poetry(String fileName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������Ҫͳ�Ƶ��ַ�:");
        char myChar = scanner.nextLine().charAt(0);
        int count = 0;
        Reader fileInputStream = null;
        String res = null;
        try {
            fileInputStream = new FileReader(fileName);
            int readData = 0;
            while ((readData = fileInputStream.read()) != -1) {
                if (readData == myChar) count++;
            }
            res = myChar + "���ַ�����Ϊ: " + count;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {
                try {
                    scanner.close();
                    fileInputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }
}
