package Main;

import java.io.*;
import java.util.Scanner;
import Poem.Poem;
import PoetryCount.Poetry;

public class Main {
    public static void main(String[] args) throws IOException {
        Student stu = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名字:");
        String name = scanner.nextLine();
        stu.setName(name);
        System.out.print("请输入你的性别:");
        String gender = scanner.nextLine();
        stu.setGender(gender);
        System.out.print("请输入你的年龄:");
        int age = scanner.nextInt();
        stu.setAge(age);
        String path = "H:\\Work\\BIPT.txt";
        StringBuilder poem = Poem.poems(path);
        String content = "姓名:" + stu.getName() + "\n性别:" + stu.getGender() + "\n年龄:" + stu.getAge() + "\n\n" + poem;
        try(Writer writer = new FileWriter("H:\\Work\\A.txt")) {
            writer.write(content);
        }
        String res = Poetry.poetry(path);
        System.out.println(res);
        System.out.println("数据已成功写入A.txt文件！");
    }
}

class Student{
    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }
}

